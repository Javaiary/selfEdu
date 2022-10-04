create table TB_CONTACT
(
	CONTACT_NO SERIAL primary key
,	FIRST_NM VARCHAR(50) not null
,	LAST_NM VARCHAR(50) not null
,	EMAIL_ADRES VARCHAR(200) not null UNIQUE
);

insert into tb_contact (first_nm, last_nm, email_adres)
values ('����', '��', 'sslee@gmail.com');
insert into tb_contact (first_nm, last_nm, email_adres)
values ('���', '��', 'bwlee@gmail.com');

select * from tb_contact;

-- ���̺� ���� �� ������ ���� => ���������� ���� �ݿ� �ȵ�.
-- ���̺�, �÷���, �÷� ������Ÿ��, �÷����� ����(�ݿ�)
create table tb_contact_bak
	as table tb_contact ;


select * from tb_contact_bak;

-- �������� �߰� 
alter table tb_contact_bak add primary key(CONTACT_NO);
alter table tb_contact_bak add unique(EMAIL_ADRES);
alter table tb_contact_bak alter column first_nm set not null;
alter table tb_contact_bak alter column last_nm set not null;

insert into tb_contact_bak (CONTACT_NO, first_nm, last_nm, email_adres)
values (3, '�氣','��', 'bglee@gmail.com');
insert into tb_contact_bak (CONTACT_NO, first_nm, last_nm, email_adres)
values (4, '����','��', 'sglee@gmail.com');

--------
drop table if exists tb_user_role;
drop table if exists tb_user;

-- ���̺� ���� + �⺻Ű ����
create table tb_user
(
	USER_NO INT
,	USER_NM VARCHAR(50) not null
,	BIRTH_DE DATE not null
,	ADDRS VARCHAR(200) null 
,	primary key (USER_NO)		-- ���̺� �����ϸ鼭 USER_NO�� �⺻Ű�� ����
);								-- USER_NO �÷����� �̷���� �ε����� �ڵ����� ������


drop table if EXISTS tb_user;
create table TB_USER
(
	USER_NO INT
,	USER_NM VARCHAR(50) not null
,	BIRTH_DE DATE not null
,	ADDRS VARCHAR(200) null 
,	constraint PK_TB_USER primary KEY(USER_NO)	-- �⺻ Ű ���� ������ �������Ǹ� ���
);

drop table if EXISTS tb_user;
create table TB_USER							-- ���̺� ����
(
	USER_NO INT
,	USER_NM VARCHAR(50) not null
,	BIRTH_DE DATE not null
,	ADDRS VARCHAR(200) null 
);

alter table tb_user add primary key (USER_NO);		-- �⺻Ű ����


create table TB_VENDOR
(
	VENDOR_NM VARCHAR(255)
);

insert into tb_vendor (VENDOR_NM) values ('Apple');
insert into tb_vendor (VENDOR_NM) values ('IBM');
insert into tb_vendor (VENDOR_NM) values ('Samsung');
insert into tb_vendor (VENDOR_NM) values ('LG');
insert into tb_vendor (VENDOR_NM) values ('Microsoft');
insert into tb_vendor (VENDOR_NM) values ('Sony');

select * from tb_vendor;

-- serial �������� �⺻ Ű�� ����
-- ������ �ִ� ��(������)�鿡�� �ڵ����� & ���������� ��ȣ�� �ο��ϰ� �� 
alter table tb_vendor add column vendor_id serial primary key;
alter table tb_vendor drop constraint tb_vendor_pkey;

------------------------------------------------------------------------
create table TB_CUST
(
	CUST_NO INT
,	CUST_NM VARCHAR(255) not null
,	primary key(CUST_NO)
);

drop table if exists TB_CONTACT;
create table TB_CONTACT 
(
	CONTACT_NO INT
,	CONTACT_TYP_CD CHAR(6) not null		-- 'CTC001' : ��ȭ��ȣ, 'CTC002' : �̸����ּ�
,	CONTACT_INFO VARCHAR(100)
,	CUST_NO INT
,	primary KEY(CONTACT_NO)
,	constraint FK_CUST_NO_TB_CUST foreign KEY(CUST_NO) references TB_CUST(CUST_NO)
	on delete no ACTION 		-- �ڽ��� ������ �ִ� �θ����̺��� ���� �����Ϸ��� �ϸ� ���� ���ϰ� �ϴ� ��
);

insert into tb_cust (CUST_NO, cust_nm) values (1, '�̼���');
insert into tb_cust (CUST_NO, cust_nm) values (2, '�̹��');

select * from tb_cust;

insert into tb_contact (CONTACT_NO, contact_typ_cd, contact_info, cust_no)
values (1, 'CTC001', '010-2314-4356', 1);
insert into tb_contact (CONTACT_NO, contact_typ_cd, contact_info, cust_no)
values (2, 'CTC002', 'sclee@gmail.com', 1);

insert into tb_contact (CONTACT_NO, contact_typ_cd, contact_info, cust_no)
values (3, 'CTC001', '010-7777-5555', 2);
insert into tb_contact (CONTACT_NO, contact_typ_cd, contact_info, cust_no)
values (4, 'CTC002', 'bwlee@gmail.com', 2);

select * from tb_contact;

delete from tb_cust 
where cust_no = 1;

--------
drop table if exists TB_CUST;
drop table if exists TB_CONTACT;

create table TB_CUST
(
	CUST_NO INT
,	CUST_NM VARCHAR(255) not null
,	primary key(CUST_NO)
);

create table TB_CONTACT 
(
	CONTACT_NO INT
,	CONTACT_TYP_CD CHAR(6) not null		-- 'CTC001' : ��ȭ��ȣ, 'CTC002' : �̸����ּ�
,	CONTACT_INFO VARCHAR(100)
,	CUST_NO INT
,	primary KEY(CONTACT_NO)
,	constraint FK_CUST_NO_TB_CUST foreign KEY(CUST_NO) references TB_CUST(CUST_NO)
	on delete set null  -- set null �ɼ��� �ڽ��� ������ �ִ� �θ����� �����Ϸ��� �ϸ� �ڽ����� ���� null �� ������
);

insert into tb_cust (CUST_NO, cust_nm) values (1, '�̼���');
insert into tb_cust (CUST_NO, cust_nm) values (2, '�̹��');

insert into tb_contact (CONTACT_NO, contact_typ_cd, contact_info, cust_no)
values (1, 'CTC001', '010-2314-4356', 1);
insert into tb_contact (CONTACT_NO, contact_typ_cd, contact_info, cust_no)
values (2, 'CTC002', 'sclee@gmail.com', 1);

insert into tb_contact (CONTACT_NO, contact_typ_cd, contact_info, cust_no)
values (3, 'CTC001', '010-7777-5555', 2);
insert into tb_contact (CONTACT_NO, contact_typ_cd, contact_info, cust_no)
values (4, 'CTC002', 'bwlee@gmail.com', 2);

delete from tb_cust 
where cust_no = 1;

select * from tb_cust;
select * from tb_contact;

-----
drop table if exists TB_CUST;
drop table if exists TB_CONTACT;

create table TB_CUST
(
	CUST_NO INT
,	CUST_NM VARCHAR(255) not null
,	primary key(CUST_NO)
);

create table TB_CONTACT 
(
	CONTACT_NO INT
,	CONTACT_TYP_CD CHAR(6) not null		-- 'CTC001' : ��ȭ��ȣ, 'CTC002' : �̸����ּ�
,	CONTACT_INFO VARCHAR(100)
,	CUST_NO INT
,	primary KEY(CONTACT_NO)
,	constraint FK_CUST_NO_TB_CUST foreign KEY(CUST_NO) references TB_CUST(CUST_NO)
	on delete cascade	-- cascade�ɼ��� �ڽ��� ������ �ִ� �θ����� �����Ϸ��� �ϸ� �ڽ��൵ ������ ����
);

insert into tb_cust (CUST_NO, cust_nm) values (1, '�̼���');
insert into tb_cust (CUST_NO, cust_nm) values (2, '�̹��');

insert into tb_contact (CONTACT_NO, contact_typ_cd, contact_info, cust_no)
values (1, 'CTC001', '010-2314-4356', 1);
insert into tb_contact (CONTACT_NO, contact_typ_cd, contact_info, cust_no)
values (2, 'CTC002', 'sclee@gmail.com', 1);

insert into tb_contact (CONTACT_NO, contact_typ_cd, contact_info, cust_no)
values (3, 'CTC001', '010-7777-5555', 2);
insert into tb_contact (CONTACT_NO, contact_typ_cd, contact_info, cust_no)
values (4, 'CTC002', 'bwlee@gmail.com', 2);

delete from tb_cust 
where cust_no = 1;

select * from tb_cust;
select * from tb_contact;

------
drop table if exists TB_CONTACT;
drop table if exists TB_CUST;
 
create table TB_CUST
(
	CUST_NO INT
,	CUST_NM VARCHAR(255) not null
,	primary key(CUST_NO)
);

insert into tb_cust (CUST_NO, cust_nm) values (1, '�̼���');
insert into tb_cust (CUST_NO, cust_nm) values (2, '�̹��');
select * from TB_CUST;

create table TB_CONTACT 
(
	CONTACT_NO INT
,	CONTACT_TYP_CD CHAR(6) not null		-- 'CTC001' : ��ȭ��ȣ, 'CTC002' : �̸����ּ�
,	CONTACT_INFO VARCHAR(100)
,	CUST_NO INT
,	primary KEY(CONTACT_NO)
);

insert into tb_contact (CONTACT_NO, contact_typ_cd, contact_info, cust_no)
values (1, 'CTC001', '010-2314-4356', 1);
insert into tb_contact (CONTACT_NO, contact_typ_cd, contact_info, cust_no)
values (2, 'CTC002', 'sclee@gmail.com', 1);

insert into tb_contact (CONTACT_NO, contact_typ_cd, contact_info, cust_no)
values (3, 'CTC001', '010-7777-5555', 2);
insert into tb_contact (CONTACT_NO, contact_typ_cd, contact_info, cust_no)
values (4, 'CTC002', 'bwlee@gmail.com', 2);
select * from tb_contact;

-- alter TABLE ~~~
alter table tb_contact 
add constraint FK_tb_contact_1 foreign key (cust_no) references TB_CUST(CUST_NO)
on delete no action;

alter table tb_contact 
add constraint FK_tb_contact_1 foreign key (cust_no) references TB_CUST(CUST_NO)
on delete set NULL;

alter table tb_contact 
add constraint FK_tb_contact_1 foreign key (cust_no) references TB_CUST(CUST_NO)
on delete CASCADE;

------
drop table if exists TB_EMP;
create table TB_EMP
(
	EMP_NO SERIAL primary key
,	first_NM VARCHAR(50)
,	LAST_NM VARCHAR(50)
,	BIRTH_DE DATE check (BIRTH_DE > '1900-01-01')
,	JOIN_DE DATE check (JOIN_DE > BIRTH_DE)
, 	SAL_AMT numeric check (SAL_AMT > 0)
);

-- ����
insert into tb_emp (first_NM, last_nm, birth_de, join_de, sal_amt)
values ('����', '��', '1994-07-12', '1883-01-02', -100000);

insert into tb_emp (first_NM, last_nm, birth_de, join_de, sal_amt)
values ('����', '��', '1994-07-12', '2009-01-02', 50000000);

select * from tb_emp;

-- ���̺� ���� (üũ �������� ����)
drop table if exists TB_EMP;
create table TB_EMP
(
	EMP_NO SERIAL primary key
,	first_NM VARCHAR(50)
,	LAST_NM VARCHAR(50)
,	BIRTH_DE DATE  
,	JOIN_DE DATE  
, 	SAL_AMT numeric  
);

insert into tb_emp (first_NM, last_nm, birth_de, join_de, sal_amt)
values ('����', '��', '1994-07-12', '1883-01-02', -100000);

-- ����
alter table tb_emp 
add constraint tb_emp_SAL_AMT_CHECK CHECK(SAL_AMT > 0);

truncate table tb_emp ;

------
drop table if exists TB_PERSON;

create table TB_PERSON
(
	PERSON_NO SERIAL primary key
,	first_NM VARCHAR(50)
,	LAST_NM VARCHAR(50)
,	EMAIL_ADRES VARCHAR(50) unique 
);

insert into tb_person (first_nm, last_nm, email_adres)
VALUES('����', '��', 'sclee@gmail.com');
select * from tb_person;

-- ����
insert into tb_person (first_nm, last_nm, email_adres)
VALUES('����', '��', 'sclee@gmail.com');

------
drop table if exists TB_PERSON;
create table TB_PERSON
(
	PERSON_NO SERIAL primary key
,	first_NM VARCHAR(50)
,	LAST_NM VARCHAR(50)
,	EMAIL_ADRES VARCHAR(50) 
, 	unique(first_nm, last_nm, email_adres)		-- ���� ������ ������ ���� ��� ������ ���̾�� ��.
);

insert into tb_person (first_nm, last_nm, email_adres)
VALUES('����', '��', 'sclee@gmail.com');
select * from tb_person;

insert into tb_person (first_nm, last_nm, email_adres)
VALUES('���', '��', 'sclee@gmail.com');

----
drop table if exists TB_PERSON;
create table TB_PERSON
(
	PERSON_NO SERIAL primary key
,	first_NM VARCHAR(50)
,	LAST_NM VARCHAR(50)
,	EMAIL_ADRES VARCHAR(50) 
);

-- ����ũ �ε��� ����
create unique index IDX_TB_PERSON_01 on TB_PERSON (first_NM, LAST_NM, EMAIL_ADRES);

-- ����ũ ���������� �ɾ���
alter table tb_person 
add constraint CONSTRAINT_TB_PERSON_01 
unique using index IDX_TB_PERSON_01;

----
drop table if exists TB_PERSON;

create table TB_PERSON 
(
	PERSON_NO SERIAL primary key
,	FIRST_NM VARCHAR(50) null 
,	LAST_NM VARCHAR(50) null 
,	EMAIL_ADRES VARCHAR(150) not NULL
);

-- ����
insert into tb_person (first_nm, last_nm, email_adres)
values ('�̼�','��',NULL);
insert into tb_person (first_nm, last_nm, email_adres)
values ('�̼�','��','sclee@gmail.com');
select * from tb_person;

alter table tb_person alter column first_nm set not null;
alter table tb_person alter column LAST_NM set not null;

-- ����
insert into tb_person (first_nm, last_nm, email_adres)
values (null,null,'null@gmail.com');
insert into tb_person (first_nm, last_nm, email_adres)
values ('���','��','sclee@gmail.com');

select * from tb_person where first_nm = '���';









