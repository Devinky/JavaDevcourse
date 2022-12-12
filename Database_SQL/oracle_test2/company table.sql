drop table company;

--�׷�
create table company(
no number(3) not null primary key,
dept varchar2(10) not null,
year varchar2(10) not null
);

insert into company(no, dept, year) values(1, '������', '2021');
insert into company(no, dept, year) values(2, '������', '2023');
insert into company(no, dept, year) values(3, '��ȹ��', '2021');
insert into company(no, dept, year) values(4, '��ȹ��', '2020');
insert into company(no, dept, year) values(5, '������', '2022');

commit;
rollback;

select * from company;

--�μ��� ���ڵ� ��ȸ
select dept from company group by dept; --�׷��ε� dept�� �̾Ƴ���(*�� ���� ��� �� �̱� ������ ������ ��)
select sum(no) as SUM, dept from company group by dept; --�μ��� �׷�ȭ�ؼ� �μ��� �μ��� no�� �հ�(SUM���� �����Ͽ�)�� ���
select sum(no) SUM, dept from company group by dept; --���� ���� ��. as�� �����ص� �Ȱ���

--�μ����� no�� ��� ��ȸ
select avg(no) AVG, dept from company group by dept; 

select count(*) as deptNum, dept from company group by dept; --�μ��� ���ڵ� ����

select max(no) from company; --���̺� no�ʵ��� �ִ�
select min(no) from company; --���̺� no�ʵ��� �ּڰ�

select max(no), dept from company group by dept; --�μ��� no�ִ�
select max(no) as maxnum, dept from company group by dept; --�μ��� no�ִ񰪿� ��Ī �ο�

select min(no), dept from company group by dept; --�μ��� no�ּڰ�
select min(no) as minnum, dept from company group by dept; --�μ��� no�ּڰ��� ��Ī �ο�

--�����Լ�
select round(0.123) from dual; --�Ҽ� ù° �ڸ����� �ݿø�
select round(0.123, 2) from dual; --�Ҽ� ��° �ڸ����� �ݿø�

select ceil(0.123) from dual;
select floor(0.123) from dual;

select power(3,2) from dual;
select mod(10,2) from dual;