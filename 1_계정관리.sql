오라클 설치 후
도스창

>sqlplus system/1234		관리자계정
alter user hr identified by hr account unlock;		오라클에서 제공해주는 계정


#################### 관리자계정에서 명령 수행 계정관리 #######################

create user test01 identified by 1234;
grant connect to test01;
revoke connect from test01;
grant connect,resource to test01;

drop user test01 cascade;	-- auto commit

##############################################################################


>sqlplus test01/1234
>conn test01/1234

>sqlplus hr/hr				오라클에서 제공해주는 계정
select * from tab;

C:\oraclexe\app\oracle\product\11.2.0\server\rdbms\admin\scott.sql

@c:\multicampus\lib\scott.sql

SQL> set linesize 120
SQL> set pagesize 120

>select * from emp;
>select * from dept;

#################################################################################

select * from dept;
select * from emp;

select
    deptno, empno, ename
from emp;

select user from dual;
desc dual;
desc dept;

-- 자바의 문자열 ==> "", 오라클 문자열 ''

select
    deptno, empno, ename as 사원명, sal as "월   급"
from emp;

select
    deptno, empno, ename 사원명, sal, sal*12  "연   봉"
from emp;

select
    deptno, empno, ename 사원명, sal||'원', sal*12  "연   봉"
from emp;

-- null
SELECT * FROM emp;

select ename, sal, comm, sal+NVL(comm,0) "급 여"
from emp;

select empno, ename, NVL(to_char(mgr), '<TOP>') 상사, sal, comm, sal+NVL(comm,0) "급 여"
from emp;

SELECT ename ||'   ' || job FROM emp;

SELECT DISTINCT job FROM emp;

SELECT DISTINCT deptno, job FROM emp;

    -- RR/MM/DD
SELECT SYSDATE, user from dual;

SELECT to_date('17-12-1980') from dual;
SELECT to_date('21-06-01') from dual;

SELECT to_date('17-12-1980') from dual;
SELECT to_date('17-12-1980','dd-mm-yyyy') from dual;

SELECT * FROM emp ORDER BY sal;

select ename, sal, comm, sal+NVL(comm,0) "급 여"
from emp ORDER BY "급 여";

    -- 보이지 않는 컬럼으로도 정렬 가능
select ename, sal, comm, sal+NVL(comm,0) "급 여"
from emp ORDER BY deptno;

    -- 내림차순 정렬
select deptno, ename, sal, comm, sal+NVL(comm,0) "급 여"
from emp ORDER BY deptno DESC;

    -- sort
select deptno, ename, sal, comm, sal+NVL(comm,0) "급 여"
from emp ORDER BY deptno DESC, "급 여";

---------------------------------------------------------------------------------

