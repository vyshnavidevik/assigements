select count(*) as DEPTNO
from EMP


select	distinct e.deptno,dname,loc,
sum(comm) as totalcomm,
sum(sal) as totalofeachdept
from emp e,dept d
group by e.DEPTNO,DNAME,LOC
order by DEPTNO;


SELECT	ENAME,JOB,
SAL*12 AS 'ANUAL SALARY' 
FROM EMP;


SELECT	ENAME,JOB,COMM 
FROM EMP 
WHERE  COMM IS NULL ;


SELECT	ENAME,JOB,COMM
FROM EMP 
WHERE COMM IS NOT NULL ;


SELECT	ENAME,
		JOB,
		SAL 
FROM EMP 
WHERE ENAME LIKE '__R%';


SELECT	* 
FROM EMP 
WHERE ENAME LIKE '__';



SELECT	* 
FROM EMP 
WHERE ENAME LIKE '_';



SELECT	* 
FROM EMP 
WHERE ENAME LIKE 'AR';




select	ename,
		sal
from emp
where deptno=30
order by sal;