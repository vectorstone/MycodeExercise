#1、创建数据库day01_test04db
create database day01_test04db;
use day01_test04db;
#2、创建表格employee，并添加记录
create table employee
(
   id int(5),
   name varchar(32),
   sex enum('男','女'),
   tel varchar(32),
   addr varchar(32),
   salary double
);
insert into
employee(id,name,sex,tel,addr,salary)
values
(10001,'张一一','男','13456789000','广东韶关',1001.58),
(10002,'刘小红','女','13454319000','广东江门',1201.21),
(10003,'李四','男','0751-1234567','广东佛山',1004.11),
(10004,'刘小强','男','0755-5555555','广东深圳',1501.23),
(10005,'王艳','女','020-1232133','广东广州',1405.16);

#要求3：查询出薪资在1200~1300之间的员工信息。
select id,name,sex,tel,addr,salary from employee where salary between 1200 and 1300;
#要求4：查询出姓“刘”的员工的工号，姓名，家庭住址。
select id,name,addr from employee where name like '刘%';
#要求5：将“李四”的家庭住址改为“广东韶关”
update employee
set addr = '广东韶关'
where name = '李四';
#要求6：查询出名字中带“小”的员工
select id,name,addr,salary from employee where name like '%小%';