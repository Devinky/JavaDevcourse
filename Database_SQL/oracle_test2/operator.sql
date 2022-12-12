
create table member2(
    userId varchar2(100) not null,
    userAge number not null,
    userName varchar2(100) not null
);

desc member2;

insert into member2(userId,userAge,userName) values('m1','11','s1');
insert into member2(userId,userAge,userName) values('m2','21','s2');
insert into member2(userId,userAge,userName) values('m3','31','s3');
insert into member2(userId,userAge,userName) values('m4','41','s4');
insert into member2(userId,userAge,userName) values('m5','51','s5');

select * from member2;
select * from member2 where userAge=11;
select userid from member2 where userAge>=21;
select userid, username from member2 where userAge>=21;
select * from member2 where userage<>11;
select * from member2 where userage^=21;

select userage+10 from member2;
select userage*10 from member2;
select userage/10 from member2;
select userage-10 from member2;
select (userage-10)*10 from member2;

select * from member2;
select userage from member2 where userid='m1' and username='s1';

--member2 ���̺��� userage�� 20�̻� 40������ ��� �ʵ带 ��ȸ
select * from member2 where userage>=20 and userage<=40;
--���ǿ� �´� ��ü ���ڵ带 ��ȸ
select * from member2 where userid='m1' or username='s3';
--���ǿ� false�� ��ü ���ڵ带 ��ȸ
select * from member2 where not userid='m1';
--����2�� ��� false�� ��ü ���ڵ� ��ȸ
select * from member2 where not userid='m1' and not userage<=30;
--���� �ϳ��� false �ٸ� �ϳ��� true�� ��ü ���ڵ� ��ȸ
select * from member2 where not userid='m1' and userage<=30;
--member2 ���̺��� userage�� 20�̻� 40������ ��� �ʵ� ��ȸ(between���)
select * from member2 where userage between 20 and 40;

desc member1;