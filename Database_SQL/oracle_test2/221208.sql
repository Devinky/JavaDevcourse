create table table1208(
num number not null
);

insert into table1208(num) values(10);
insert into table1208(num) values(20);
insert into table1208(num) values(30);
insert into table1208(num) values(40);
insert into table1208(num) values(50);

select * from table1208;
select sum(num) 합계 from table1208; --별칭 부여(as 빼도 됨)
select avg(num) as 평균 from table1208;
select count(*) 총합 from table1208; --레코드의 갯수 합
select max(num) 최댓값 from table1208; --레코드의 최댓값
select min(num) 최솟값 from table1208; --레코드의 최솟값

create table tb1(
subject1 varchar2(10) not null
);

create table tb2(
subject2 varchar2(10) not null
);

insert into tb1(subject1) values('과목1');
insert into tb1(subject1) values('과목2');
insert into tb1(subject1) values('과목3');
insert into tb1(subject1) values('과목4');
insert into tb1(subject1) values('과목5');
commit;
select * from tb1;

insert into tb2(subject2) values('과목1');
insert into tb2(subject2) values('과목1');
insert into tb2(subject2) values('과목3');
insert into tb2(subject2) values('과목3');
insert into tb2(subject2) values('과목5');
commit;
select * from tb2;


--UNION 합집합(중복 제거하고 합침)
select subject1 from tb1
union
select subject2 from tb2;

--UNION ALL 합집합(중복 상관없이 모두 합침)
select subject1 from tb1
union all
select subject2 from tb2;

--INTERSECT 교집합
select subject1 from tb1
intersect
select subject2 from tb2;

--MINUS(오라클) 차집합 -> 왼쪽 테이블 기준
select subject1 from tb1
minus
select subject2 from tb2;


--group by
create table com1(
priceval number not null,
dept varchar2(10) not null
);

desc com1;

insert into com1(priceval,dept) values(100,'영업부');
insert into com1(priceval,dept) values(200,'영업부');
insert into com1(priceval,dept) values(100,'관리부');
insert into com1(priceval,dept) values(400,'기획부');
insert into com1(priceval,dept) values(500,'기획부');
commit;
select * from com1;

--부서별로 금액의 합계
select sum(priceval)
from com1
group by dept;

--부서 중에서 영업부의 합계
--select sum(priceval) from com1 group by dept where dept='영업부'; 이렇게 쓰면 오류남
--group by ~ having 조건 이렇게 써야함
select sum(priceval) from com1 group by dept having dept='영업부'; --영업부의 합계
select sum(priceval) from com1 group by dept having dept<>'영업부'; --영업부가 아닌 것의 합계

--레코드가 2개 이상인 부서명과 부서의 합계를 조회
select sum(priceval) 합계, dept   --4 그 부서의 priceval 합계를 조회
from com1               --1 com1 테이블에서
group by dept           --2 부서별로 그룹화 하고
having count (*)>=2;    --3 레코드 갯수가 2개 이상인 부서를 가져오고
--그룹 설정
select dept
from com1
group by dept;
--그룹별 합계, 갯수
select sum(priceval) 합계, count(*) 갯수, dept
from com1
group by dept;
--그룹별 합계, 갯수 조건문 -> '영업부'의 합계, 부서의 총 갯수
select sum(priceval) as 합계, count(*) as 갯수, c.dept --as 생략가능(잊지말기)
from com1
group by dept
having dept='영업부';

select * from com1;
desc com1;

--뷰 생성
create or replace view com1_view as select dept from com1;
select * from com1_view;

drop view com1_view;

--수정
create or replace view com1_view
as
select dept,priceval from com1;
--뷰 구조 확인
desc com1_view;
--삭제
select * from com1_view;

desc board1207;

create table board1207(
bId number not null primary key,
writeId varchar2(20) not null,
bcontent varchar2(200) not null
);

select * from board1207;

