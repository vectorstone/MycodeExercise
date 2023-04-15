/*在 t_employee 表中查询每个人薪资和公司平均薪资的差值，
并显示员工薪资和公司平均薪资相差5000元以上的记录*/
use atguigu;
-- 先计算公司平均薪资
select avg(salary)
from t_employee;

-- 然后计算个人薪资和公司平均薪资的差值
select eid, ename, salary, salary - (select avg(salary) from t_employee) diff
from t_employee
having abs(diff) > 5000;

-- 在t_employee表中查询每个部门平均薪资和公司平均薪资的差值
select td.did, dname, avg(salary), salary - (select avg(salary) from t_employee) diff
from t_employee te
         join t_department td on td.did = te.did
group by did,diff;

select td.did, dname, avg(salary) - (select avg(salary) from t_employee) as diff
from t_employee
         join t_department td on t_employee.did = td.did
group by did;

# from子查询
-- 在“t_employee”表中查询每个部门中薪资排名前2的员工姓名、部门编号和薪资

-- 1.先来查询每个部门员工的薪资排名
select te.did,ename,dname,salary
from t_employee te
join t_department td on td.did = te.did
group by did,salary;
