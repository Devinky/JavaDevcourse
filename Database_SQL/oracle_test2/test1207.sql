drop table member1207;

create table member1207(
userid varchar2(20) not null,
userpw varchar(20) not null,
age number(3) not null,
email varchar2(200) not null,
primary key(userid)
);

desc member1207;
insert into member1207(userid,userpw,age,email) VALUES('m1','11',11,'m1@email.com');
insert into member1207(userid,userpw,age,email) VALUES('m2','22',22,'m2@email.com');
insert into member1207(userid,userpw,age,email) VALUES('m3','33',33,'m3@email.com');
insert into member1207(userid,userpw,age,email) VALUES('m4','44',44,'m4@email.com');
insert into member1207(userid,userpw,age,email) VALUES('m5','55',55,'m5@email.com');
insert into member1207(userid,userpw,age,email) VALUES('강1','1111',21,'m5@email.com');
insert into member1207(userid,userpw,age,email) VALUES('강2','2222',22,'m5@email.com');

commit; --추가, 수정, 삭제 시 실행
ROLLBACK; --commit한 단계 전

select * from member1207;
select count(*) from member1207; --테이블의 튜플(레코드)의 수 조회***(중요)

--칼럼의 값이 포함되어있는 레코드를 조회
select * from member1207 where userid in('m1');
select * from member1207 where userid in('m1','m2'); --여러 개를 조회할 수도 있음

select * from member1207 where userid like '강%'; --필드가 강으로 시작되는 레코드를 조회
select * from member1207 where userid like '%강'; --필드가 강으로 끝나는 레코드를 조회
select * from member1207 where userid like '%강%'; --필드에 강이 포함되어있는 레코드를 조회

select * from member1207 where age>=20 and userid like '강%'; --나이가 20 이상이면서 id가 강으로 시작하는 레코드를 조회(두 조건을 함께 사용할 때는 and를 사용)
select * from member1207 where age>20 and userid like '%m1%';

select userid ||'-'|| email as userinfo from member1207; --필드와 필드를 합쳐서 하나의 새로운 필드를 생성(as를 사용하여 새 이름을 지정하고 그곳에 저장)

select * from member1207;

--오름차순 내림차순 조회 (기본 asc)
select * from member1207 order by age; --나이순으로 오름차순 조회 기본이 asc(생략 가능)
select * from member1207; --위랑 똑같음(asc생략되어있는 형태가 이거)
select * from member1207 order by age desc; --나이순 내림차순 조회(desc 적어야함)
select * from member1207 order by userid asc; --문자열 기본 오름차순은 숫자->영어->한글 순으로 나옴
select * from member1207 order by userid desc; --내림차순은 한글->영어->숫자
