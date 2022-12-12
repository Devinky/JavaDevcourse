desc member2;
select * from member2;

drop table member2;

drop table member1;

--���̺� ����
create table member1(
    userId varchar2(20) not null,
    userPw varchar2(20) not null,
    age number(3) not null,
    email varchar2(100) not null,
    primary key(userId)
);

alter table member1 add email varchar2(100); --�� �߰�
alter table member1 modify email varchar2(200); --�� ����
alter table member1 drop(email); --�� ����
alter table member1 DROP COLUMN email; --�� ����
desc member1;

alter table member1 rename to member11; --���̺� �̸� ����
desc member11;
commit;

alter table member11 rename to member1;
desc member1;

--CRUD
--��ȸ
select * from member1;
select userId from member1;
select userId, userPw from member1;
select userId, userPw, age from member1;
select userId, userPw, age, email from member1;

--���̵����� �߰�
insert into member1(userId, userPw, age, email) values('m1','11',11,'m1@email.com');
insert into member1(userId, userPw, age, email) values('m2','22',21,'m2@email.com');
insert into member1(userId, userPw, age, email) values('m3','33',31,'m3@email.com');
insert into member1(userId, userPw, age, email) values('m4','44',41,'m4@email.com');
insert into member1(userId, userPw, age, email) values('m5','55',51,'m5@email.com');

select * from member1;
select userId from member1;
select userId, userPw from member1;
select userId, userPw, age from member1;
select userId, userPw, age, email from member1;

--����
update member1 set userPw='11', age=30 where userId='m1';
commit;

--����
delete from member1 where userId='m1'; --���ǿ� �´� ���ڵ� ����
delete from member1 where userId='m2';
delete from member1; --��� ���̺��� ���ڵ� ����

select * from member1;
