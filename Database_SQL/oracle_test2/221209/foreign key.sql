drop table member1209;

create table member1209( --글 작성자 테이블
mId number not null primary key, --글 작성자 고유아이디(null X, 중복불가), PK, 유니크
userId varchar2(10) not null,
userPw varchar2(10) not null,
email varchar(20) not null
);
--member1209의 기본키를 외래키로 가져올 테이블
create table board1209( --게시글 테이블
bId number not null primary key,
title varchar2(10) not null,
content varchar2(100) not null,
mid number not null,
CONSTRAINT fk_mid foreign key(mId) references member1209(mId) --member1209의 mId참조
);
--CONSTRAINT [FK명] foreign key([FK가 될 컬럼명]) references [PK가 위치하는 테이블] ([PK컬럼명])

insert into member1209(mid, userid, userpw, email) values(1,'m1','11','m1@email.com');
insert into member1209(mid, userid, userpw, email) values(2,'m2','22','m2@email.com');
insert into member1209(mid, userid, userpw, email) values(3,'m3','33','m3@email.com');
insert into member1209(mid, userid, userpw, email) values(4,'m4','44','m4@email.com');
commit;

select * from member1209;

--insert into board1209(bid, title, content, mid) values(1,'t1','c1',5); --참조무결성 위반(기본키에 없는 내용을 참조하려고 함(5))
--insert into board1209(bid, title, content, mid) values(1,'t1','c1');
insert into board1209(bid, title, content, mid) values(1,'t1','c1',1);
insert into board1209(bid, title, content, mid) values(2,'t2','c2',2);
insert into board1209(bid, title, content, mid) values(3,'t3','c3',3);
commit;

select * from board1209;

----------------------테이블 생성 후 외래키 설정------------------
drop table board01;
drop table member01;

CREATE TABLE board01
(
	bId number NOT NULL,
	bTitle varchar2(100) NOT NULL,
	bContent varchar2(255) NOT NULL,
	bWriteId varchar2(10) NOT NULL,
	PRIMARY KEY (bId)
);


CREATE TABLE member01
(
	userId varchar2(10) NOT NULL,
	userPw varchar2(10) NOT NULL,
	email varchar2(200) NOT NULL,
	PRIMARY KEY (userId)
);

ALTER TABLE board01 --외래키가 있는 테이블
	ADD FOREIGN KEY (bWriteId) --외래키 생성
	REFERENCES member01 (userId) --참조테이블의 연결키(기본키이거나 기본키성질) constraint 생략 가능
;

insert into member01(userid, userpw, email) values('m1','11','m1@email');
insert into member01(userid, userpw, email) values('m2','21','m2@email');
insert into member01(userid, userpw, email) values('m3','31','m3@email');
insert into member01(userid, userpw, email) values('m4','41','m4@email');
insert into member01(userid, userpw, email) values('m5','51','m5@email');
commit;

select * from member01;

--시퀀스 생성 board01_SEQUENCE
create sequence board01_SEQUENCE
start with 1
increment by 1
nocycle;

desc board01;

--insert into board01(bid, btitle, bcontent, bwriteid, userid)
insert into board01(bid, btitle, bcontent, bwriteid) values(board01_sequence.nextval,'t1','c1','m1');
insert into board01(bid, btitle, bcontent, bwriteid) values(board01_sequence.nextval,'t2','c2','m2');
insert into board01(bid, btitle, bcontent, bwriteid) values(board01_sequence.nextval,'t3','c3','m3');
insert into board01(bid, btitle, bcontent, bwriteid) values(board01_sequence.nextval,'t4','c4','m3');


select * from board01;
