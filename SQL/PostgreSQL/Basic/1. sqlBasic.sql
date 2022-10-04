select 1 + 1 as 일더하기일;

create table TB_EMP 
(
	EMP_NO Char(10)		--고정길이 10자리의 문자열
, 	EMP_NM varchar(50)	--가변길이 최대 50자리의 문자열
, 	SELF_INTRO text		--길이제한이 없는 가변길이 문자열
);

drop table tb_emp ;

create table TB_EMP
(
	EMP_NO SERIAL primary key	-- 자동으로 순차적으로 1, 2, 3,...
, 	AGE smallint 
, 	GRADE_POINT NUMERIC(3,2)	-- 0.00 ~ 9.99
, 	SAL NUMERIC(9)
,	TOT_ASSET INT				
);

insert into TB_EMP (AGE, grade_point, SAL, tot_asset)
values (35,4.25,58700000,125000000);

select * from tb_emp ;

insert into TB_EMP (AGE, grade_point, SAL, tot_asset)
values (36,4.26,58700001,125000001);

select * from tb_emp ;

drop table tb_emp ;


create table TB_EMP(
	BRITH_DE	DATE
,	JOIN_DE		TIMESTAMPTZ
,	JOIN_DE_WITHOUT_TZ		TIMESTAMP
,	TASK_BEGIN_TM	TIME
);

insert 
into tb_emp 	--순서대로 모든 컬럼에 추가 하겠다
values ('2022-09-21', '2022-09-21 125630.111589', 
'2022-09-27 125630.111589'at TIME zone 'AMERICA/SANTIAGO', '18:00:00');

select *from tb_emp ;

show TIMEZONE;

drop table tb_emp ;

/**
 *  :: 타입변환
 * 	- value :: type 
 */
select current_date as "CURRENT_DATE"	--현재 날짜 가져오기
,	current_time as "CURRENT_TIME"		--현재 시간(마이크로세컨드단위까지)
,	current_timestamp as "current_timestamp" --현지 일시(마이크로세컨드단위까지) 가져오기
, 	now() as "now()"						 --현지 일시(마이크로세컨드단위까지) 가져오기
,	now() :: date as "now() :: date"		 --현지 날짜 가져오기
,   now() :: time as "now() :: time"		 --현지 시간 가져오기
-------------------------------------------------------------------------------
create table tb_user
(
	user_id char(10) primary key
, 	user_nm varchar(50) not null
,	password varchar(50) not null
,	email_adress varchar(255) unique not null
,	create_on timestamp not null
,	last_login timestamp 
);

create table tb_role
(
	role_id char(10) primary key
,	role_nm varchar(255) not null
);

create table tb_user_role
(
	user_id char(10) not null
,	role_id char(10) not null
,	primary key (role_id , user_id)
,	foreign key (role_id) references tb_role(role_id)
, 	foreign key(user_id) references tb_user(user_id)
);

-----------------------------------------------------------------------
drop table if exists tb_link;
create table tb_Link
(
	link_id serial primary key
,	title varchar(512) not null
,	url varchar(1024) not null
	
);

alter table tb_link add column active_yn char(1);
select*from tb_link;

alter table tb_link drop column active_yn;
select * from tb_link;

alter table tb_link rename column title to link_title;
select * from tb_link;

alter table tb_link add column target varchar(10);
select * from tb_link;

--target 컬럼의 디폴트 값을 '_BLANK'로 지정
alter table tb_link alter column target set default '_BLANK';

insert into tb_link (link_title, url) values ('애플','https://www.apple.com/');
select * from tb_link;

--TARGET 컬럼에 저장되는 값은 '_BLANK', '_PARENT', '_SELF', '_TOP'으로 한정
alter table tb_link add check(TARGET in('_BLANK', '_PARENT', '_SELF', '_TOP') );

insert into tb_link (LINK_TITLE, URL, TARGET)
VALUES('피그마', 'HTTPS://WWW.FIGMA.COM/', 'LINK');

insert into tb_link (LINK_TITLE, URL, TARGET)
VALUES('피그마', 'HTTPS://WWW.FIGMA.COM/', '_SELF');

-- URL컬럼에 UNIQUE 제약조건 추가
alter table tb_link add CONSTRAINT UNIQUE_URL unique (URL); 

-- URL컬럼에 값이 이미 존재하므로 UNIQUE 제약조건 위반
insert into tb_link (LINK_TITLE, URL, TARGET)
values ('사과', 'https://www.apple.com/', '_SELF');

-------------------------------------------------------------
create table tb_asset (
 	asset_NO serial		primary key
,	asset_nm text		not null
,	asset_id varchar	not null
,	description text	
,	loc text	
,	acquired_de date	not null
);

insert into tb_asset(asset_nm, asset_id, loc, acquired_de)
values('SERVER', '10001', 'SERVER ROOM', '2022-09-21');

insert into tb_asset(asset_nm, asset_id, loc, acquired_de)
values('UPS', '10002', 'SERVER ROOM', '2022-09-22');
select*from tb_asset;

-- 문자형 컬럼을 다른 문자형 타입으로 변경(단수개, 복수개 )
alter table tb_asset alter column asset_nm type VARCHAR;
alter table tb_asset 
	alter column description type VARCHAR
, 	alter column loc type VARCHAR

-- 문자형 컬럼을 숫자형 타입으로 변경(=>using 절 이하 추가)
alter table tb_asset alter column asset_id type int using asset_id :: integer; 
;

-- asset_id => asset_id_2로 컬럼명 변경
alter table tb_asset rename column asset_id to asset_id_2;

---------------------------------------테이블 삭제하기
create table tb_invoice
(
	invoice_no serial primary key
,	issue_de timestamp
,	prdt_nm varchar(150)	
	
);

insert into tb_invoice (issue_de, prdt_nm) values(current_timestamp, '아메리카노');
insert into tb_invoice (issue_de, prdt_nm) values(current_timestamp, '카페라떼');
insert into tb_invoice (issue_de, prdt_nm) values(current_timestamp, '모카라떼');

select *from tb_invoice;


--테이블의 내용 전체 비우기
truncate table tb_invoice ;

-- truncate table 사용시 restart identity 옵션을 줌 => serial 값이 초기화 됨
truncate table tb_invoice restart identity;

-- 테이블 자체를 제거
drop table tb_invoice;

--if exists문 사용하여 존재하지 않으면 무시, sql에러 미발생
drop table if exists tb_invoice;
