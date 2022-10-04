select first_name 
from customer
;
select 
	first_name
,	last_name 
,	email 
from customer
;
select 
	*
from customer c
;

select 
	first_name || ' ' || last_name as full_name
,	email
	from customer c 
; 

-----------------------
select *
from gmv_trend;

select *
from gmv_trend 
limit 5;	-- 데이터를 5 행까지만 가져오기

-- 특정 컬럼 추출하기
select category as 카테고리 , yyyy 년, mm 월
from gmv_trend gt ;

-- 중복값없이 특정 컬럼 추가하기(종류가 몇 가지인지 알아볼 수 있음)
select distinct category 
from gmv_trend gt 

-- 2 카테고리의 조합의 중복 확인
select distinct category, yyyy
from gmv_trend

----
select a.customer_id as cust_id
,	   a.first_name || ' ' || a.last_name as "full name"
,	   a.email as 이메일
from customer as A
;

-----특정연도의 매출 탐색하기
select *
from gmv_trend gt 
where yyyy=2021
;

---2019년 이후의 매출 탐색
select *
from gmv_trend gt 
where yyyy >= 2019;

--between ~ and
select *
from gmv_trend gt 
where yyyy between 2018 and 2020;

-- 조건이 하나일 때, 문자열
select *
from gmv_trend gt 
where category = '컴퓨터 및 주변기기';

-- amount 컬럼의 값 11.00 보다 큰 행을 추출하시오
-- id, amount, date
select*
from payment p 
limit 1;

select A.payment_id
, 	   A.amount
,	   A.payment_date
from payment as A
where amount >= 11.00 ;

-- amount 컬럼의 값이 0.99 보다 작은 행을 추출하시오.
-- id, amount, date
select p.payment_id 
,	   p.amount 
,	   p.payment_date 
from payment p 
where p.amount > 0.99;

-- 조건이 여러개일 때
-- and 조건
select *
from gmv_trend gt 
where category = '컴퓨터 및 주변기기' and yyyy = 2021;

--or 조건
select *
from gmv_trend gt 
where gmv > 1000000 or gmv <10000;

--and, or 조건 혼용
select *
from gmv_trend gt 
where (gmv > 1000000 or gmv <10000 )and yyyy=2021;

-- first_name이 Tiffany 이고 last_name이 'Jordan'인 행을 추출하시오.
select *
from customer as c  
where c.first_name  ='Tiffany' and c.last_name = 'Jordan';

-- first_name이 'Michael' 이거나 last_name이 'Lee'인 행을 추출하시오.
select c.first_name
,	   c.last_name 
from customer c 
where c.first_name ='Michael' or c.last_name ='Lee';

-- first_name이 'Tiffany' 가 아니고 last_name이 'Jordan'도 아닌 행을 추출하시오.
select c.first_name 
,	   c.last_name 
from customer c 
where c.first_name <> 'Tiffany' and c.last_name <>'Jordan';

--payment 테이블: amount가 10부터 11사이에 있는 행을 모두 리턴하시오
-- 				cu_id, pa_id, amount
select p.customer_id  cu_id
,	   p.payment_id  pa_id
,	   p.amount 
from payment p 
where p.amount between 10 and 11;

--payment 테이블: amount가 10부터 11사이에 있지 않은 행을 모두 리턴하시오.
-- 				cu_id, pa_id, amount
select p.customer_id  cu_id
,	   p.payment_id  pa_id
,	   p.amount 
from payment p 
where p.amount not between 10 and 11;	-- not 으로 부정

-- 2007-02-14-21:21:59.996
-- payment_date 가 2007년 2월 14일의 모든 행을 리턴하시오.
select p.customer_id 
,	   p.payment_id 
,	   p.amount 
, 	   p.payment_date 
from payment p 
where p.payment_date between '2007-02-14 00:00:00.000000'
and '2007-02-14 23:59:59.999999'
order by p.payment_date desc

-- 매출이 낮은 순으로 정렬 추출하시오.
select *
from gmv_trend gt 
order by gmv;

--first_name 컬럼의 값을 기준으로 오름차순/내림차순 정렬하시오.
select 
	c.customer_id 
,	c.first_name 
,	c.last_name 
from customer c 
order by c.first_name desc ;

-- first_name 컬럼값 기준 내림차순 정렬한 후 , last_name 컬럼값 기준 오름차순 정렬
select 
	c.customer_id 
,	c.first_name 
,	c.last_name 
from customer c 
order by c.first_name desc, c.last_name asc ;


select 
	A.customer_id 
,	A.first_name 
,	length(A.last_name) as LENGTH_LAST_NAME
,	A.last_name 
from customer A
order by LENGTH_LAST_NAME desc; -- 컬럼 별칭으로 정렬 적용 가능

select 
	A.customer_id 
,	A.first_name 
,	length(A.last_name) as LENGTH_LAST_NAME
,	A.last_name 
from customer A
order by 3 desc;	--컬럼 순번만 적어도 정렬 적용 가능

------
drop table if exists tb_sort_test;

create table tb_sort_test
(
	num int
);

insert into tb_sort_test values(1);
insert into tb_sort_test values(2);
insert into tb_sort_test values(3);
insert into tb_sort_test values(null);
select *from tb_sort_test ;

-- null이 무조건 맨 위로 올라오게 하기
select *
from tb_sort_test 
order by num nulls first;

-- null이 무조건 맨 밑으로 내려가게 하기 -> 그 다음 정렬하기
select *
from tb_sort_test 
order by num desc nulls last;

--IN 연산자
select *
from gmv_trend gt 
where category in ('컴퓨터 및 주변기기', '생활용품')
order by category 

select *
from gmv_trend gt 
where category not in ('컴퓨터 및 주변기기', '생활용품')
order by category desc

-- customer_id의 값이 1 혹은 2 인 행을 모두 리턴하시오
select 
	r.customer_id 
,	r.rental_id 
,	r.return_date 	
from rental r
where r.customer_id in(1,2) 
order by r.return_date 
 ;
 
-- in 연산자와 or연산은 결과 집합이 동일함
select 
	r.customer_id 
,	r.rental_id 
,	r.return_date 	
from rental r
where r.customer_id = 1 or r.customer_id  =2 
order by r.return_date 
 ;
 
-- customer_id의 값이 1 혹은 2가 아닌 모든 행을 모두 리턴하시오
select 
	r.customer_id 
,	r.rental_id 
,	r.return_date 	
from rental r
where r.customer_id not in(1,2) 
order by r.return_date 
 ;
 
select 
	A.customer_id 
,	A.rental_id 
,	A.return_date
from rental A
where A.customer_id  <> 1
and A.customer_id  <> 2
order by A.return_date desc 

-- film_id 기준으로 정렬한 후 정렬된 집합 중에서 3번(4번째 행)부터 5건만 출력
select
	A.film_id 
,	A.title 
,	A.release_year 
from film A
order by A.film_id 
limit 5 offset 3;

-- rental 테이블: rental_date 컬럼을 기준으로 내림차순 정렬한 후 정렬된 집합 중에서 10건만 출력
--				 = 대여정보 최근 10건 조회
select *
from rental r
order by r.rental_date desc 
limit 10;


select 
	f.film_id 
,	f.title 
,	f.release_year 
from film f 
order by f.film_id 
fetch first 5 row -- 5행
only

--출력하는 시작 행은 4번쨰 행부터 2건만 출력하시오.
select 
	f.film_id 
,	f.title 
,	f.release_year 
from film f 
order by f.film_id
offset 3 row
fetch first 5 row 
only

----
select *
from gmv_trend gt 
where category like '%패션%'

--first_name 이 "Jen"으로 시작하는 모든 행을 리턴하시오.
-- cu_id, first_n, last_n
select c.customer_id, c.first_name , c.last_name  
from customer c 
where c.first_name like 'Jen%';

-- Jen + 3자리 : Jen으로 시작하는 총 6자리 포함된 행 리턴
select c.customer_id, c.first_name , c.last_name  
from customer c 
where c.first_name like 'Jen___';

-- 총 6자리 이상인 모든 행 리턴함
select c.customer_id, c.first_name , c.last_name  
from customer c 
where c.first_name like 'Jen___%';

-- null 비교
drop table if exists tb_contact;
create table tb_contact
(
	contact_no serial primary key
,	first_nm varchar(50) not null
,	last_nm varchar(50) not null
, 	email_adres varchar(255) not null
, 	phone_number varchar(15)
);

insert into tb_contact(first_nm, last_nm, email_adres, phone_number)
values ('순신', '이', 'sclee@gmail.com', '010-2222-3333');
insert into tb_contact(first_nm, last_nm, email_adres, phone_number)
values ('방원', '이', 'bwlee@gmail.com', null);
select * from tb_contact ;

--phone_number 컬럼의 값이 null인 행을 리턴하시오
select 
	A.contact_no
,	A.first_nm
,	A.last_nm
,	A.phone_number
from tb_contact as A
where A.phone_number is null;

--phone_number 컬럼의 값이 null인 행을 리턴하시오
select 
	A.contact_no
,	A.first_nm
,	A.last_nm
,	A.phone_number
from tb_contact as A
where A.phone_number is not null;

----CASE 문
-- 길이(LENGTH)가 50분 이하면 short로 함
-- 길이가 50분을 초과하고 120분 보다 작거나 같으면 medium으로 함
-- 길이가 120분을 초과하면 long으로 함
select 
	A.title 
,	A.length 
,	case when length >0 and length <=50 then 'short'
		 when length >50 and length <=120 then 'medium'
		 when length >120 then 'long'
	end duration 
from film A
order by A.title 
;

-- 길이(LENGTH)가 50분 이하면 1로 함
-- 길이가 50분을 초과하고 120분 보다 작거나 같으면 2으로 함
-- 길이가 120분을 초과하면 3으로 함
-- 내림차순 정렬

select 
	A.title 
,	A.length 
,	case when length >0 and length <=50 then 'short'
		 when length >50 and length <=120 then 'medium'
		 when length >120 then 'long'
	end duration 
from film A
order by case when length >0 and length <=50 then 1
			  when length >50 and length <=120 then 2
			  when length >120 then 3
		 end desc, A.length desc	-- 3,2,1로 정렬 후 length기준으로 재정렬
;





