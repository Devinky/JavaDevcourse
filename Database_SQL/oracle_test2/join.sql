drop table u1;
drop table u2;

create table u1(
userId varchar2(100) not null primary key,
userName varchar(100) not null
);

insert into u1(userId, userName) values('m1','s1'); --userId 중복x not null
insert into u1(userId, userName) values('m2','s1');
insert into u1(userId, userName) values('m3','s1');
commit;

create table b1(
board varchar2(200) not null,   --게시글
bId varchar2(100) not null      --게시글 작성자
);

insert into b1(board,bId) values('con1','m1');
insert into b1(board,bId) values('con2','m1');
insert into b1(board,bId) values('con3','m1');
insert into b1(board,bId) values('con3','m4');
insert into b1(board,bId) values('con3','m5');
insert into b1(board,bId) values('con3','m6');

select * from b1;

--inner join
select * --u1테이블(별칭)의 userid, b1테이블(별칭)의 board만 가져오기
from u1 u inner join b1 b --as로 별칭부여
on u.userid=b.bid;

select u.userid, b.board --u1테이블(별칭)의 userid, b1테이블(별칭)의 board만 가져오기
from u1 u inner join b1 b --as로 별칭부여
on u.userid=b.bid; --별칭사용
 --left outer join
SELECT *
from u1 u left outer join b1 b
on u.userid=b.bid;
--right outer join
SELECT *
from u1 u right outer join b1 b
on u.userid=b.bid;

--full outer join
select *
from u1 u full outer join b1 b
on u.userid=b.bid;

