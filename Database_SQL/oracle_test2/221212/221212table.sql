/* Create Tables */
CREATE TABLE Board1212
(
	no number NOT NULL,
	bTitle varchar2(100 char),
	bContent varchar2(255 char),
	nickName varchar2(12 char) NOT NULL,
	bTime date NOT NULL,
	bWriterId varchar2(20 char) NOT NULL,
	PRIMARY KEY (no)
);

create sequence board1212_SEQUENCE
start with 1
increment by 1
nocycle;

CREATE TABLE Member1212
(
	userId varchar2(20 char) NOT NULL,
	userPw varchar2(20 char) NOT NULL,
	email varchar2(100 char) NOT NULL,
	PRIMARY KEY (userId)
);

select SYSDATE from dual;
select SYSDATE+10 from dual; --���� ��¥+10
select SYSTIMESTAMP from dual;
select ADD_MONTHS(SYSDATE,4)  from dual; --���� ��¥���� 4���� ��
select LAST_DAY(SYSDATE) from dual; --������ ���� ���� ������ ��
select NEXT_DAY(SYSDATE,'������') from dual; --������ ������ �������� ��ȸ

select to_char (SYSDATE,'yyyy-mm-dd hh:mi:ss') from dual; --��¥�� char�� ����ȯ
select to_date ('2022-12-12 10:33:33','yyyy-mm-dd hh:mi:ss') from dual; --���ڿ��� ��¥�� ����ȯ

/* Create Foreign Keys */
ALTER TABLE Board1212
	ADD FOREIGN KEY (bWriterId)
	REFERENCES Member1212 (userId)
;

insert into member1212(userId, userPw, email) values('admin','0000','admin@email.com');
insert into member1212(userId, userPw, email) values('m1','1111','m1@email.com');
insert into member1212(userId, userPw, email) values('m2','2222','m2@email.com');
insert into member1212(userId, userPw, email) values('m3','3333','m3@email.com');
insert into member1212(userId, userPw, email) values('m4','4444','m4@email.com');
insert into member1212(userId, userPw, email) values('m5','5555','m5@email.com');

commit;

insert into board1212(no, bTitle, bContent, nickName, bTime, bWriterId)
values(board1212_sequence.nextval, '����1', '����1', '��Ī1', sysdate, 'm1');
insert into board1212(no, bTitle, bContent, nickName, bTime, bWriterId)
values(board1212_sequence.nextval, '����2', '����2', '��Ī2', sysdate, 'm1');
insert into board1212(no, bTitle, bContent, nickName, bTime, bWriterId)
values(board1212_sequence.nextval, '����3', '����3', '��Ī3', sysdate, 'm2');
insert into board1212(no, bTitle, bContent, nickName, bTime, bWriterId)
values(board1212_sequence.nextval, '����4', '����4', '��Ī4', sysdate, 'm3');

commit;

select count(*) from member1212 where userid='m1'and userpw='2222';

select * from board1212;
select * from member1212;

--m1�� �ۼ��� board1212�� �Խñ� ����� ���(inner join)
select 
from board1212 b inner join member1212 m
on b.bwriterid=m.userid;

