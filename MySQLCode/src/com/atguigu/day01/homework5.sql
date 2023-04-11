#1、创建数据库day01_test05db
create database day01_test05db;
use day01_test05db;
#2、创建表格pet
create table pet
(
    name varchar(20),
    owner varchar(20),
    species varchar(20),
    sex char(1),
    birth year,
    death year
);
#3、添加记录
insert into
pet(name,owner,species,sex,birth,death)
values
('Fluffy','harold','Cat','f',2003,2010),
('Claws','gwen','Cat','m',2004,null),
('Buffy',null,'Dog','f',2009,null),
('Fang','benny','Dog','m',2000,null),
('bowser','diane','Dog','m',2003,2009),
('Chirpy',null,'Bird','f',2008,null);
#4、 添加字段主人的生日owner_birth。
alter table pet add owner_birth date after owner;
#5、 将名称为Claws的猫的主人改为kevin
update pet
set owner = 'kevin'
where name = 'Claws';
#6、 将没有死的狗的主人改为duck
update pet
set owner = 'duck'
where death is null and species = 'Dog';
#7、 查询没有主人的宠物的名字；
select name from pet
where owner is null;
#8、 查询已经死了的cat的姓名，主人，以及去世时间；
select name,owner,death from pet
where !(death <=> null) and species = 'Cat';
#9、 删除已经死亡的狗
delete from pet
where species = 'Dog' and !(death <=> null);
#10、查询所有宠物信息
select * from pet;