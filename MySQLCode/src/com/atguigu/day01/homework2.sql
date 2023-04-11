create database day01_test02_market;
use day01_test02_market;
create table customers
(
  c_num int(11),
  c_name varchar(50),
  c_contact varchar(50),
  c_city varchar(50),
  c_birth date
);
#要求3将c_contact字段移动到c_birth字段后面
alter table customers modify c_contact varchar(50) after c_birth;
#要求4：将c_name字段数据类型改为 varchar(70)
alter table customers modify c_name varchar(70) default null comment '修改c_name字段数据类型为varchar(70)';
#要求5：将c_contact字段改名为c_phone
alter table customers change c_contact c_phone varchar(50);
#要求6：增加c_gender字段到c_name后面，数据类型为char(1)
alter table customers add c_gender char(1) after c_name;
#要求7：将表名改为customers_info
alter table customers rename to customers_info;
#要求8：删除字段c_city
alter table customers_info drop c_city;