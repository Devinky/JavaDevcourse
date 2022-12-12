create user user1206 identified by 1234; --유저 생성
grant connect, resource to user1206; --해당 유저에 connect, resource 권한 부여

drop table member1206;

create table member1206(
    userId varchar2(20) not null,
    userPw varchar2(20) not null,
    age number(3) not null,
    email varchar2(200) not null,
    primary key(userId)
);

desc member1206;

--table의 스키마 조회
select * from col where tname='member1206';

--실습
drop table member11;
create table member11(
userId varchar2(20) not null,
userPw varchar2(20) not null,
userAge varchar2(20) not null,
primary key(userId)
);

desc member11;

--userAge를 number(3)으로 수정하기
alter table member11 modify userAge number(3);

--더미데이터 5개 입력
insert into member11 (userid,userpw,userage) values('m1','11',11);
insert into member11 (userid,userpw,userage) values('m2','22',22);
insert into member11 (userid,userpw,userage) values('m3','33',33);
insert into member11 (userid,userpw,userage) values('m4','44',44);
insert into member11 (userid,userpw,userage) values('m5','55',55);
insert into member11 (userid,userpw,userage) values('abmcd','66',16);
--추가, 삭제, 수정

commit;

select * from member11;
select count(*) from member11;

--in, not in
select * from member11 where userId in('m1','m2'); --m1,m2가 포함된 레코드를 조회(조건은 여러 개를 써도 된다)
select * from member11 where userId not in('m1','m2'); --m1,m2가 포함되지 않은 나머지 레코드를 조회

--like
select * from member11 where userId like 'm%'; --userid 칼럼에서 문자m로 시작하는 필드 조회
select * from member11 where userId like '%s'; --userid 칼럼에서 문자s로 끝나는 필드 조회
select * from member11 where userId like '%m%'; --userid 칼럼에서 1이 시작과 끝에 포함된 모든 필드 조회

--문자연산자||
select userid ||','|| userpw
from member11
where userage>20;
--userid와 userpw를 쉼표를 사이에 두고 더하기

--오름차순, 내림차순 조회
select * from member11 
where userAge>10 
order by userAge desc; 
--userage가 10보다 많은 칼럼을 내림차순으로 조회

select * from member11 order by userage asc; --오름차순(생략어asc)
select * from member11 order by userage desc; --내림차순(생략어desc)

select * from member11 order by userid asc; --오름차순
select * from member11 order by userid desc; --내림차순

select * from member11 order by userpw asc; --오름차순
select * from member11 order by userpw desc; --내림차순


select userid ||','|| userpw as userinfo -- select userid ||','|| userpw의 결과를 userinfo에 저장
from member11
where userage>20;

--내일 배울 내용 미리보기(group by)
create table company(
no number(3) not null primary key,
dept varchar2(10) not null,
year varchar2(10) not null
);

insert into company(no, dept, year) values(1,'영업부','2021');
insert into company(no, dept, year) values(2,'영업부','2023');
insert into company(no, dept, year) values(3,'기획부','2021');
insert into company(no, dept, year) values(4,'기획부','2020');
insert into company(no, dept, year) values(5,'관리부','2022');

select * from company;

--select count(집계함수), sum(no), dept from 테이블 group by 칼럼명(그룹);
select count(*), sum(no), dept from company group by dept;

select dept from company group by dept; --dept를 그룹으로 묶어서 조회
