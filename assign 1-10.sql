SELECT *
FROM DEPT;

SELECT ENAME,JOB,HIREDATE,EMPNO
FROM EMP;

SELECT ENAME,JOB,SAL,SAL*12 AS 'ANUALSAL'
FROM EMP;

SELECT ENAME + ' work as ' + JOB AS 'NAME V/S JOB ROLE'
FROM EMP;

SELECT DISTINCT(JOB)
FROM EMP;

SELECT ENAME,SAL
FROM EMP
WHERE SAL>2850;

SELECT ENAME,DEPTNO
FROM EMP
WHERE ENAME='SMITH';


SELECT ENAME,DEPTNO
FROM EMP
WHERE DEPTNO IN(10,30) 
ORDER BY ENAME;

SELECT ENAME,HIREDATE
FROM EMP
WHERE HIREDATE LIKE ('1982%') 