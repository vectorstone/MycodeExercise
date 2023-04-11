/*
第1题
案例:
1.创建数据库day01_test01_library
2.创建表格books
*/
use day01_test01_library;#切换到day01_test01_library数据库

#创建表格books
create table books(
  b_id int(11),
  b_name varchar(50),
  `authors` varchar(100),
  price float,
  pubdate year,
  note varchar(100),
  num int(11)
);
#3.向books表中插入记录
#3.1指定所有字段名称插入第一条记录
insert into books(b_id,b_name,`authors`,price,pubdate,note,num) values (1,'Tal of AAA','Dickes',23,1995,'novel',11);
#3.2不指定所有字段名称插入第二条记录
insert into books values (2,'EmmaT','Jane lura',35,1993,'joke',22);

#3.3同时插入多条记录(剩下的所有记录)
insert into
books(b_id,b_name,`authors`,price,pubdate,note,num)
values
(3,'Story of Jane','Jane Tim',40,2001,'novel',0),
(4,'Lovey Day','George Byron',20,2005,'novel',30),
(5,'Old land','Honore Blade',30,2010,'law',0),
(6,'The Battle','Upton Sara',30,1999,'medicine',40),
(7,'Rose Hood','Richard haggard',28,2008,'cartoon',28);

#4.将小说类型(novel)的书的价格都增加5
update books
set price = price + 5
WHERE note = 'novel';
#5.将名称为EmmaT的书的价格改为40
update books
set price = 40
where b_name = 'EmmaT';
#6.删除库存为0的记录
delete from books
where num = 0;
