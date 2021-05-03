-- 개
DROP TABLE IF EXISTS shoppingmall.Dog RESTRICT;

-- 개_쇼핑몰
DROP SCHEMA IF EXISTS shoppingmall;

-- 개_쇼핑몰
CREATE SCHEMA shoppingmall;

-- 개
CREATE TABLE shoppingmall.Dog (
	id        INT          NOT NULL COMMENT '아이디', -- 아이디
	kind      varchar(12)  NOT null unique COMMENT '종류', -- 종류
	price     INT          NOT NULL COMMENT '가격', -- 가격
	image     varchar(20)  NOT NULL COMMENT '이미지', -- 이미지
	country   varchar(12)  NOT NULL COMMENT '원산지', -- 원산지
	height    INT          NULL     COMMENT '키', -- 키
	weight    INT          NULL     COMMENT '무게', -- 무게
	content   varchar(400) NULL     COMMENT '설명', -- 설명
	readcount INT          NULL DEFAULT 0  COMMENT '조회수' -- 조회수
)
COMMENT '개';

-- 개
ALTER TABLE shoppingmall.Dog
	ADD CONSTRAINT PK_Dog -- 개 기본키
		PRIMARY KEY (
			id -- 아이디
		);

ALTER TABLE shoppingmall.Dog
	MODIFY COLUMN id INT NOT NULL AUTO_INCREMENT COMMENT '아이디';

