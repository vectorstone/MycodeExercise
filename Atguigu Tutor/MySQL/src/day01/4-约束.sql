/*
 约束是用来对数据业务规则和数据完整性进行实施、维护，可以给数据库里的字段添加约束
     主键约束: primary key
     自增约束: auto increment
     唯一约束: unique
     非空约束: not null
     默认值约束: default
     检查约束: check
     外键约束: foreign key  慎用

 索引: 在MySQL中键约束(主键和唯一约束)会自动创建索引，可以提高查询效率
*/

show create table demo.student; -- 查看建表语句可以看到表里的约束
SELECT * FROM information_schema.table_constraints WHERE table_name = 'student'; -- 也可以查看表里的约束


/*
 主键约束:
    1. 自带非空约束，不允许为空
    2. 自带唯一约束，不允许重复
    3. 一个表里最多只能有一个主键
    4. 主键可以是一个字段，也可以是多个字段作为联合主键
 */
use test;
drop table person;

create table person(
    pid int primary key  -- 使用pid作为主键
);

create table person(
    pid int ,
    name varchar(32),
    primary key (pid,name)  -- 设置pid和name作为联合主键
);

create table person(pid int);
alter table person add primary key (pid);  -- 追加主键
alter table person drop primary key;  -- 删除主键


/*
 自增约束:
    1. 自增约束的字段必须要是int类型
    2. 一个表里最多只能有一个自增字段，而且这个字段必须要被定义为 key
    3. 通常会将主键设置为自增
    4. 添加数据时，可以指定值，如果想使用自增的值，可以写null或者0
 */
create table person(
    pid int auto_increment,
    pname varchar(32),
    primary key (pid,pname)
);


/*
唯一约束:
    1. 被唯一约束的字段不允许出现重复的值
    2. 允许出现 null,而且null可以重复出现
    3. 唯一约束的字段会自动添加  key 约束
*/
create table person(
    pid int primary key auto_increment,
    pname varchar(32) unique
);
alter table person drop key pname;  -- 删除唯一约束

/*
非空约束: 被not null约束的字段不能为null
*/
create table person(
    pid int primary key auto_increment,
    pname varchar(32) unique not null
);

/*
 默认值约束: 数据库里的数据如果没有值，默认值是 null
 如果不指定值就使用默认值；如果设置值就使用指定的值
*/
create table person(
    pid int primary key auto_increment,
    pname varchar(32) unicode not null,
    age int default 0
);

-- 检查约束
create table student(
    pid int primary key auto_increment,
    pname varchar(32) unique not null,
    age int default 0,
    score int check (score>= 0 and score <= 100)
);

create table province(
    province_id int primary key auto_increment,
    province_name varchar(16) unique not null ,
    capital varchar(16)
);
insert into province values(0,'湖北','武汉'),(0,'湖南','长沙'),(0,'河南','郑州'),(0,'浙江','杭州'),(0,'江苏','南京');

/*
 外键约束: 当一个表A的字段可选值从另一个表B里的选择时，可以使用外键约束。A表称为从表,B表示主表
    1. 主表和从表依赖的字段类型必须要一致
    2. 主表里被关联的字段，必须要添加 unique唯一约束
    4. 从表里的值必须是主表里出现的值
    5. 外键还可以设置约束等级
*/
create table student(
    pid int primary key auto_increment,
    pname varchar(32) unique not null,
    age int default 0,
    score int check (score>= 0 and score <= 100),
    shengfen varchar(16),
    foreign key (shengfen) references province(province_name)
    /*on delete cascade  -- 当主表删除时，从表的数据也删除
    on update set null  -- 当主表修改是，从表的数据设置为null*/
);
insert into student values(0,'张三',18,90,'湖北'),(0,'李四',20,95,'江苏'),(0,'王五',19,91,'浙江');
