--
-- 순서 중요
SELECT   *
FROM
where
group by
having
order by



SELECT ename,lower(ename),to_char(hiredate,'day')
FROM emp;

SELECT AVG(sal) ,avg(comm) ,sum(comm)/count(comm),COUNT(*)
FROM emp;

SELECT AVG(sal), ROUND(avg(sal),1),max(sal),min(sal)
FROM emp;

SELECT count(DISTINCT job)
FROM emp;

SELECT  ROUND(avg(sal)) "전체 평균 급여"   FROM emp;
SELECT  round(avg(sal)) 평균급여,max(sal),min(sal)   FROM emp where deptno=10;
SELECT  round(avg(sal)) 평균급여,max(sal),min(sal)   FROM emp where deptno=20;
SELECT  round(avg(sal)) 평균급여,max(sal),min(sal)  FROM emp where deptno=30;
SELECT  round(avg(sal)) 평균급여,max(sal),min(sal)   FROM emp where deptno=40;

-- 순서 중요
SELECT   *
FROM
where
group by
order by

-- emp 부서번호 별 요약 분서 
SELECT  deptno , round(avg(sal)) 평균급여,max(sal),min(sal)
FROM emp
--where
group by deptno
order by deptno;

-- SELECT  deptno, ROUND(avg(sal)) "전체 평균 급여"   FROM emp;

-- emp 부서이름 별 sal 요약 분서 
SELECT  emp.deptno , dname , round(avg(sal)) 평균급여,max(sal),min(sal)
FROM emp join dept on emp.deptno = dept.deptno
--where
group by dname,emp.deptno
order by emp.deptno;

-- emp 도시이름별 sal 요약 분서 
SELECT  emp.deptno , loc , round(avg(sal)) 평균급여,max(sal),min(sal)
FROM emp join dept on emp.deptno = dept.deptno
--where
group by loc,emp.deptno
order by emp.deptno;

--6.월 별 입사자 수를 조회하는 SQL 쿼리문을 작성하세요 월 순으로 정렬하세요

select to_char(hire_date,'MM') 월 ,count(employee_id) 입사자수
from employees
group by to_char(hire_date,'MM')
order by to_char(hire_date,'MM');

select to_char(hiredate,'MM') 월 ,count(*) 입사자수
from emp
group by to_char(hiredate,'MM')
order by 월;



-- 순서 중요
SELECT   *
FROM
where
group by
having
order by


-- emp 부서이름 별 평균급여가 > 2000 , sal 요약 분서 
SELECT  emp.deptno , dname , round(avg(sal)) 평균급여,max(sal),min(sal)
FROM emp join dept on emp.deptno = dept.deptno
--where  round(avg(sal)) > 2000
group by dname,emp.deptno
having round(avg(sal)) > 2000
order by emp.deptno;

SELECT  emp.deptno , dname , round(avg(sal)) 평균급여,max(sal),min(sal)
FROM emp join dept on emp.deptno = dept.deptno
where  sal > 1000
group by dname,emp.deptno
having round(avg(sal)) > 2000
order by emp.deptno;

-- subquery
select * from emp;

-- Ford 사원보다 급여를 많이 받는 사원 리스트
select sal from emp where upper(ename)=upper('Ford');
select * from emp where sal > 3000;

select * from emp where sal > (select sal from emp where upper(ename)=upper('Ford'));

-- 급여가 제일 적은 사원 리스트
select * from emp where sal = (select min(sal) from emp );

-- 부서별 급여가 제일 적은 사원 리스트
select min(sal) from emp group by deptno;
--select * from emp where sal = (select min(sal) from emp group by deptno);
select * from emp where sal in (select min(sal) from emp group by deptno);
select * from emp where sal in (950,800,1300);

-- 그럼 만약 한 부서에 800, 950이 있으면 둘다 검색되나요?
SELECT    *
FROM emp
where (deptno,sal)  in((10,5000),(20,3000));

select * 
from emp 
where (deptno,sal) in (select deptno, min(sal) from emp group by deptno);


---- mysql  ==>  SELECT * from emp order by sal desc limit 10,15


--집힙연산자   union , union all , 

select job from emp where deptno=10
union
select job from emp where deptno=20;


select job from emp where deptno=10
union all
select job from emp where deptno=20;

select job from emp where deptno=10
minus
select job from emp where deptno=20;


-- 사원이 한명도 없는 부서 정보를 찾으시오...
SELECT  * FROM dept
where deptno  not in (select distinct deptno from emp);

select deptno from dept
minus
select DISTINCT deptno from emp;

select * from dept 
where deptno = (select deptno from dept
    minus
    select DISTINCT deptno from emp);

select * 
from dept
where deptno not in 
(
    select deptno
    from emp
    group by deptno
);





