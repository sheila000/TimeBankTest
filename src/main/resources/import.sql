use timebank
go

DROP TABLE TIME_LEDGER
DROP TABLE MEMBER
DROP TABLE JOB





CREATE TABLE TIME_LEDGER(
ID BIGINT IDENTITY PRIMARY KEY,
MEMBER_ID BIGINT NOT NULL,
TRANSACTION_TIME DATETIME NOT NULL,
DEPOSIT_VALUE INT,
WITHDRAWAL_VALUE INT,
BALANCE_VALUE INT NOT NULL,
DESCRIPTION VARCHAR(30) NOT NULL
FOREIGN KEY (MEMBER_ID) REFERENCES MEMBER(ID)
)

INSERT INTO TIME_LEDGER (MEMBER_ID,TRANSACTION_TIME,DEPOSIT_VALUE,WITHDRAWAL_VALUE,BALANCE_VALUE,DESCRIPTION)
VALUES(1, '2018-10-10',100,0,100,'deposit')

INSERT INTO TIME_LEDGER (MEMBER_ID,TRANSACTION_TIME,DEPOSIT_VALUE,WITHDRAWAL_VALUE,BALANCE_VALUE,DESCRIPTION)
VALUES(1, '2018-10-11',50,150,0,'deposit')

INSERT INTO TIME_LEDGER (MEMBER_ID,TRANSACTION_TIME,DEPOSIT_VALUE,WITHDRAWAL_VALUE,BALANCE_VALUE,DESCRIPTION)
VALUES(2, '2018-9-10', 500, 500,0,'deposit')

--DISOBEY FOREIGN KEY 條件約束
--INSERT INTO TIME_LEDGER(MEMBER_ID,TRANSACTION_TIME,DEPOSIT_VALUE,BALANCE_VALUE)
--VALUES(6,GETDATE(), 100,100)



CREATE TABLE JOB(
JOB_ID BIGINT IDENTITY PRIMARY KEY,
INSTITUTE_NAME VARCHAR(100),
JOB_TITLE VARCHAR(20),
TIME_VALUE INT,
)

INSERT INTO JOB( INSTITUTE_NAME, JOB_TITLE, TIME_VALUE) 
VALUES ('中華育幼機構關懷協會', '假日活動志工',2)
INSERT INTO JOB( INSTITUTE_NAME, JOB_TITLE, TIME_VALUE) 
VALUES ('新北市老人長期照顧中心', '平日活動志工',2)
INSERT INTO JOB( INSTITUTE_NAME, JOB_TITLE, TIME_VALUE) 
VALUES ('台灣展翅協會', '活動現場志工',3)
INSERT INTO JOB(INSTITUTE_NAME, JOB_TITLE, TIME_VALUE) 
VALUES ('財團法人弘道老人福利基金會', '長輩陪伴志工',4)


create table REQUEST(

)

