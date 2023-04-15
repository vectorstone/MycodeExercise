/*
DQL: 数据查询语言Data Query Language
基本的查询语句就是 select语句
七大子语句: from / on / where / group by  / having / order by / limit

语句的顺序:
    select ... from ... join...on...where... group by
*/

use atguigu;

/*from 后面指定数据源，可以是一个表，也可以是多个表(多表联合查询)，还可以是一个查询结果(子查询)
 在mysql里from语句在某些情况下可以没有;但是在有一些SQL类型里，如果没有from会报错

 dual表示一个虚拟的不存在的表，意义就是为了保证SQL语句的完整性。

 distinct 用来去掉重复的数据*/
select 1 + 1
from dual;
select distinct *
from demo.t4;
-- distinct用来去重

-- select 字段1,字段2... from tableName [where 条件];
# 1. from
select eid, ename, salary
from t_employee
where eid > 5
  and eid <= 10;
select *
from t_job;
-- 如果想要查询所有的字段，可以使用 *

/*
2. join...on子句: 多表联合查询，前提是多个表之间有关联关系
    inner join: 内连接,获取两个表共有的数据, inner可以省略
    left outer join: 左外连接，获取两个表共有以及左表特有的数据,outer可以省略
    right outer join: 右外连接，获取两个表共有以及右表特有的数据,outer可以省略
    full outer join: 全连接，mysql不支持
*/
-- 联合查询 t_employee和t_job表，并找到 job_id和jid相等的数据
select eid, ename, salary, job_id, jname
from t_employee
         join t_job on t_employee.job_id = t_job.jid
order by eid;

-- 查询eid,ename,salary,job_id,jname,did,dname
select eid, ename, salary, job_id, jname, t_employee.did, dname
from t_employee
         join t_job
         join t_department on t_employee.job_id = t_job.jid and t_employee.did = t_department.did
order by eid;

-- 自连接: 自己和自己连接,自连接需要起别名
select x.eid, x.ename, x.salary, x.mid, y.ename
from t_employee x
         join t_employee as y on x.mid = y.eid
order by eid;


/*
3. where语句: 用来设定过滤条件
    where过滤条件使用到的字段可以不出现在查询结果里
*/
select eid, ename, salary
from t_employee
where gender = '女';
select *
from t_employee
where job_id is null;
select *
from t_employee
where birthday between '1980-01-01' and '1989-12-31';

/*
 4. group by 语句用来进行分组，通常要配合聚合函数来使用
*/
-- 查询后勤部的平均工资
select did, avg(salary)
from t_employee
group by did;

-- 查看后勤部的平均工资
select t_employee.did, dname, avg(salary)
from t_employee
         join t_department td on t_employee.did = td.did
where dname = '后勤部'
group by did;

-- 不好的写法: 分组以后，查询的结果集里有分组依据外的其他字段，并且没有使用聚合函数。
-- 在某些MySQL的版本里，这个SQL语句会报错!
select ename, salary, gender
from t_employee
group by gender;

-- 分组通常都要配合聚合函数使用
select group_concat(ename), round(avg(salary), 2) avg_salary, gender
from t_employee
group by gender;

-- 可以使用多个字段进行分组
select did, gender, avg(salary), group_concat(ename)
from t_employee
group by did, gender;

-- 查询每个部门男女的平均工资，查询结果显示 部门id,部门名称,平均工资,人数以及员工的名字
select t_employee.did, dname, gender, avg(salary), group_concat(ename)
from t_employee
         join t_department td on t_employee.did = td.did
where gender = '男'
group by td.did, gender;

-- 查询每个部门的平均薪资，显示部门编号，部门名称，如果该部门没有员工，平均工资显示为0
select td.did, dname, ifnull(avg(salary), 0), group_concat(ename)
from t_employee
         right join t_department td on t_employee.did = td.did
group by td.did;

SELECT did, COUNT(*)
FROM t_employee
GROUP BY did;
#按照部门统计人数，并合计总数
SELECT ifnull(did, '总计') as '部门编号', COUNT(*) as '人数'
FROM t_employee
GROUP BY did
WITH ROLLUP;

/*
 5. having子句也是用来设定过滤条件，用法和where类似
 只能使用where不能使用having的场景:
    如果判断条件使用的字段不在查询的结果集里，就只能使用where
 只能使用having不能使用where的场景:
    1. 如果判断条件使用了查询结果的别名，只能使用having
    2. having的判断条件可以使用聚合函数，where判断条件不能使用聚合函数
*/
select *
from t_employee
where gender = '女';
select *
from t_employee
having gender = '女';

select eid, ename, salary, tel
from t_employee
where gender = '女';

select eid as i, ename, salary, tel
from t_employee
having i > 5;

-- 查询性别为女，平均新增大于12000的各部门的编号和平均工资
select did, avg(salary) as x
from t_employee
where gender = '女'
group by did
having x > 12000;

#查询每一个部门的女员工的平均薪资，显示部门编号，部门的名称，该部门的平均薪资,最后只显示平均薪资高于12000的部门信息
select td.did, dname, avg(salary)
from t_employee as te
         join t_department as td on te.did = td.did
where gender = '女'
group by did
having avg(salary) > 12000;

# 查询每一个部门的男和女员工的人数
select did, gender, count(*)
from t_employee
group by did, gender
order by did;

# 查询每一个部门的男和女员工的人数，显示部门编号，部门的名称，性别，人数
select td.did, dname, gender, count(*)
from t_employee
         join t_department td on t_employee.did = td.did
group by did, gender
order by did;

#查询每一个部门薪资超过10000的男和女员工的人数，显示部门编号，部门的名称，性别，人数  只显示人数低于3人
select t_employee.did, dname, gender, count(*) as c
from t_employee
         join t_department td on t_employee.did = td.did
where salary > 10000
group by td.did, gender
having c < 3;

/*
 6. order by:按照指定的字段进行排序
    asc 表示升序排序，默认就是升序; desc 表示降序排序
    还可以使用多个字段进行排序
 order by 还可以用在 rank() 窗口函数 over()里，定义排名的规则
*/
select eid, ename, salary
from t_employee
order by salary, eid desc;

#查询每一个部门薪资超过10000的男和女员工的人数，显示部门编号，部门的名称，性别，人数
#只显示人数低于3人，按照人数升序排列
select td.did, dname, gender, count(*) as c
from t_employee
         join t_department td on t_employee.did = td.did
where salary > 10000
group by did
having c < 3
order by c;

/*7. limit语句: 限制读取的数据个数
通常配合 offset 语句，实现分页查询
  limit m offset n: 跳过n个元素，查询m个元素
  limit m,n: 跳过 m 个元素，查询 n 个元素

  每页显示count个数据，第page也显示的数据:
    select * from t_employee limit count offset (page-1)*count;
    select * from t_employee limit (page-1)*count,count;
*/
select *
from t_employee
limit 10 offset 6;
select *
from t_employee
limit 10, 6;

#查询每一个编号为奇数的部门，显示部门编号，名称，员工数量，
#只显示员工数量> 3的结果，按照员工数量升序排列，
#每页显示2条，显示第1页
select td.did, dname, count(*) as c
from t_employee
         join t_department td on t_employee.did = td.did
where td.did % 2 != 0
group by did
having c > 3
order by c
limit 0,2;