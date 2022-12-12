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
insert into member1207(userid,userpw,age,email) VALUES('��1','1111',21,'m5@email.com');
insert into member1207(userid,userpw,age,email) VALUES('��2','2222',22,'m5@email.com');

commit; --�߰�, ����, ���� �� ����
ROLLBACK; --commit�� �ܰ� ��

select * from member1207;
select count(*) from member1207; --���̺��� Ʃ��(���ڵ�)�� �� ��ȸ***(�߿�)

--Į���� ���� ���ԵǾ��ִ� ���ڵ带 ��ȸ
select * from member1207 where userid in('m1');
select * from member1207 where userid in('m1','m2'); --���� ���� ��ȸ�� ���� ����

select * from member1207 where userid like '��%'; --�ʵ尡 ������ ���۵Ǵ� ���ڵ带 ��ȸ
select * from member1207 where userid like '%��'; --�ʵ尡 ������ ������ ���ڵ带 ��ȸ
select * from member1207 where userid like '%��%'; --�ʵ忡 ���� ���ԵǾ��ִ� ���ڵ带 ��ȸ

select * from member1207 where age>=20 and userid like '��%'; --���̰� 20 �̻��̸鼭 id�� ������ �����ϴ� ���ڵ带 ��ȸ(�� ������ �Բ� ����� ���� and�� ���)
select * from member1207 where age>20 and userid like '%m1%';

select userid ||'-'|| email as userinfo from member1207; --�ʵ�� �ʵ带 ���ļ� �ϳ��� ���ο� �ʵ带 ����(as�� ����Ͽ� �� �̸��� �����ϰ� �װ��� ����)

select * from member1207;

--�������� �������� ��ȸ (�⺻ asc)
select * from member1207 order by age; --���̼����� �������� ��ȸ �⺻�� asc(���� ����)
select * from member1207; --���� �Ȱ���(asc�����Ǿ��ִ� ���°� �̰�)
select * from member1207 order by age desc; --���̼� �������� ��ȸ(desc �������)
select * from member1207 order by userid asc; --���ڿ� �⺻ ���������� ����->����->�ѱ� ������ ����
select * from member1207 order by userid desc; --���������� �ѱ�->����->����
