
select	ename,
		sal
from emp
where sal between 1250 and 1600;



select sal,ename,
(case
when sal = any (select sal
from emp
where 1250>sal) then 'lessthan1250'
when sal = any (select sal
from emp
where 1600<sal) then 'morethan1600' end) as 'status-result'
from emp;



select sum(sal) as totalsalofallemp
from emp;


select	count(ename)
from emp
where job is not null;



select	top 1 e.ename,
		min(sal) as minsalary
from EMP e
group by ename
order by minsalary;


select	top 1 ename,
		max(sal) as maxsalary
from EMP e
group by ename
order by maxsalary desc;



select 
	ename as Employee,
	sal as Salary,
	job as Job,
	hiredate as 'Date of Hire',
	comm as Commission,
	deptno as 'Department No',
	mgr as 'MGR No'
from EMP;




select c.ename as LatestDate,e.ename as EarliestDate 
from  emp c ,emp e
where e.empno = c.mgr and c.HIREDATE < e.HIREDATE;



select count(e.deptno)
from emp e
where e.deptno>10;




select ename,sal,comm
from emp e
join 
dept d
on loc='NEW YORK'
where e.comm > 10;



select datename(weekday,getdate()) 'Day Name', format(getdate(), 'MM-dd-yy') as 'Date'

select datename(weekday,getdate()) 'Day Name', format(getdate(), 'dd-mm-yy') as 'Date'

select datename(weekday,getdate()) 'Day Name', format(getdate(), 'yy-MM-dd') as 'Date'