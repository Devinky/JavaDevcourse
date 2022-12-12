create table table1208(
num number not null
);

insert into table1208(num) values(10);
insert into table1208(num) values(20);
insert into table1208(num) values(30);
insert into table1208(num) values(40);
insert into table1208(num) values(50);

select * from table1208;
select sum(num) �հ� from table1208; --��Ī �ο�(as ���� ��)
select avg(num) as ��� from table1208;
select count(*) ���� from table1208; --���ڵ��� ���� ��
select max(num) �ִ� from table1208; --���ڵ��� �ִ�
select min(num) �ּڰ� from table1208; --���ڵ��� �ּڰ�

create table tb1(
subject1 varchar2(10) not null
);

create table tb2(
subject2 varchar2(10) not null
);

insert into tb1(subject1) values('����1');
insert into tb1(subject1) values('����2');
insert into tb1(subject1) values('����3');
insert into tb1(subject1) values('����4');
insert into tb1(subject1) values('����5');
commit;
select * from tb1;

insert into tb2(subject2) values('����1');
insert into tb2(subject2) values('����1');
insert into tb2(subject2) values('����3');
insert into tb2(subject2) values('����3');
insert into tb2(subject2) values('����5');
commit;
select * from tb2;


--UNION ������(�ߺ� �����ϰ� ��ħ)
select subject1 from tb1
union
select subject2 from tb2;

--UNION ALL ������(�ߺ� ������� ��� ��ħ)
select subject1 from tb1
union all
select subject2 from tb2;

--INTERSECT ������
select subject1 from tb1
intersect
select subject2 from tb2;

--MINUS(����Ŭ) ������ -> ���� ���̺� ����
select subject1 from tb1
minus
select subject2 from tb2;


--group by
create table com1(
priceval number not null,
dept varchar2(10) not null
);

desc com1;

insert into com1(priceval,dept) values(100,'������');
insert into com1(priceval,dept) values(200,'������');
insert into com1(priceval,dept) values(100,'������');
insert into com1(priceval,dept) values(400,'��ȹ��');
insert into com1(priceval,dept) values(500,'��ȹ��');
commit;
select * from com1;

--�μ����� �ݾ��� �հ�
select sum(priceval)
from com1
group by dept;

--�μ� �߿��� �������� �հ�
--select sum(priceval) from com1 group by dept where dept='������'; �̷��� ���� ������
--group by ~ having ���� �̷��� �����
select sum(priceval) from com1 group by dept having dept='������'; --�������� �հ�
select sum(priceval) from com1 group by dept having dept<>'������'; --�����ΰ� �ƴ� ���� �հ�

--���ڵ尡 2�� �̻��� �μ���� �μ��� �հ踦 ��ȸ
select sum(priceval) �հ�, dept   --4 �� �μ��� priceval �հ踦 ��ȸ
from com1               --1 com1 ���̺���
group by dept           --2 �μ����� �׷�ȭ �ϰ�
having count (*)>=2;    --3 ���ڵ� ������ 2�� �̻��� �μ��� ��������
--�׷� ����
select dept
from com1
group by dept;
--�׷캰 �հ�, ����
select sum(priceval) �հ�, count(*) ����, dept
from com1
group by dept;
--�׷캰 �հ�, ���� ���ǹ� -> '������'�� �հ�, �μ��� �� ����
select sum(priceval) as �հ�, count(*) as ����, c.dept --as ��������(��������)
from com1
group by dept
having dept='������';

select * from com1;
desc com1;

--�� ����
create or replace view com1_view as select dept from com1;
select * from com1_view;

drop view com1_view;

--����
create or replace view com1_view
as
select dept,priceval from com1;
--�� ���� Ȯ��
desc com1_view;
--����
select * from com1_view;

desc board1207;

create table board1207(
bId number not null primary key,
writeId varchar2(20) not null,
bcontent varchar2(200) not null
);

select * from board1207;

