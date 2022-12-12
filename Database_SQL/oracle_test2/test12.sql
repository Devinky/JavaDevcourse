create user users2 identified by 1111; --1.user생성
grant connect, resource to users2; --2.생성된 user에게 권한 부여(to)
grant connect, resource, dba to users2;
commit;

revoke connect, resource from users2; --3.권한 삭제(from)(자주 쓸 일은 별로 없음)
drop user users2; cascade; --4.사용자 삭제

show user;

select * from all_users; --모든 유저 조회
select username from dba_users; --유저 이름(username) 조회

exit;