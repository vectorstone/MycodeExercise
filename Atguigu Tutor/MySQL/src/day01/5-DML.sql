/*DML: 数据操作语言Data Manipulation Language
 对数据进行增删改查操作，查询的操作比较重要且常用，把 查询的操作独立成为 DQL
 DQL也属于是 DML的一种
*/

use test;

desc student;

-- 添加数据
insert into student(pname,age) value('jack',18); -- 向表里的指定字段插入数据
insert into student value(0,'jerry',19,80,'湖南'); -- 向表里所有的字段都插入数据，可以省略字段列表
insert into student values(0,'henry',17,81,'江苏'),(0,'merry',19,85,'浙江');  -- 向表里插入多条数据

-- 修改数据
update student set age=18 where pname='jack';
update student set age=age-2 where pname='merry';

-- 删除数据
delete from student where pid=5;

-- 清空表里的数据
delete from student; -- 一行一行的删除数据，如果再重新添加数据，自增的键会继续，可以回滚
truncate student;  -- 把表删除，再重新建表。如果重新添加数据，自增的键重1开始，不能回滚

-- 复制一个表里的数据
create table xuesheng like student;  -- 创建一个xuesheng表，和student表结构一样
insert into xuesheng select * from student;

/*
数据库的备份: 使用mysqldump.exe可以备份一个数据库
在windows环境里，执行
    C:\Users\70794>mysqldump -uroot -p test > test.sql
将 test数据库备份到了 test.sql文件里

恢复数据有两种方式:
    方式一: 在windows环境里，执行 mysql -uroot -p 数据库名 < 文件名
    方拾二: 在 mysql 客户端里，执行
        mysql> source C:\Users\70794\Desktop\test.sql 命令
*/
create database test;

