-- NULLIF 함수
select 
	nullif(1,1) as 첫번째			--1,1이 같으니 null이 리턴됨
,	nullif(1,0) as 두번째			--1,0이 다르니 첫 번째 인자인 1이 리턴
,	nullif('A','A') 세번째    	--A,A는 같으니 null리턴
,	nullif('A','B') 네번째		--A,B는 다르니 첫번째 인자인 A가 리턴

-- COALESCE 함수
select
	coalesce(null,1) 첫번째		--첫 번째 인자가 null이라 null이 아닌 두 번째 인자 리턴
,	coalesce(1,0)	 두번째		--첫 번째 인자가 null이 아니니 첫번째 인자 그대로 리턴
,	coalesce ('a','b') 세번째		--첫 번째 인자가 null이 아니니 첫번째 인자 그대로 리턴
, 	coalesce (null, 'b') 네번째	--첫 번째 인자가 null이라 null이 아닌 두 번째 인자 리턴

-- CAST 함수
-- 문자열 '100'을 INTEGER형으로 변환
select cast ('100' as integer) CAST_AS_INTEGER

--문자와 숫자가 혼합된 문자열은 INTEGER형으로 변환할 수 없음
select cast ('10c' as integer)  CAST_AS_INTEGER

--문자열을 날짜형으로 형변환
select cast('2023-01-01' as date) as 첫번째
,	   cast('01-oct-2023'as date) as 두번째
--오류 : 유효한 날짜가 아닌 경우
select cast('2022-20-30'as date)

--문자열을 실수형으로 형변환
select cast ('10.2'as double precision) 첫번째
-- 오류: 문자열 안의 데이터가 실수형이 아니기 때문에 변환 불가
select cast('십점영이' as double precision) 첫번째

--문자열을 INTERVAL 형으로 형변환
select cast('15 minute' as interval) 첫번째
,	   cast('2 hour' as interval) 두번째
,	   cast('1 day' as interval) 세번째
,	   cast('2 week'as interval) 네번째
, 	   cast('3 month' as interval) 다섯번째

select now();
--문자열을 TIMESTAMP 형식으로 변환, 시간 계산
select 
	cast('2022-09-26 10:43:44.274' as timestamp) - cast('2hour'as interval) 첫번째
	
--문자열 함수: 문자열을 ascii코드값으로 변환하는 함수
select 
	ascii('A') as "ascii('A')"	--문자 'A'의 아스키 코드값 리턴
,	chr(65) as "chr(65)"		--아스키 코드 65의 문자 리턴
,	concat('A', 'B', 'C') "concat('A', 'B', 'C')" 			--문자열 합침
	--구분자를 넣어 문자열 합침
,	concat_ws('|','A','B','C') "concat_ws('|','A','B','C')"	
	--구분자가 있는 문자열에서 2 번째 문자열을 리턴
,	split_part('A|B|C', '|', 2) "split_part('A|B|C', '|', 2)"
,   left('ABC',1) "left('ABC',1)"		-- 왼쪽에서 1 번째 문자 리턴
,	right('ABC',1) "right('ABC',1)" 	-- 오른쪽에서 1 번째 문자 리턴
,	length('ABC') "length('ABC')"		-- 문자열 길이 리턴
,	lower('ABC') "lower('ABC')"			-- 소문자로 바꿈
,	upper('abc') "upper('abc')"			-- 대문자로 바꿈
	-- 총 6자리 문자열로 문자열이 없는 왼쪽/오른쪽 공간에 0을 채움
, 	lpad('123', 6, '0') "lpad('123', 6, '0')"
, 	rpad('123', 6, '0') "rpad('123', 6, '0')"
	-- 왼쪽/오른쪽/양쪽에 있는 공백을 제거함
, 	ltrim(' 123') "ltrim(' 123')"
,	rtrim('123 ') "rtrim('123 ')"
, 	trim(' 123 ') "trim(' 123 ')"
	-- ABC문자열에서 B를 찾아서 그 순서를 리턴함
,	position('B' in 'ABC') "position('B' in 'ABC')"
,	repeat('*',10) "repeat('*',10)"		-- *를 10번 반복함
,	reverse('NEZE') "reverse('NEZE')" 	-- 문자열을 거꾸로 출력함
,	substring('ABC',2,2) "substring('ABC',2,2)" --2 번째 문자로부터 2 개의 문자를 출력함

--날짜 관련 함수
--AGE 함수 : 첫 번째 인자값-두 번째 인자값으로 시간(세월)의 차이를 리턴
select 
	age('2023-01-11', '2022-09-26') "230111까지 남은일자"
,	age(current_date,'2023-01-11') "현재일자-230111<0"
,	age(current_timestamp, current_timestamp - cast('2hour' as interval)) 

--rental테이블: 대여기간이 가장 길었던 렌탈 내역을 조회하시오
select r.rental_id 
,		r.customer_id 
,		age(r.return_date,r.rental_date) as duration
from rental r 
where r.return_date is not null
order by duration desc
limit 10;

--현재 시간 정보 조회
select 
	current_date "current_date"		--현재 일자 리턴
,	current_time "current_time"		--현재 시간 리턴
,	current_timestamp "current_timestamp"	--현재 일자와 시간 리턴
,	localtime(6) as "localtime(6)"			--현재 시간 리턴(정밀도 6, hh:mm:ss)
,	localtimestamp as "localtimestamp"		--현재 일자와 시간 리턴
,	now() as "now()"
	-- 현재 일자와 시간에 1일을 더함
,	now() + interval '1 day' as "now() + interval"
,	now() - interval '1 day 2hours 30minutes' "now() + interval '1 day 2hours 30minutes'"
 
-- 일자와 시간 추출 함수
select
	--날짜에서 year,month,week,day,hour,minute,second만 추출(문자형으로 캐스팅)
	cast(date_part('year', current_timestamp)as varchar)	y
,	cast(date_part('month', current_timestamp)as varchar)	m
,	cast(date_part('week', current_timestamp)as varchar)	w
,	cast(date_part('day', current_timestamp)as varchar)	d
,	cast(date_part('hour', current_timestamp)as varchar)	h
,	cast(date_part('minute', current_timestamp)as varchar)	mm
,	cast(date_part('second', current_timestamp)as varchar)	s
	--extract 함수
,	cast(extract(year from current_timestamp)as varchar)	y
,	cast(extract(month from current_timestamp)as varchar)	m
,	cast(extract(week from current_timestamp)as varchar)	w
,	cast(extract(day from current_timestamp)as varchar)		d
,	cast(extract(hour from current_timestamp)as varchar)	h
,	cast(extract(minute from current_timestamp)as varchar)	mm
,	cast(extract(second from current_timestamp)as varchar)	s
	--date_trunc함수 : 원하는 인자까지를 제외한 나머지를 절사
,	date_trunc('hour', current_timestamp)
,	date_trunc('minute', current_timestamp)
,	date_trunc('second', current_timestamp)


--문자열을 일자 및 시간형으로 형변환하는 함수
select
	-- to_date(두 format을 맞춰줘야 함)
	to_date('20221224', 'YYYYMMDD')
,	to_date('2022-12-24', 'YYYY-MM-DD')
,	to_date('2022/12/24', 'YYYY/MM/DD')
,	to_timestamp('20221224093920', 'yyyymmddhh24miss')
,	to_timestamp('2022/12/24 09:39:20.000', 'yyyy/mm/dd HH24:MI:SS') 

-- 반올림, 올림, 내림, 자름 관련 함수
select
	--round(a, n) a를 소수점 n 번째 자리에서 반올림
	round(10.78, 0) "round(10.78, 0)"	--0의 자리에서 반올림
,	round(10.78, 1) "round(10.78, 1)"	--소수점 첫째 자리에서 반올림
,	round(10.78, 2) "round(10.78, 2)" 	--소수점 둘째 자리에서 반올림
	--ceil(a)	: 올림
,	ceil(12.4)	"ceil(12.4)"			--0의 자리에서 올림
,	ceil(12.8) 	"ceil(12.8)"			
,	ceil(12.1)	"ceil(12.1)"
,	ceil(12.0)	"ceil(12.0)"
	--floor(a) : 내림
, 	floor(12.4)	"floor(12.4)"			--0의 자리에서 내림 12
,	floor(12.8)	"floor(12.8)"			--12
,	floor(12.0) "floor(12.0)"			--10
	--trunc(a, n) : 소수점 n의자리까지  자름
,	trunc(10.78, 0) "trunc(10.78,0)"	--0의 자리까지 자름 10
,	trunc(10.78, 1) "turnc(10.78,1)"	--소수점 첫째자리까지 자름 10.7
,	trunc(10.78, 2) "turnc(10.78,2)"	--소수점 둘째자리까지 자름 10.78

-- 연산 관련 함수
select
	--abs() : 절대값
	ABS(-10) "ABS(-10)"
,	abs(10)	"abs(10)"
,	sign(-3) "sign(-3)"			-- -3 은 음수라서 -1을 리턴
,	sign(0)	"sign(0)"			-- 0은 0이라서 0을 리턴
,	sign(3) "sign(3)"			-- 3은 양수라서 1을 리턴
, 	div(9,2) "div(9,2)"			-- 몫 리턴 4
,	mod(9,2) "mod(9,2)"			-- 나머지 리턴 1
, 	log(10,1000) "log(10,1000)" -- 로그 함수 (log10 1000 = 3)
, 	log(2, 4) 	"log(2, 4)" 	-- log2 4 = 2
,	power(2,3) "power(2,3)" 	-- n제곱 (2^3 = 8)
,	sqrt(4) "sqrt(4)"			-- 루트 (루트4 = 2)
,	random() "random()"			-- 0~1 까지의 실수값 랜덤 리턴
,	pi()	"pi()"				-- PI값 리턴
,	degrees(1) "degress(1)"		-- 라디안 1은 57.29577951308232


	