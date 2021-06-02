select * from emp;

SELECT    *
FROM emp
where sal > 2000
ORDER BY sal;

-- 순서
SELECT    *
FROM 
where 
ORDER BY 

SELECT
    *
FROM emp
WHERE sal > 1900;

SELECT ename 이름, sal+NVL(comm,0) 급여
FROM emp
--where 급여 > 2000
ORDER BY 급여;

SELECT ename 이름, sal+NVL(comm,0) 급여
FROM emp
where sal+NVL(comm,0) > 2000
ORDER BY 급여;

SELECT deptno, ename 이름, sal+NVL(comm,0) 급여
FROM emp
where deptno = 30
ORDER BY 급여;

SELECT deptno, ename 이름, job, sal+NVL(comm,0) 급여
FROM emp
where job = 'MANAGER'
ORDER BY 급여;

select deptno, ename 이름, job, sal+nvl(comm,0) 급여
from emp
where upper(job) = upper('&job');

select deptno, ename 이름, job, sal+nvl(comm,0) 급여
from emp
where HIREDATE = '81/02/20';

select deptno, ename 이름, job, sal+nvl(comm,0) 급여
from emp
where HIREDATE <> '81/02/20';

select deptno, ename 이름, job, sal+nvl(comm,0) 급여
from emp
where HIREDATE != '81/02/20';

select sysdate from dual;

select deptno, ename 이름, job, sal+nvl(comm,0) 급여
from emp
where HIREDATE = to_date('02/20/1981', 'mm/dd/yyyy');   --'' -> DATE    to_date()

-- date -> ''

select sysdate, to_char(sysdate, 'YYYY'), to_char(sysdate, 'MM'), to_char(sysdate, 'DD'), to_char(sysdate, 'DAY')
from dual;

-- emp 에서 사원, 입사월, 입사요일

select ename 사원이름, to_char(HIREDATE, 'MM') 입사월, to_char(HIREDATE, 'DAY') 입사요일
from emp;

-- 02-12-99

select to_date('02-12-99', 'dd-mm-RR'), to_char(to_date('02-12-99', 'dd-mm-RR'), 'YYYY') from dual;
select to_date('02-12-99', 'dd-mm-YY'), to_char(to_date('02-12-99', 'dd-mm-YY'), 'YYYY') from dual;

select to_date('02-12-99', 'dd-mm-RR'), to_char(to_date('02-12-99', 'dd-mm-RR'), 'Day') from dual;
select to_date('02-12-99', 'dd-mm-YY'), to_char(to_date('02-12-99', 'dd-mm-YY'), 'Day') from dual;

-- emp에서 2월 입사자 명단
select * from emp where to_char(HIREDATE, 'MM') = '02';

-- sal 3000 이상 ~ 5000 이하 사원목록

select * from emp where sal >= 3000 and sal <= 5000;

select * from emp
where sal between 3000 and 5000;

select * from emp
where sal between 3000 and 5000
order by sal;

-- deptno 가 10번 이거나 20번 사원목록

select * from emp
where deptno = 10 or deptno = 20;

select * from emp
where deptno = 10 or deptno = 20
order by deptno;

-- 집합 연산자

select * from emp
where deptno in(10,20)
order by deptno;

-- 10번 20번 제외

select * from emp
where deptno not in(10,20)
order by deptno;

select * from dept;

select * from emp
where (deptno,sal) in((10,5000),(20,3000));

-- like 연산자 % _

select * from emp
where ename like 'A%';

select * from emp
where upper(ename) like upper('a%');

select * from emp
where upper(ename) like upper('%a%');

select * from emp
where upper(ename) like upper('%a_s%');

select * from emp
where upper(ename) like upper('%l_k%');

select * from emp
where to_char(HIREDATE,'MM') like '%2';

select * from emp
where HIREDATE like '81%';

-- null 검색

select * from emp
where comm is null;

select * from emp
where comm is not null;

-- mgr이 없는 사원 목록

select * from emp
where mgr is null;

select rownum, empno, ename, job, mgr, hiredate, sal, comm, deptno
from emp;

select rownum, empno, ename, job, mgr, hiredate, sal, comm, deptno
from emp
where rownum < 3;

select rownum, empno, ename, job, mgr, hiredate, sal, comm, deptno
from emp
where rownum > 3;

select rownum, empno, ename, job, mgr, hiredate, sal, comm, deptno
from emp
order by deptno;

select rownum, empno, ename, job, mgr, hiredate, sal, comm, deptno
from emp
order by sal desc;

select ename, deptno, sal
from (select * from emp order by sal desc);

select rownum, ename, deptno, sal
from (select * from emp order by sal desc);

select rownum, empno, ename, job, mgr, hiredate, sal, comm, deptno
from (select * from emp order by sal desc);

select rownum, empno, ename, job, mgr, hiredate, sal, comm, deptno
from (select * from emp order by sal desc)
where rownum < 4;

-- 오라클 페이징처리 서브쿼리문
select *
from
(
select rownum row#, empno, ename, job, mgr, hiredate, sal, comm, deptno
from (select * from emp order by sal desc)
)
where row# between &start and &end;

-- 내장함수 : single row function

select ename, lower(ename) job, substr(job,2,4) from emp;

select 3+435, 1/2, '3.5'+4 from dual;

-- decode 함수

select ename, sal, decode(deptno, 10, sal*0.5, 20, sal*0.7, sal) 보너스, deptno 
from emp
order by 4;

-- case 구문

select ename, sal, 
            case
                when deptno = 10 then sal*0.5
                when deptno = 20 then sal*0.7
                else 1
            end 보너스
        , deptno
from emp
order by 4;

-- hr/hr
-- employees, 급여순으로 정렬 내림차순, 5~10 row만 출력

select 
*
from employees;