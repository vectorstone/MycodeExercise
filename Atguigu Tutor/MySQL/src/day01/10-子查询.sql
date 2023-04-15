/*
 所谓子查询就是在查询语句里还有一个查询，无论是哪种形式的子查询都要加 ()
 子查询分为:  select型 / from型 /  where/having型 / exists型
*/

/*
 select型:
    一个 select语句，可以出现另一个 select,update,delete 语句里，作为子查询
*/
# 在 t_employee 表中查询每个人薪资和公司平均薪资的差值，并显示员工薪资和公司平均薪资相差5000元以上的记录。
select ename, salary, salary - (select avg(salary) from t_employee) as diff
from t_employee
having abs(diff) > 5000;

# （2）在t_employee表中查询每个部门平均薪资和公司平均薪资的差值。
select td.did, dname, avg(salary) - (select avg(salary) from t_employee) as diff
from t_employee
         join t_department td on t_employee.did = td.did
group by did;

/*
 from型子查询: 一个子查询在另一个语句里的from里作为数据源，这个子查询必须要有别名
*/
# （1）在“t_employee”表中查询每个部门中薪资排名前2的员工姓名、部门编号和薪资
select *
from (select ename, did, salary, rank() over (partition by did order by salary desc) as r
      from t_employee
      where did is not null) as tmp
where tmp.r <= 2;

# 在“t_employee”表中查询每个部门最低3个薪资值的女员工姓名，部门编号，部门名称,薪资值。
select *
from v_depart_female_salary
where r <= 3;

create view v_depart_female_salary as
(
select eid, ename, dname, gender, salary, te.did, rank() over (partition by td.did order by salary) as r
from t_employee as te
         join t_department td on te.did = td.did
where gender = '女');

# 视图表: 将一个SQL语句的查询结果存入到一个视图表  create view v_name as (查询语句);
-- 创建一个视图表，将一个查询结果存入到视图表中
create view v_employee as
(
select te.*, td.description as dd, td.dname, jname, tj.description as jd
from t_employee as te
         join t_job tj on tj.jid = te.job_id
         join t_department td on te.did = td.did
order by eid);

drop view v_employee;

select *
from v_employee
where gender = '女'
  and salary > 10000;

# 在“t_employee”表中查询全公司薪资排名前3的员工姓名，部门编号，薪资值。
select ename, did, salary
from t_employee
order by salary desc
limit 3;

# 在“t_employee”表中，查询每个部门的平均薪资，显示所有部门的部门编号、部门名称、部门平均薪资。
# select te.did,dname,salary from t_employee as te join t_department td on te.did = td.did;
select did, dname, avg(salary)
from v_employee
group by did;

select did, dname, avg(salary)
from (select salary, te.did, dname
      from t_employee as te
               join t_job tj on tj.jid = te.job_id
               join t_department td on te.did = td.did) as tmp
group by tmp.did;


# where和having子查询:当一个查询结果成为另一个查询语句的判断条件
# （1）在“t_employee”表中查询薪资最高的员工姓名（ename）和薪资（salary）。
select ename, salary
from t_employee
where salary = (select min(salary) from t_employee);

#（2）在“t_employee”表中查询比全公司平均薪资高的男员工姓名和薪资
select ename, salary
from t_employee
where salary > (select avg(salary) from t_employee);

# （3）在“t_employee”表中查询和“白露”，“谢吉娜”同一部门的员工姓名和电话。
# 当子查询的结果不止一行数据时，不能再使用 =
select ename, tel, did
from t_employee
where did in (select did
              from t_employee
              where ename = '白露'
                 or ename = '谢吉娜');

# （4）在“t_employee”表中查询薪资比“白露”，“李诗雨”，“黄冰茹”三个人的薪资都要高的员工姓名和薪资
# 查询结果超过一行数据，不能直接使用 >
select ename, salary
from t_employee
where salary > any (select salary
                    from t_employee
                    where ename in ('白露', '李诗雨', '黄冰茹'));

select ename, salary
from t_employee
where salary > (select min(salary)
                from t_employee
                where ename in ('白露', '李诗雨', '黄冰茹'));

#（5）显示部门平均工资比全公司的总平均工资高的部门编号、部门名称、部门平均薪资，并按照部门平均薪资升序排列。
select te.did, dname, avg(salary) as x
from t_employee as te
         join t_department td on te.did = td.did
group by did
having x > (select avg(salary)
            from t_employee)
order by x;

/*
 exists:
    1. exists 子句里的条件判断和外查询字段没有关系
        系统将对子查询进行运算以判断它是否返回行，如果至少返回一行，那么EXISTS的结果为true，此时外层查询语句将进行查询；
        如果子查询没有返回任何行，那么EXISTS的结果为false，此时外层查询语句不进行查询
    2.
*/
#（1）查询“t_employee”表中是否存在部门编号为NULL的员工，如果存在，查询“t_department”表的部门编号、部门名称。
select did, dname
from t_department
where exists(select did from t_employee where did is null);

# （2）查询“t_department”表是否存在与“t_employee”表相同部门编号的记录，如果存在，查询这些部门的编号和名称。
select did, dname
from t_department
where exists(select * from t_employee where t_employee.did = t_department.did);

select distinct td.did,dname from t_department as td join t_employee te on td.did = te.did;