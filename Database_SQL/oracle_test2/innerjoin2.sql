
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

insert into member_06 values(custno_seq.nextval, '���̸�','010-1111-1111','���� ������ �ֹ���','20221201','A','01');
insert into member_06 values(custno_seq.nextval, '���̸�','010-2222-2222','���� ����� �߰赿','20221001','B','01');
insert into member_06 values(custno_seq.nextval, '���̸�','010-3333-3333','���� ������ â��','20220909','A','03');
insert into member_06 values(custno_seq.nextval, '���̸�','010-4444-4444','��⵵ ������','20221130','C','03');
insert into member_06 values(custno_seq.nextval, '���̸�','010-5555-5555','��⵵ ������ ������','20220405','B','05');
insert into member_06 values(custno_seq.nextval, '���̸�','010-6666-6666','�λ� �ؿ�뱸','20220815','C','06');

update member_06 set custname='���̸�', phone='010-6666-6666', address='�λ� �ؿ�뱸' where custno=100006;

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

--2. �׷���
select m1.custno, m1.custname
from member_06 m1 inner join money_07 m2
on m1.custno=m2.custno
group by (m1.custname,m1.custno);

--3. �����Լ�
select m1.custno, m1.custname, sum(m2.price) as �����հ�
from member_06 m1 inner join money_07 m2
on m1.custno=m2.custno
group by (m1.custname, m1.custno); --�Ȱ��� �����͸� �ϳ��� ������ ����

--4. �����Լ�2
select m1.custno, m1.custname, m1.grade, sum(m2.price) as �����հ�
from member_06 m1 inner join money_07 m2
on m1.custno=m2.custno
group by (m1.custname, m1.custno, m1.grade);

--5. ����
select m1.custno, m1.custname, m1.grade, sum(m2.price) �����հ�
from member_06 m1 inner join money_07 m2
on m1.custno=m2.custno
group by (m1.custname, m1.custno, m1.grade)
order by �����հ� desc;

select count(*) from member_06;

select max(custno) from member_06;
select min(custno) from member_06;

select price from money_07;
select sum(price) as ����, avg(price) ���, max(price) �ִ���� from money_07;

select sum(price) as ����, avg(price) ���, max(price) �ִ����
from money_07
where between '22/01/01' and '22/01/05';
desc money_07
select sdate from money_07;


select m2.custno, sum(m2.price) �ѱݾ�
from money_07 m2 inner join member_06 m1
on m2.custno=m1.custno
group by (m2.custno)
order by �ѱݾ� desc;
