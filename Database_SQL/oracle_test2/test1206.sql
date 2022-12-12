create user user1206 identified by 1234; --���� ����
grant connect, resource to user1206; --�ش� ������ connect, resource ���� �ο�

drop table member1206;

create table member1206(
    userId varchar2(20) not null,
    userPw varchar2(20) not null,
    age number(3) not null,
    email varchar2(200) not null,
    primary key(userId)
);

desc member1206;

--table�� ��Ű�� ��ȸ
select * from col where tname='member1206';

--�ǽ�
drop table member11;
create table member11(
userId varchar2(20) not null,
userPw varchar2(20) not null,
userAge varchar2(20) not null,
primary key(userId)
);

desc member11;

--userAge�� number(3)���� �����ϱ�
alter table member11 modify userAge number(3);

--���̵����� 5�� �Է�
insert into member11 (userid,userpw,userage) values('m1','11',11);
insert into member11 (userid,userpw,userage) values('m2','22',22);
insert into member11 (userid,userpw,userage) values('m3','33',33);
insert into member11 (userid,userpw,userage) values('m4','44',44);
insert into member11 (userid,userpw,userage) values('m5','55',55);
insert into member11 (userid,userpw,userage) values('abmcd','66',16);
--�߰�, ����, ����

commit;

select * from member11;
select count(*) from member11;

--in, not in
select * from member11 where userId in('m1','m2'); --m1,m2�� ���Ե� ���ڵ带 ��ȸ(������ ���� ���� �ᵵ �ȴ�)
select * from member11 where userId not in('m1','m2'); --m1,m2�� ���Ե��� ���� ������ ���ڵ带 ��ȸ

--like
select * from member11 where userId like 'm%'; --userid Į������ ����m�� �����ϴ� �ʵ� ��ȸ
select * from member11 where userId like '%s'; --userid Į������ ����s�� ������ �ʵ� ��ȸ
select * from member11 where userId like '%m%'; --userid Į������ 1�� ���۰� ���� ���Ե� ��� �ʵ� ��ȸ

--���ڿ�����||
select userid ||','|| userpw
from member11
where userage>20;
--userid�� userpw�� ��ǥ�� ���̿� �ΰ� ���ϱ�

--��������, �������� ��ȸ
select * from member11 
where userAge>10 
order by userAge desc; 
--userage�� 10���� ���� Į���� ������������ ��ȸ

select * from member11 order by userage asc; --��������(������asc)
select * from member11 order by userage desc; --��������(������desc)

select * from member11 order by userid asc; --��������
select * from member11 order by userid desc; --��������

select * from member11 order by userpw asc; --��������
select * from member11 order by userpw desc; --��������


select userid ||','|| userpw as userinfo -- select userid ||','|| userpw�� ����� userinfo�� ����
from member11
where userage>20;

--���� ��� ���� �̸�����(group by)
create table company(
no number(3) not null primary key,
dept varchar2(10) not null,
year varchar2(10) not null
);

insert into company(no, dept, year) values(1,'������','2021');
insert into company(no, dept, year) values(2,'������','2023');
insert into company(no, dept, year) values(3,'��ȹ��','2021');
insert into company(no, dept, year) values(4,'��ȹ��','2020');
insert into company(no, dept, year) values(5,'������','2022');

select * from company;

--select count(�����Լ�), sum(no), dept from ���̺� group by Į����(�׷�);
select count(*), sum(no), dept from company group by dept;

select dept from company group by dept; --dept�� �׷����� ��� ��ȸ
