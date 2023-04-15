use day01_test04db;
select *
from employee;

select name, char_length(name) as 占用字符数, length(name) as 占用字节数量
from employee
where sex = '男';

use atguigu;

select *
from t_employee;

select count(job_id), sum(salary), min(salary), avg(salary), std(salary)
from t_employee;

select count(job_id), sum(salary), min(salary), avg(salary), std(salary)
from t_employee
group by gender;

-- 分组拼接
select count(eid), group_concat(ename), avg(salary), gender, max(salary)
from t_employee
group by gender;

-- 窗口函数
-- 给所有的数据从1开始编号
select eid, ename, did, row_number() over () as number
from t_employee;

-- 根据部门对数据重新编号
select eid, ename, did, row_number() over (partition by did) as number
from t_employee;

-- 根据部门的工资进行排序
select eid, ename, did, salary, rank() over (partition by did order by salary) as r
from t_employee;

-- 还是根据部门的工资排序,但是使用的是dense_rank()
select eid, ename, did, salary, dense_rank() over (partition by did order by salary) as r
from t_employee;

-- 使用 window w as (partition by did order by salary) 给分组起一个别名
select eid, ename, did, salary, rank() over w as r
from t_employee window w as (partition by did order by salary);

-- 练习1: 在“t_employee”表中查询薪资在[8000,10000]之间的员工姓名和薪资并给每一行记录编序号
select ename, salary, row_number() over () as number
from t_employee
where salary >= 8000
  and salary <= 10000;

-- 给每个部门的员工从1开始编号
select eid, ename, did, row_number() over w as "d_num"
from t_employee
    window w as (partition by did);

/*在“t_employee”表中查询女员工姓名，部门编号，薪资，查询结果按照部门编号分组后在按薪资升序排列，
  并分别使用ROW_NUMBER（）、RANK（）、DENSE_RANK（）三个序号函数给每一行记录编序号
 */
select ename, did, salary, rank() over w as "num_salary"
from t_employee
where gender = '女'
    window w as (partition by did order by salary);

-- 改进
select ename,
       did,
       salary,
       row_number() over (partition by did) as "row_by_did",
       rank() over w                        as "rank",
       dense_rank() over w                  as "dense_rank"
from t_employee
where gender = '女'
    window w as (partition by did order by salary);


-- 查询 姓名，薪资，如果薪资大于20000，显示高薪，否则显示正常
select ename, salary, if(salary > 20000, '高薪', '正常') as "salary_level"
from t_employee;

/*
查询员工编号，姓名，薪资，等级，等级根据薪资判断，
如果薪资大于20000，显示“羡慕级别”，
如果薪资15000-20000，显示“努力级别”，
如果薪资10000-15000，显示“平均级别”
如果薪资10000以下，显示“保底级别”
*/
select eid,
       ename,
       salary,
       case
           when salary > 2000 then '羡慕级别'
           when salary >= 15000 and salary < 20000 then '努力级别'
           when salary >= 10000 and salary < 15000 then '平均级别'
           when salary < 10000 then '保底级别'
           end as "salary_level"
from t_employee;

-- 分析员工出差情况
select ename,work_place,
       (char_length(work_place) - char_length(replace(work_place,',','')) + 1) as count,
       case (char_length(work_place) - char_length(replace(work_place,',','')) + 1)
when 1 then '只在一个地方工作'
when 2 then '在两个地方来回奔波'
when 3 then '在三个地方流动'
when 4 then '频繁出差'
end as 出差情况
from t_employee;

-- 在t_employee表中查询每个部门平均薪资和公司平均薪资的差值
-- 每个部门平均薪资
select avg(salary) from t_employee group by did;

-- 公司平均薪资
select avg(salary) from t_employee;

select te.did,dname,((select avg(salary) from t_employee group by did) - (select avg(salary) from t_employee))
from t_employee as te
join t_department t on te.did = t.did;

select did,salary ,rank() over(partition by did order by salary) r
from t_employee;