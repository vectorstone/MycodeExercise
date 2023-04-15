/*
 if(判断条件,exp1,exp2): 和java里的三元表达式相似
 ifnull(value,exp): 如果value是null,选exp
*/
-- 查询 姓名，薪资，如果薪资大于2000，显示高薪，否则显示正常
select ename, salary, if(salary > 15000, '高薪', '正常') as "salary_level"
from t_employee;

-- 计算实发工资 = salary + salary * commission_pct
select ename, salary, commission_pct, salary + salary * ifnull(commission_pct, 0) as "实发工资"
from t_employee;

/*
查询员工编号，姓名，薪资，等级，等级根据薪资判断，
如果薪资大于20000，显示“羡慕级别”，
如果薪资15000-20000，显示“努力级别”，
如果薪资10000-15000，显示“平均级别”
如果薪资10000以下，显示“保底级别”
mysql中没有if...else if语句，有case when语句，等价于if...elseif
*/
select eid,
       ename,
       salary, -- 逗号不能漏
       case
           when salary >= 20000 then '羡慕级别'
           when salary >= 15000 and salary < 20000 then '努力级别'
           when salary >= 10000 and salary < 15000 then '平均级别'
           when salary < 10000 and salary >= 500 then '保底级别'
           else '贷款上班'
           end as "salary_level"
from t_employee;

-- 根据did输出是哪个部门
select eid,
       ename,
       did,
       case did
           when 1 then '研发部'
           when 2 then '人事部'
           when 3 then '市场部'
           when 4 then '财务部'
           when 5 then '后勤部'
           when 6 then '测试部'
           end 部门名称
from t_employee;

-- 分析员工的出差情况
select ename,
       work_place,
       (char_length(work_place) - char_length(replace(work_place, ',', '')) + 1) as count,
       case (char_length(work_place) - char_length(replace(work_place, ',', '')) + 1)
           when 1 then '只在一个地方工作'
           when 2 then '在两个地方来回奔波'
           when 3 then '在三个地方流动'
           else '频繁出差'
           end 出差情况
from t_employee;

