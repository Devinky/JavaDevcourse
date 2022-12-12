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

select * from all_sequences; --모든 시퀀스 조회

select * from member_tbl_01;

insert into member_tbl_01 values(custno_seq.nextval, '김이름','010-1111-1111','서울 노원구','20221202','A','01'); --모든 필드를 전부 초기화할 거라면 (필드명 어쩌고 적는 그거) 생략 가능
insert into member_tbl_01 values(custno_seq.nextval, '이이름','010-1111-2222','서울 동대문구','20221206','B','01');
insert into member_tbl_01 values(custno_seq.nextval, '박이름','010-1111-3333','울릉군 울릉읍','20221001','B','30');
insert into member_tbl_01 values(custno_seq.nextval, '최이름','010-1111-4444','제주시 서귀포','20221213','A','30');

--인덱스 생성
select * from member1207;
desc member1207;

create index member1207_index on member1207(userid,userpw); --기본키로는 생성이 안됨
drop index member1207_index;

--인덱스 조회(모든 필드)
select * from user_indexes where table_name = 'member1207';
--인덱스 조회(선택 필드)
select table_name, index_name, column_name
from all_ind_columns
where table_name = 'mwmber1207';