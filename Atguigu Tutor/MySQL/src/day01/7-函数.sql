/*
 mysql里有很多的内置函数，内置函数可以分为三大类:
 1. 单行函数，方法调用完以后，行数不会发生变化
 2. 聚合函数，也被称为分组函数，调用完了以后，行数会发生变换，通常配合group by来使用
 3. 窗口函数，mysql 8.0新增的函数，从执行结果来看，执行以后行数也不会发生变化，属于单行函数
 */

/*
 数学相关的方法
     ceil(x): 向上取整
     floor(x):向下取整
     round(x,n): 四舍五入保留到小数点后n位
     truncate(x,n): 保留到小数点后n位
     abs(): 绝对值
     rand(): 生成[0,1)的随机小数
     mod(x,y):计算x % y
     pow(x,y):计算x的y次方
*/
select ename,
       salary,
       salary / 22,
       ceil(salary / 22),
       floor(salary / 22),
       round(salary / 22, 2),
       truncate(salary / 22, 2)
from t_employee;

select abs(-10), rand(), mod(15, 4), pow(2, 10)
from dual;

/*
 字符串相关函数：mysql里字符串不能相加
    concat(x,y...)
    concat_ws(separator,x,y...)
    left(s,n): 取到字符串的第n个
    rpad(s,length,value): 在字符串s的最后使用 value进行填充到length长度
    length(s): 获取到字符串s的字节数
    char_length(s): 获取到字符串的字符数
*/
select concat_ws(',', ename, gender, salary)
from t_employee;
SELECT CONCAT(ename, tel), CONCAT_WS('-', ename, tel, salary)
FROM t_employee;


select rpad(left(ename, 1), 2, 'X'), salary
from t_employee
where salary > 15000
  and gender = '男';

SELECT ename, CHAR_LENGTH(ename) AS 占用字符数, LENGTH(ename) AS 占用字节数量
FROM t_employee
WHERE salary > 10000
  AND gender = '男';

SELECT ename,
       email,
       SUBSTRING(email, 1, POSITION('@' IN email) - 1)
FROM t_employee
WHERE salary > 10000
  AND gender = '男';


/*
 日期时间函数:
 */
select curdate(), current_date(), curtime(), current_time(), now(), datediff('2012-12-10', '2011-12-10');


-- 加密函数:
select md5('abc'), sha('123'), sha2('123', 512);

select database(), version(), user();


/*分组函数也被称为聚合函数，特点就是执行完成以后，行数减少，通常配合 group by语句来完成
count(field): 用来统计指定字段非null的数据个数
sum(field):求和
max(field) / max(filed):最大/最小值
avg(field):平均值
group_concat(): 分组拼接*/
select count(job_id), sum(salary), max(salary), min(salary), avg(salary), std(salary)
from t_employee;

select count(eid), group_concat(ename), avg(salary), gender, max(salary)
from t_employee
group by gender;

/*
窗口函数，是mysql8新增的函数，用法是  函数名() over (窗口)
    row_number(): 用来对数据进行编号
    rank(): 用来对数据进行排名  如果出现相同的排名，跳过下一个排名  1,1,3
    dense_rank(): 用来对数据进行排名  如果出现相同的排名，不跳过下一个排名  1,1,2


over(partition by 字段) 根据某个字段来进行分组
over里如果没有partition by,说明不分组
*/
-- 给所有的数据从1开始编号
select eid, ename, did, row_number() over () as number
from t_employee;

-- 根据部门对数据重新编号
select eid, ename, did, row_number() over (partition by did) as number
from t_employee;

-- 根据部门的工资进行排序
select eid, ename, did, salary, rank() over (partition by did order by salary) as r
from t_employee;

select eid, ename, did, salary, dense_rank() over (partition by did order by salary) as r
from t_employee;

-- 使用 window w as (partition by did order by salary) 给分组起一个别名
select eid, ename, did, salary, rank() over w as r
from t_employee window w as (partition by did order by salary);

# （1）在“t_employee”表中查询薪资在[8000,10000]之间的员工姓名和薪资并给每一行记录编序号
select row_number() over () number, ename, salary
from t_employee
where salary >= 8000
  and salary <= 10000;

# (2) 给每个部门的员工从1开始编号
select row_number() over w as "d_num", eid, ename, did
from t_employee window w as (partition by did);

# （3）在“t_employee”表中查询女员工姓名，部门编号，薪资，查询结果按照部门编号分组后在按薪资升序排列，并分别使用ROW_NUMBER（）、RANK（）、DENSE_RANK（）三个序号函数给每一行记录编序号
select ename,
       did,
       salary,
       row_number() over (partition by did) as n,
       dense_rank() over w                  as dr,
       rank() over w                        as r
from t_employee
where gender = '女'
    window w as (partition by did order by salary);