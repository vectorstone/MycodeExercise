/*
DDL:数据定义语言 Data Definition Language, 没有涉及到数据的操作，只是数据库和表结构操作
包括动词CREATE和DROP。在数据库中创建新表或删除表（CREAT TABLE 或 DROP TABLE）；为表加入索引等。
*/
show databases;  -- 显示所有的数据库
use demo;  -- 切换到指定的数据库
show tables;  -- 显示当前数据库里所有的表格
show tables from demo;  -- 显示指定数据库里所有的表格

-- mysql5.7默认的编码方式是latin1码，不支持中文，在创建数据库时一定要指定编码方式。
create database test charset utf8;  -- 创建一个名字为test的数据库,并指定编码方式为utf8

create database test; -- mysql8.0 可以不指定编码方式，默认的编码方式是 utf8mb4

show create database test;  -- 显示数据库的建库语句

use test;

/*建表语句结构:
 create table [dbname.]tableName(
    字段名1 类型 约束,
    字段名2 类型 约束
    ... ... ... ... ...
);*/

create table test.person(
    pid int primary key auto_increment,
    pname varchar(32),
    age tinyint unsigned,
    gender enum('男','女','保密'),
    height double,
    married bool,
    birthday date
); -- 创建了一个 person表

desc person;  -- 显示表结构: 字段名，字类型以及约束
show create table person; -- 查看表的建表语句

drop table person;  -- 删除表格
drop database test; -- 删除数据库
