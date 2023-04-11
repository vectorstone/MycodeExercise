#1.创建数据库day01_test03_company
create database day01_test03_company;
#2、创建表格offices
use day01_test03_company;
create table offices
(
  officeCode int,
  city varchar(30),
  address varchar(50),
  country varchar(50),
  postalCode varchar(25)
);
#3、创建表格employees
create table employees
(
  empNum int(11),
  lastName varchar(50),
  firstName varchar(50),
  mobile varchar(25),
  code int,
  jobTitle varchar(50),
  birth date,
  Note varchar(255),
  Sex varchar(5)
);
#要求4：将表employees的mobile字段修改到code字段后面。
alter table employees modify mobile varchar(25) after code;
#要求5：将表employees的birth字段改名为birthday;
alter table employees change birth birthdy date;
#要求6：修改sex字段，数据类型为char（1）。
alter table employees change sex sex char(1);
#要求7：删除字段note；
alter table employees drop note;
#要求8：增加字段名favoriate_activity，数据类型为varchar（100）；
alter table employees add favoriate_activity varchar(100) after sex;
#要求9：将表employees的名称修改为 employees_info
alter table employees rename to employees_info;