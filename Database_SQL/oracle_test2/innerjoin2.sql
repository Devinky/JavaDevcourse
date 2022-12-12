
CREATE TABLE member_06(
custno number(6) not null,
custname varchar2(20),
phone varchar2(13),
address varchar2(60),
joindata date,
grade char(1),
city char(2),
primary key(custno)
);

CREATE TABLE money_07(
custno number(6),
saleno1 number(8),
pcost number(8),
amount number(4),
price number(8),
pcode varchar2(4),
sdate date
);

desc member_06;
desc money_07;

create sequence custno_seq
increment by 1
start with 100001
nocycle;

insert into member_06 values(custno_seq.nextval, '김이름','010-1111-1111','서울 도봉구 쌍문동','20221201','A','01');
insert into member_06 values(custno_seq.nextval, '이이름','010-2222-2222','서울 노원구 중계동','20221001','B','01');
insert into member_06 values(custno_seq.nextval, '박이름','010-3333-3333','서울 도봉구 창동','20220909','A','03');
insert into member_06 values(custno_seq.nextval, '최이름','010-4444-4444','경기도 수원시','20221130','C','03');
insert into member_06 values(custno_seq.nextval, '조이름','010-5555-5555','경기도 의정부 망원동','20220405','B','05');
insert into member_06 values(custno_seq.nextval, '장이름','010-6666-6666','부산 해운대구','20220815','C','06');

update member_06 set custname='장이름', phone='010-6666-6666', address='부산 해운대구' where custno=100006;

insert into money_07 values(100001, 2022001, 500, 5, 2500, 'A001', '20220101');
insert into money_07 values(100001, 2022002, 1000, 4, 4000, 'A002', '20220101');
insert into money_07 values(100001, 2022003, 500, 3, 1500, 'A008', '20220101');
insert into money_07 values(100002, 2022004, 2000, 1, 2000, 'A004', '20220102');
insert into money_07 values(100002, 2022005, 500, 1, 500, 'A001', '20220103');
insert into money_07 values(100003, 2022006, 1500, 2, 3000, 'A003', '20220103');

insert into money_07 values(100007, 2022001, 500, 5, 2500, 'A001', '20220101');
insert into money_07 values(100007, 2022002, 1000, 4, 3000, 'A002', '20220102');
insert into money_07 values(100008, 2022003, 1500, 3, 3500, 'A003', '20220103');
insert into money_07 values(100008, 2022004, 2000, 2, 4000, 'A004', '20220104');

select * from member_06;
select * from money_07;

commit;

--1. inner join
select m1.custno, m1.custname, m2.pcost --3
from member_06 m1 inner join money_07 m2 --1
on m1.custno=m2.custno; --2

--2. 그룹핑
select m1.custno, m1.custname
from member_06 m1 inner join money_07 m2
on m1.custno=m2.custno
group by (m1.custname,m1.custno);

--3. 집합함수
select m1.custno, m1.custname, sum(m2.price) as 지출합계
from member_06 m1 inner join money_07 m2
on m1.custno=m2.custno
group by (m1.custname, m1.custno); --똑같은 데이터를 하나의 행으로 묶음

--4. 집합함수2
select m1.custno, m1.custname, m1.grade, sum(m2.price) as 지출합계
from member_06 m1 inner join money_07 m2
on m1.custno=m2.custno
group by (m1.custname, m1.custno, m1.grade);

--5. 정렬
select m1.custno, m1.custname, m1.grade, sum(m2.price) 지출합계
from member_06 m1 inner join money_07 m2
on m1.custno=m2.custno
group by (m1.custname, m1.custno, m1.grade)
order by 지출합계 desc;

select count(*) from member_06;

select max(custno) from member_06;
select min(custno) from member_06;

select price from money_07;
select sum(price) as 총합, avg(price) 평균, max(price) 최대매출 from money_07;

select sum(price) as 총합, avg(price) 평균, max(price) 최대매출
from money_07
where between '22/01/01' and '22/01/05';
desc money_07
select sdate from money_07;


select m2.custno, sum(m2.price) 총금액
from money_07 m2 inner join member_06 m1
on m2.custno=m1.custno
group by (m2.custno)
order by 총금액 desc;
