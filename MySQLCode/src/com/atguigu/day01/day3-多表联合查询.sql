-- 多表联合查询

use atguigu;

show tables;

select ename, eid
from t_employee
union
select dname, description
from t_department;

-- 1.from的多表联合查询
-- 查询员工的姓名,薪资,部门id,部门名称,部门描述
select eid, ename, salary, dname, description, t_employee.did, t_department.did
from t_employee,
     t_department;

-- 注意区分这两种写法的区别

-- 查询员工的姓名,薪资,部门id,部门名称,部门描述
select eid, ename, salary, dname, description, t_employee.did, t_department.did
from t_employee,
     t_department
where t_employee.did = t_department.did;

-- 2.join ... on多表联合查询
-- [inner] join(两个表共有的)内连接多表查询,inner可以省略
-- 查询员工的姓名,薪资,部门id,部门名称,部门描述
select eid, ename, salary, t_employee.did, td.dname, td.description
from t_employee
         join t_department td on t_employee.did = td.did
order by eid;

-- left [outer] join on 查询两个表共有的,以及左表独有的
select eid, ename, salary, t_employee.did, td.dname, td.description
from t_employee
         left join t_department td on td.did = t_employee.did
order by eid;

-- right [outer] join on 查询两个表共有的,以及右表独有的
select eid, ename, salary, t_employee.did, td.dname, td.description
from t_employee
         right join t_department td on td.did = t_employee.did
order by eid;

-- 自连接
select x.eid,x.ename,x.salary,x.mid,y.ename
from t_employee as x
join t_employee as y on x.mid = y.eid
order by x.eid;


-- where语句练习


-- group by语句的练习 聚合函数通常和group一起使用
-- 查看各部门的平均工资,不显示部门名称
select did,avg(salary)
from t_employee
group by did;

-- 查看各部门的平均工资,显示部门名称,join on的多表查询
select t_department.did,t_department.dname,avg(salary)
from t_employee
join t_department on t_employee.did = t_department.did
group by did;

-- 查看后勤部的平均工资,显示部门名称
select t_department.did,t_department.dname,avg(salary)
from t_employee
         join t_department on t_employee.did = t_department.did
where t_department.dname = '后勤部'
group by did;

select ename, salary, gender
from t_employee
group by gender;
#正确写法
-- 分组通常都要配合聚合函数使用
select group_concat(ename), round(avg(salary), 2) avg_salary, gender
from t_employee
group by gender;

-- 可以使用多个字段进行分组
select did, gender, avg(salary), group_concat(ename)
from t_employee
group by did,gender;

-- group by练习1
-- 查询每个部门男女的平均工资，查询结果显示 部门id,部门名称,平均工资,人数以及员工的名字
# group_concat必须和cooncat一起使用
select te.did,gender,td.dname,group_concat(ename),avg(salary),count(*)
from t_employee te
join t_department td on te.did = td.did
group by te.did,gender;

-- 查询每个部门男女的平均工资，查询结果显示 部门id,部门名称,平均工资,人数以及员工的名字
select t_employee.did, dname, gender, avg(salary), group_concat(ename)
from t_employee
         join t_department td on t_employee.did = td.did
where gender = '男'
group by td.did, gender;


-- group by练习2
-- 查询每个部门的平均薪资，显示部门编号，部门名称，如果该部门没有员工，平均工资显示为0
select te.did,dname,ifnull(avg(salary),0),group_concat(ename)
from t_employee te
right join t_department td on te.did = td.did
group by td.did;

select td.did, dname, ifnull(avg(salary), 0), group_concat(ename)
from t_employee
         right join t_department td on t_employee.did = td.did
group by td.did;

# 统计部门人数,按部门排序
SELECT did, COUNT(*)
FROM t_employee
GROUP BY did;
#按照部门统计人数，并合计总数
SELECT ifnull(did, '没有部门') as '部门编号', COUNT(*) as '人数'
FROM t_employee
GROUP BY did
WITH ROLLUP;


-- having的使用

select ename from t_employee
where gender = '女';

select ename from t_employee
having gender = '女';

select eid as i, ename, salary, tel
from t_employee
having i > 5;

select eid as i, ename, salary, tel
from t_employee
where i > 5;


/*查询每一个部门的女员工的平均薪资，显示部门编号，部门的名称
该部门的平均薪资,最后只显示平均薪资高于12000的部门信息*/

-- 先查询每一个部门的平均薪资,显示部门编号,部门名称,有avg聚合函数,需要搭配group by使用
select te.did,dname,avg(salary)
from t_employee te
join t_department td on te.did = td.did
group by te.did;

-- 增加女员工和大于12000的要求
select te.did,dname,avg(salary) "salary_level"
from t_employee te
         join t_department td on te.did = td.did
where gender = '女'
group by te.did
having salary_level > 12000;


# 查询每一个部门的男和女员工的人数
select did,gender,count(*)
from t_employee
group by did,gender;

# 查询每一个部门的男和女员工的人数，显示部门编号，部门的名称，性别，人数
select td.did,dname,gender,count(*)
from t_employee te
join t_department td on te.did = td.did
group by did,gender;

#查询每一个部门薪资超过10000的男和女员工的人数，显示部门编号，部门的名称，性别，人数  只显示人数低于3人
select td.did,dname,gender,count(*) r,avg(salary)
from t_employee te
         join t_department td on te.did = td.did
group by did,gender
having r < 3;

-- order by
select eid, ename, salary
from t_employee
order by salary,eid;


#查询每一个部门薪资超过10000的男和女员工的人数，显示部门编号，部门的名称，性别，人数
#只显示人数低于3人，按照人数升序排列
select td.did,dname,gender,count(*) r,avg(salary) "salary_level"
from t_employee te
join t_department td on te.did = td.did
group by td.did,gender
having r < 3 and salary_level > 10000
order by r;


select td.did, dname, gender, count(*) as c
from t_employee
         join t_department td on t_employee.did = td.did
where salary > 10000
group by did
having c < 3
order by c;

-- limit
select *
from t_employee
limit 10, 6;

select *
from t_employee
limit 10 offset 6;

#查询每一个编号为奇数的部门，显示部门编号，名称，员工数量，
#只显示员工数量> 3的结果，按照员工数量升序排列，
#每页显示2条，显示第1页

select te.did,dname,count(*) count
from t_employee te
join t_department td on td.did = te.did
group by te.did
having count > 3 and te.did / 2 != 0
order by count
limit 0,2;