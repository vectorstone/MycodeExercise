/*
算术运算符:  + - * / %
注意事项:
    1. 两个整数相除会得到一个浮点数
    2. 如果除以 0 得到的结果是 null
*/
select 3 + 8, 18 - 5, 2 * 8, 10 / 3, 18 % 5, 1 / 0, 12 % 0;

/*
 比较运算符:  >    <    >=    <=    != <>    =    <=>和null进行比较
 注意事项:
    1. 判断两个数据是否相等，使用的不是  ==,而是 =
    2. 和 null 做比较运算，不能使用 = ,要使用  is null 或者  <=>
    3. 比较布尔类型类型最好使用 is
    4. between...and 判断一个数据是否在范围内
    5. in 判断一个数据是否在选项内
    6. like 是一个模糊查询，通常需要配合 % 通配符使用
    7. rlike/regexp 支持正则表达式的模糊查询
*/
select 1 < 2,
       5 > 6,
       3 >= 4,
       5 <= 9,
       5 != 6,
       5 <> 6,
       4 = 4,
       1 / 0 is null,
       2 / 0 <=> null,
       3 is true,
       true = true,
       8 between 1 and 7,
       'c' between 'm' and 'z',
       5 in (2, 7, 5, 4, 6),
       'hello' like '%el%',
       'good' rlike 'go{2}d',
       'good' regexp 'go{3}d';

/*
 逻辑运算符:   mysql里的逻辑运算一定要使用  && ||  不能使用 & |
    逻辑与: && and   逻辑或:|| or  逻辑非:! not   逻辑异或:xor
*/
select 1 > 0 and 4 < 5 x, 1 > 0 && 4 > 5, 1 > 0 || 4 < 7, 1 > 0 or 5 < 0, not 3 > 5, !(5 < 7), 1 > 0 xor 3 > 5;

/*
 位运算符:  按位与&   按位或|  按位异或^  按位取反~
*/
select 15 && 27, 15 & 27, 17 | 8, 23 ^ 7, ~8;

-- java &  位运算:整数   逻辑运算:布尔类型
select * from student where name='Jack';

show create table student;

create table `t9`(id int);