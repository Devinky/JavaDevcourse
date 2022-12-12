drop table company;

--그룹
create table company(
no number(3) not null primary key,
dept varchar2(10) not null,
year varchar2(10) not null
);

insert into company(no, dept, year) values(1, '영업부', '2021');
insert into company(no, dept, year) values(2, '영업부', '2023');
insert into company(no, dept, year) values(3, '기획부', '2021');
insert into company(no, dept, year) values(4, '기획부', '2020');
insert into company(no, dept, year) values(5, '관리부', '2022');

commit;
rollback;

select * from company;

--부서별 레코드 조회
select dept from company group by dept; --그룹핑된 dept만 뽑아내기(*을 쓰면 모두 다 뽑기 때문에 오류가 남)
select sum(no) as SUM, dept from company group by dept; --부서별 그룹화해서 부서와 부서의 no의 합계(SUM으로 저장하여)를 출력
select sum(no) SUM, dept from company group by dept; --위와 같은 것. as를 생략해도 똑같음

--부서별로 no의 평균 조회
select avg(no) AVG, dept from company group by dept; 

select count(*) as deptNum, dept from company group by dept; --부서별 레코드 갯수

select max(no) from company; --테이블 no필드의 최댓값
select min(no) from company; --테이블 no필드의 최솟값

select max(no), dept from company group by dept; --부서별 no최댓값
select max(no) as maxnum, dept from company group by dept; --부서별 no최댓값에 별칭 부여

select min(no), dept from company group by dept; --부서별 no최솟값
select min(no) as minnum, dept from company group by dept; --부서별 no최솟값에 별칭 부여

--숫자함수
select round(0.123) from dual; --소수 첫째 자리에서 반올림
select round(0.123, 2) from dual; --소수 둘째 자리까지 반올림

select ceil(0.123) from dual;
select floor(0.123) from dual;

select power(3,2) from dual;
select mod(10,2) from dual;