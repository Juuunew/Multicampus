select * from emp;
select * from dept;

select ename, dname from emp, dept;

-- oracle join

select ename, dname, dept.deptno
from emp, dept
where emp.deptno = dept.deptno;    -- 조인조건 fk=pk

select ename, dname, d.deptno
from emp e, dept d
where e.deptno = d.deptno;    -- 조인조건 fk=pk

-- sal > 2500 사원의 이름과 부서이름, 급여정보 부서번호 출력

select ename, dname, sal, d.deptno
from emp e, dept d
where sal > 2500 and e.deptno = d.deptno;

-- 안시조인 (표준) from 절, -> join으로 ,,, where 절에 사용한 join 조건 -> on
-- inner join ==> 양쪽 테이블에 모두 있는 내용 출력

select ename, dname, d.deptno, sal
from emp e join dept d
on e.deptno = d.deptno;    -- 조인조건 fk=pk

select ename, dname, d.deptno, sal
from emp e join dept d
on e.deptno = d.deptno
where sal > 2500;

-- outer join (+)는 null 이 있는 곳에!

select ename, dname, d.deptno
from emp e, dept d
where e.deptno(+) = d.deptno;

select ename, dname, d.deptno
from emp e, dept d
where e.deptno = d.deptno(+);

-- 안시 표준

select ename, dname, d.deptno, sal
from emp e right outer join dept d
on e.deptno = d.deptno;

select ename, dname, d.deptno, sal
from emp e left outer join dept d
on e.deptno = d.deptno;

select ename, dname, d.deptno, sal
from emp e full outer join dept d
on e.deptno = d.deptno;     -- full = 양쪽 null값을 가지고 있는 모든 것 출력

-- non equi-join

SELECT * FROM salgrade;

-- oracle 방식

SELECT ename, job, sal, grade FROM emp, salgrade
where sal between losal and hisal
order by 1;

-- 안시 조인

SELECT ename, job, sal, grade 
FROM emp join salgrade
on sal between losal and hisal
order by 1;

SELECT *
FROM emp join salgrade
on sal between losal and hisal
order by 1;

SELECT emp.*, salgrade.grade
FROM emp join salgrade
on sal between losal and hisal
order by 1;

-- 3개의 테이블
-- ename, dname, sal, grade

-- oracle

SELECT ename, dname, sal, grade
FROM emp, dept, salgrade
where emp.deptno = dept.deptno and sal between losal and hisal and sal >2000;

-- ansi join

select ename, dname, sal, grade
from emp
    join dept
    on emp.deptno = dept.deptno
    join salgrade
    on sal between losal and hisal
where sal > 2000;           -- where 대신 and 도 가능

select ename, dname, sal, grade
from emp
    join dept
    on emp.deptno = dept.deptno
    join salgrade
    on sal between losal and hisal
    and sal > 2000 ;
    
-- self join
-- 사원의 이름, 상사의 이름 출력

select e.ename 사원명, m.ename 상사이름
from emp e, emp m
where e.mgr = m.empno;

select e.ename 사원명, m.ename 상사이름
from emp e, emp m
where e.mgr = m.empno(+);

-- 안시 inner join

select e.ename 사원명, m.ename 상사이름
from emp e inner join emp m
on e.mgr = m.empno;

select e.ename 사원명, m.ename 상사이름
from emp e left outer join emp m
on e.mgr = m.empno;

select e.ename 사원명, nvl(m.ename, '<<TOP>>') 상사이름
from emp e left outer join emp m
on e.mgr = m.empno;

-- 사원의 급여가 상사의 급여보다 많은 사원 목록 리스트
select e.ename 사원명, e.sal, nvl(m.ename, '<<TOP>>') 상사이름, m.sal
from emp e left outer join emp m
on e.mgr = m.empno
where e.sal > m.sal;

