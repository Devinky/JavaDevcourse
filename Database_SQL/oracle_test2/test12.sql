create user users2 identified by 1111; --1.user����
grant connect, resource to users2; --2.������ user���� ���� �ο�(to)
grant connect, resource, dba to users2;
commit;

revoke connect, resource from users2; --3.���� ����(from)(���� �� ���� ���� ����)
drop user users2; cascade; --4.����� ����

show user;

select * from all_users; --��� ���� ��ȸ
select username from dba_users; --���� �̸�(username) ��ȸ

exit;