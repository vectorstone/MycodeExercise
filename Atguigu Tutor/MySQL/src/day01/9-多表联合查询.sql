/*
 多表联合查询有三种方式:
 1. union语句也可以实现多表查询，纵向合并多个表格
 2. from后面跟多个数据源(不常用)
 3. join...on多表联合查询(常用)
*/
use demo;
create table person
(
    pid   int primary key auto_increment,
    pname varchar(32),
    city  varchar(16),
    age   int
);

create table human
(
    hid   int primary key auto_increment,
    hname varchar(32),
    city  varchar(16),
    age   int
);

/*
 union用来将多个查询结构拼接成为一个
    1. 要求字段的个数一定一致
    2. 如果两个查询结果里有相同的数据，会自动去重
    3. 字段名可以不同，查询结果的表头会使用前面的字段名
    4. 字段的类型可以不同，查询的结果会以varchar的形式显示
*/
select *
from human
union
select *
from person;

use atguigu;
/*
 from语句实现多个表实现联合查询,它的结果和  join...on 结果是一样的!
*/
-- 查询员工的姓名,薪资,部门id,部门名称,部门描述
select ename, salary, t_employee.did as x, t_department.did as y, dname, description
from t_employee,
     t_department
where t_employee.did = t_department.did;
-- 查询的结果是一个笛卡尔积

/*
 on实现多表查询(重点):
    1. join...on: 和from添加多个源一样实现的结果一样。推荐使用  jon...on
        内连接 join 等价于 inner join, inner可以省略
        取的是左表和右表共有的数据
    2. left join: 左外连接，等价于 left outer join,outer可以省略
        取左右表共有以及左表特有的数据
    3. right join: 右外连接，等价于 right outer join, outer可以省略
        取做左右表共有以及右表特有的数据
    4. full join: 全连接,左右表所有的数据， mysql不支持全连接

*/
-- 查询员工的姓名,薪资,部门id,部门名称,部门描述
select eid, ename, salary, t_employee.did, dname, description
from t_employee /*inner*/
         join t_department on t_employee.did = t_department.did;

select eid, ename, salary, t_employee.did, dname, description
from t_employee
         left /*outer*/
         join t_department on t_employee.did = t_department.did;

select eid, ename, salary, t_employee.did, dname, description
from t_employee
         right /*outer*/
         join t_department on t_employee.did = t_department.did;


(select eid, ename, salary, t_employee.did, dname, description
 from t_employee
          left join t_department on t_employee.did = t_department.did)
union
(select eid, ename, salary, t_employee.did, dname, description
 from t_employee
          right join t_department on t_employee.did = t_department.did);


select eid, ename, salary, t_employee.did, dname, description
from t_employee
         left /*outer*/
         join t_department on t_employee.did = t_department.did
where dname is null;

select eid, ename, salary, t_employee.did, dname, description
from t_employee
         right join t_department on t_employee.did = t_department.did
where eid is null;


select eid, ename, salary, t_employee.did, dname, description
from t_employee
         left join t_department on t_employee.did = t_department.did
where dname is null
union
select eid, ename, salary, t_employee.did, dname, description
from t_employee
         right join t_department on t_employee.did = t_department.did
where eid is null;