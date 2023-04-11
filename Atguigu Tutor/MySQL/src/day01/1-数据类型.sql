#我是MySQL里的注释，使用 #表示单行注释
-- 我也是MySQL里的单行注释，使用两个 中横线+空格
/*
我是MySQL里的多行注释
和java里的多行注释格式一样
*/

create database demo; -- 创建一个数据库
use demo; -- 切换到demo数据库

create table student
(
    id       int primary key auto_increment,
    name     varchar(32),
    gender   enum ('男','女','保密'),
    age      tinyint unsigned,
    score    int check ( score >= 0 and score <= 100 ),
    hobbies  set ('抽烟','喝酒','烫头','唱跳','RAP','篮球'),
    birthday date,
    height   double,
    married  boolean
);
/*1. 整型:
    tinyint 占用1个字节，类比为java里的byte
    smallint 占用2个字节,类比为java里的short
    mediumint 占用3个字节
    int/integer 占用4个字节，类比为java里int
    bigint 占用8个字节，类比为java里的long
    整型有五个类型，再加上 unsigned 一共有10种整数类型
    unsigned 表示无符号数，最高位不再当做符号位，而是数字位

tinyint  --> 0b11100000  --> 负数
tinyint unsigned --> 0b11100000 --> 正数

zerofill 如果不够n位，前面使用0补齐*/
drop table t1;
create table t1
(
    c1  tinyint,
    c2  smallint,
    c3  mediumint,
    c4  integer,
    c5  bigint,
    age tinyint unsigned, -- [0,255]
    c6  int(10) zerofill
);

select *
from t1;

/*2. 布尔类型: 在MySQL里没有布尔类型，使用true 和 false表示布尔类型的值
  MySQL其实没有布尔类型，使用数字来表示   0表示false, 非0表示true
*/
create table t2
(
    c1 bool,
    c2 boolean
);
insert into t2
values (true, false);
select *
from t2
where c2 is true;

/*3. 浮(定)点型，小数类型
    float / double 浮点型
    decimal(M,N) 定点型  总长度是M位，小数点后面保留N位
*/
create table t3
(
    id int primary key auto_increment,
    c1 float,
    c2 double,       -- 浮点数推荐使用double
    c3 decimal(5, 2) -- 定点数:小数点的位置固定
);

/*4. 字符串型
    char(n)
    varchar(n)  推荐
相同点:
    n表示的是最多允许的长度，单位都是字符
不同点:
    1. char 占用的长度是固定的   char(10) 存入了一个字母'a'占用的长度是10
    varchar(10)  存入一个字母 'a' 占用的长度不到10
    2. 最大长度n的取值范围:
        char类型的n最大是 255; varchar类型的n最大值是65535,具体的取值由表的编码方式决定
    3. 对于空格的处理不同
        char会保留左边的空格，但是右边的空格在存储时会自动去掉; varchar左右的空格都会保留
  */
create table t4
(
    c1 char(20),
    c2 varchar(20)
);
insert into t4
values ('   zhangsan    ', '   zhangsan    ');
select length(c1), length(c2)
from t4;

create table t5
(
    c1 varchar(16383)
) charset utf8mb4;

-- utf8mb3使用21845报错    utf8mb4使用16383不报错

# 5. 枚举类型: 多选一
create table t6
(
    gender enum ('男','女','保密')
);
-- 在插入数据时，可以直接使用值，也可以使用编号，编号从1开始


/*6. 集合类型: 多选多
添加数据时，多个选项中间使用  逗号, 分割
也可以使用数字， 数字的值是  1 2 4 8 16 32 ...
set里的可选项最多支持 64个*/
create table t7
(
    hobbies set ('抽烟','喝酒','烫头','唱跳','RAP','篮球')
);

/*7. 时间类型:
    year
    date
    time
    datetime
    timestamp
*/
create table t8
(
    c1 year,
    c2 date,
    c3 time,
    c4 datetime,
    c5 timestamp
);
insert into t8 values(2100,'2099-01-25','23:56:08','2012-12-10 12:23:45','2037-01-19 12:34:45');