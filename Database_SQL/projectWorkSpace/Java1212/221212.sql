
/* Drop Tables */

DROP TABLE Board1212 CASCADE CONSTRAINTS;
DROP TABLE Member1212 CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE Board1212
(
	no number NOT NULL,
	bTitle varchar2(100 char),
	bContent varchar2(255 char),
	nickName varchar2(12 char) NOT NULL,
	bTime date NOT NULL,
	bWriterId varchar2(20 char) NOT NULL,
	PRIMARY KEY (no)
);


CREATE TABLE Member1212
(
	userId varchar2(20 char) NOT NULL,
	userPw varchar2(20 char) NOT NULL,
	email varchar2(100 char) NOT NULL,
	PRIMARY KEY (userId)
);



/* Create Foreign Keys */

ALTER TABLE Board1212
	ADD FOREIGN KEY (bWriterId)
	REFERENCES Member1212 (userId)
;



