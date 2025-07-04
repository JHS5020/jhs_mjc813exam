CREATE TABLE contact_tbl (
	id INT UNSIGNED auto_increment NOT NULL
	,name varchar(20) NOT NULL
	,phoneNumber varchar(20) NOT NULL
	,zipNumber varchar(5) NOT NULL
	,email varchar(100) NOT NULL
	,addr varchar(500) NOT NULL
	,CONSTRAINT contact_tbl_pk PRIMARY KEY (id)
);

CREATE TABLE location_tbl (
	id INT UNSIGNED auto_increment NOT NULL
	,location varchar(500) NOT NULL
	,CONSTRAINT location_tbl_pk PRIMARY KEY (id)
);

CREATE TABLE saled_tbl (
	id INT UNSIGNED auto_increment NOT NULL
	,sale_dt date NOT NULL
	,price int unsigned NOT NULL
	,qty int unsigned NOT NULL
	,product varchar(100) NOT NULL
	,location_id int unsigned NULL
	,discount int unsigned NOT NULL
	,contact_id int unsigned NOT NULL
	,CONSTRAINT saled_tbl_pk PRIMARY KEY (id)
	,CONSTRAINT saled_tbl_fk_location FOREIGN KEY (location_id) REFERENCES location_tbl(id)
	,CONSTRAINT saled_tbl_tbl_fk_contact FOREIGN KEY (contact_id) REFERENCES contact_tbl(id)
);



CREATE TABLE lecture_tbl(
	id INT UNSIGNED auto_increment NOT NULL
	,subject varchar(100) NOT NULL
	,teacher varchar(20) NOT NULL
	,root_num varchar(10) NOT NULL
	,start_dt date NOT NULL
	,end_dt date NOT NULL
	,CONSTRAINT learn_tbl_pk PRIMARY KEY (id)
);

CREATE TABLE learn_tbl(
	id INT UNSIGNED auto_increment NOT NULL
	,lecture_id INT UNSIGNED NOT NULL
	,score DECIMAL(3,1) NOT NULL
	,contact_id int unsigned NOT NULL
	,CONSTRAINT learn_tbl_pk PRIMARY KEY (id)
	,CONSTRAINT learn_tbl_fk_lecture FOREIGN KEY (lecture_id) REFERENCES lecture_tbl(id)
	,CONSTRAINT learn_tbl_fk_contact FOREIGN KEY (contact_id) REFERENCES contact_tbl(id)
);

INSERT INTO  item_tbl (item, item_price)
	VALUES ('노트북',1000000)
	,('스마트폰',600000)
	,('마우스',30000)
	,('키보드',50000);

INSERT INTO seller_tbl (seller, seller_address)
	VALUES ('홍길동','강남구')
	,('이순신','은평구')
	,('정현서','은평구');

INSERT INTO contact_tbl  (sell_day, sell_number, send_place, item_id, seller_id)
	VALUES ('2025-04-23',3,'은평구', 3, 2)
	,('2025-04-23',1,'서대문구', 1, 3)
	,('2025-06-05',5,'종로구', 4, 1)
	,('2024-12-25',1,'마포구', 2, 3);

-- CREATE USER goals002@'%' IDENTIFIED BY 'goals002';
-- GRANT ALL PRIVILEGES ON learn.* TO goals002@'%' WITH GRANT OPTION;
-- FLUSH PRIVILEGES;

INSERT INTO  contact_tbl (name, phoneNumber, zipNumber, email, addr)
	VALUES ('홍길동', '010-11', '21324', 'hong', '서울시 영등포구')
	,('이순신', '010-22', '34111', 'lee', '인천시 계양구')
	,('을지문덕', '010-33', '93828', 'ul', '서울시 구로구');

INSERT INTO  location_tbl (location)
	VALUES ('인천시...')
	,('서울시...');

INSERT INTO  lecture_tbl (subject, teacher, root_num, start_dt, end_dt)
	VALUES ('데이터통신', '김교수', '60A', '2025-07-01', '2025-07-10')
	,('데이터보안', '이교수', '813', '2025-06-10', '2025-06-25')
	,('웹서버', '최교수', '705', '2025-06-05', '2025-06-15');

INSERT INTO  saled_tbl (sale_dt, price, qty, product, discount, contact_id, location_id)
	VALUES ('2025-07-03', 2500, 2, '곰보빵', 0, 1, 1)
	,('2025-07-03', 3000, 1, '우유', 0, 1, 2)
	,('2025-07-02', 31000, 1, '쌀 10Kg', 1000, 2, 1)
	,('2025-07-02', 26000, 2, '밀가루 20kg', 2000, 2, 2)
	,('2025-07-02', 85000, 1, '밥솥', 5000, 3, 1)
	,('2025-07-03', 12000, 2, '빗자루', 0, 3, 2);

INSERT INTO  learn_tbl (lecture_id, score, contact_id)
	VALUES (1, 0, 3)
	,(2, 62, 2)
	,(3, 68, 1)
	,(2, 66, 1)
	,(1, 0 ,3);


-- 조회 테스트 용도
SELECT * FROM contact_tbl;

select * from saled_tbl;

select
	name,
	phoneNumber,
	product,
	price,
	qty,
	discount,
	(price * qty - discount) AS total,
--	location_id,
	location
from
	contact_tbl
inner join saled_tbl on
	contact_tbl.id = contact_id
inner join location_tbl on
	location_tbl.id = location_id
	;
	
	


07_04
CREATE OR REPLACE VIEW sell
	AS
	select
		name,
		phoneNumber,
		product,
		price,
		qty,
		discount,
		(price * qty - discount) AS total,
	--	location_id,
		location
from
	contact_tbl
inner join saled_tbl on
	contact_tbl.id = contact_id
inner join location_tbl on
	location_tbl.id = location_id
	;

SELECT * FROM sell

CREATE OR REPLACE VIEW learn
	AS
	select
		name,
	phoneNumber,
	email,
	addr,
	score,
	subject,
	teacher,
	root_num,
	start_dt,
	end_dt
from
	contact_tbl
inner join learn_tbl on
	contact_tbl.id = learn_tbl.contact_id
inner join lecture_tbl on
	lecture_tbl.id = learn_tbl.lecture_id
	;
	
SELECT * FROM learn

SELECT 
	name
	, min(start_dt)
	, max(end_dt)
	from learn
group by name
	;
	
SELECT 
	subject
	,count(name) AS qty
	from learn
group by subject