-- DDL  Table 생성  (auto commit) ==> rollback 불가능 
-- 데이타 조작어  DML   : Insert 	Update  delete  ==> rollback 가능 

DROP TABLE book;
CREATE TABLE book( 
    bookno NUMBER(5),
    title VARCHAR2(30),
    author VARCHAR2(30),
    pubdate DATE
);
auto COMMIT;

select * from book;
INSERT INTO book (bookno,title,author,pubdate) VALUES (1,'html5','고길동',sysdate);
COMMIT;
ROLLBACK ;

INSERT INTO book (bookno,title,author,pubdate) VALUES (2,'jsp','김길동','20/02/23');
INSERT INTO book (bookno,title,author,pubdate) VALUES (9,'spring','최길동',to_date('20/02/2019','dd/mm/yyyy'));
INSERT INTO book (bookno,title,author,pubdate) VALUES (4,'spring boot','이길동',null);
INSERT INTO book (bookno,title,author) VALUES (5,'spring boot','이길동');
INSERT INTO book (title) VALUES ('....');
INSERT INTO book  VALUES (7,'jsp',user,'20/02/23');

ROLLBACK ;
DELETE FROM book;
DELETE FROM book where bookno=1;
COMMIT;
select * from book;
UPDATE book SET title='******' where bookno is null;
UPDATE book SET title='******',author='우재남', pubdate=sysdate  where bookno is null;

select * from book where title like '%jsp%';

-- DDL  (auto commit) ==> rollback 불가능 
DROP TABLE book;
CREATE TABLE book( 
    bookno NUMBER(5),
    title VARCHAR2(30),
    author VARCHAR2(30),
    pubdate DATE
);

INSERT INTO book (bookno,title,author,pubdate) VALUES (1,'html5','고길동',sysdate);

alter TABLE book add( price number(7) ); --auto commit
select * from book;
alter TABLE book modify( price number(9,2) ); --auto commit
INSERT INTO book (bookno,title,author,pubdate,price) VALUES (1,'html5','고길동',sysdate,9999);
INSERT INTO book (bookno,title,author,pubdate,price) VALUES (1.0,'html5','고길동',sysdate,999.90);

COMMIT;
rollback;

alter table book drop COLUMN price; --auto commit
rename book to boot2; --auto commit
rename boot2 to book; --auto commit

delete from book; -- rollback 가능
truncate table book; --auto commit
DROP TABLE book;
------------------------------------------------
SELECT   * FROM emp;
SELECT   * FROM emp2;

SELECT   * FROM dept;
SELECT   * FROM dept2;

CREATE TABLE emp2  as SELECT   * FROM emp;
CREATE TABLE dept2  as SELECT   * FROM dept;

desc dept;
desc dept2;

-- dept , dept2 (50,'EDU','SEOUL')
INSERT INTO dept VALUES (50,'EDU','SEOUL');
INSERT INTO dept2 VALUES (50,'EDU','SEOUL');

INSERT INTO dept VALUES (10,'EDU','SEOUL');
INSERT INTO dept2 VALUES (null,'EDU','SEOUL');
--1
INSERT INTO emp(empno,ename,hiredate,sal,deptno) VALUES(null,'홍길동',sysdate,0,10);
--2
INSERT INTO emp2(empno,ename,hiredate,sal,deptno) VALUES(7934,'홍길동',sysdate,0,90);
rollback;

----  제약 조건 ---
DROP TABLE book;
CREATE TABLE book( 
    bookno NUMBER(5) PRIMARY KEY, -- unique + not null  ,index 생성
    title VARCHAR2(30) unique,    -- index 생성
    author VARCHAR2(30),
    price number(9,2) check(price > 0),
    pubdate DATE default sysdate
);

INSERT INTO book (bookno,title,author,price) VALUES (1,'html5','고길동',9999);
INSERT INTO book (bookno,title,author,price) VALUES (2,'jQuery','고길동',7999);
INSERT INTO book (bookno,title,author,price) VALUES (3,null,'고길동',7999);
INSERT INTO book (bookno,title,author,price) VALUES (4,null,'고길동',7999);

SELECT   * FROM book;
SELECT   * FROM book where title like '%a%';

DROP TABLE book;
CREATE TABLE book( 
    bookno NUMBER(5), -- unique + not null  ,index 생성
    title VARCHAR2(30) unique,    -- index 생성
    author VARCHAR2(30),
    price number(9,2) check(price > 0),
    pubdate DATE default sysdate
);

alter table book add CONSTRAINT  book_bookno_pk  PRIMARY KEY(bookno);
alter table book drop CONSTRAINT  book_bookno_pk ;

INSERT INTO book (bookno,title,author,price) VALUES (3,'.....','고길동',9999);
delete from book where title='jsp2';

----   emp , dept

drop table emp2;
drop table dept2;

CREATE TABLE dept2  as SELECT   * FROM dept;
CREATE TABLE emp2  as SELECT   * FROM emp;

-- dept2 pk(deptno) 설정
alter table dept2 add CONSTRAINT dept2_deptno_pk PRIMARY KEY(deptno);

-- emp2 pk(empno) 설정
alter table emp2 add constraint emp2_empno_pk primary key (empno);


-- emp2 fk(deptno) 설정     삭제 ?
alter table emp2 add constraint emp2_deptno_fk foreign key (deptno) references dept2;
DELETE FROM dept2 WHERE deptno=20; -- X

alter table emp2 drop constraint emp2_deptno_fk ;

alter table emp2 add constraint emp2_deptno_fk foreign key (deptno) references dept2 ON Delete SET NULL;
DELETE FROM dept2 WHERE deptno=20; -- O null 값세팅

alter table emp2 add constraint emp2_deptno_fk foreign key (deptno) references dept2 ON Delete cascade;
DELETE FROM dept2 WHERE deptno=20; -- O 자식도 같이 삭제 

DELETE FROM emp2 WHERE deptno=20;
rollback;

DELETE FROM dept2 WHERE deptno=20;

SELECT   * FROM emp2;
SELECT   * FROM dept2;

-- 뷰   시스템계정 에서 
create or replace view emp_detail
as
SELECT ename , dname , sal ,grade
FROM SCOTT.emp
     JOIN SCOTT.dept
     on emp.deptno = dept.deptno
     JOIN SCOTT.salgrade
     on sal BETWEEN losal AND hisal;
     
     
SELECT ename , dname , sal ,grade
FROM SCOTT.emp
     JOIN SCOTT.dept
     on emp.deptno = dept.deptno
     JOIN SCOTT.salgrade
     on sal BETWEEN losal AND hisal;     


select * from emp_detail;


-- users 테이블
-- id , pw , name ,email
-- insert 10개의 데이터 만들고
-- CURD
-- login 처리 sql 구문 완성 






