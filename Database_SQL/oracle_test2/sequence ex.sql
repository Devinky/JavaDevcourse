create sequence custno_seq
start with 100001
increment by 1
nocycle;

create table member_tbl_01(
custno number(6) not null,
custname varchar2(20),
phone varchar2(13),
address varchar2(60),
joindate date,
grade char(1),
city char(2),
primary key(custno)
);

select * from all_sequences; --��� ������ ��ȸ

select * from member_tbl_01;

insert into member_tbl_01 values(custno_seq.nextval, '���̸�','010-1111-1111','���� �����','20221202','A','01'); --��� �ʵ带 ���� �ʱ�ȭ�� �Ŷ�� (�ʵ�� ��¼�� ���� �װ�) ���� ����
insert into member_tbl_01 values(custno_seq.nextval, '���̸�','010-1111-2222','���� ���빮��','20221206','B','01');
insert into member_tbl_01 values(custno_seq.nextval, '���̸�','010-1111-3333','�︪�� �︪��','20221001','B','30');
insert into member_tbl_01 values(custno_seq.nextval, '���̸�','010-1111-4444','���ֽ� ������','20221213','A','30');

--�ε��� ����
select * from member1207;
desc member1207;

create index member1207_index on member1207(userid,userpw); --�⺻Ű�δ� ������ �ȵ�
drop index member1207_index;

--�ε��� ��ȸ(��� �ʵ�)
select * from user_indexes where table_name = 'member1207';
--�ε��� ��ȸ(���� �ʵ�)
select table_name, index_name, column_name
from all_ind_columns
where table_name = 'mwmber1207';