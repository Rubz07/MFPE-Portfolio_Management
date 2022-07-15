DROP SCHEMA IF EXISTS `MyPortfolio`;
create database MyPortfolio;
use MyPortfolio;

CREATE TABLE IF NOT EXISTS `MyPortfolio`.`stocklist` (
  `stock_id` INT(20) NOT NULL AUTO_INCREMENT,
  `stock_name` VARCHAR(255) DEFAULT NULL,
    `stock_value` double DEFAULT NULL,
        
  PRIMARY KEY (`stock_id`))

AUTO_INCREMENT = 1;
insert into stocklist values(1,'SYNGENE',610.00);
insert into stocklist values(2,'FOSECOIND',1573.00);
insert into stocklist values(3,'KSOLVES',391.00);
insert into stocklist values(4,'MAHINDCIE',238.00);
insert into stocklist values(5,'ELPRO',60.00);
insert into stocklist values(6,'EIMCOELECO',371.00);
insert into stocklist values(7,'PRAJIND',373.00);
insert into stocklist values(8,'RAMRAT',202.00);
insert into stocklist values(9,'INDOCO',330.00);
insert into stocklist values(10,'RELIANCE',2370.00);

-- MutualFund data base--

drop table if exists mutualfund;
CREATE TABLE IF NOT EXISTS `MyPortfolio`.`mutualfund` (
  `mutual_Fund_Id` INT(20) NOT NULL AUTO_INCREMENT,
  `mutual_Fund_Name` VARCHAR(255) DEFAULT NULL,
    `mutual_Fund_Value` double DEFAULT NULL,
        
  PRIMARY KEY (`mutual_Fund_Id`))

AUTO_INCREMENT = 1;



insert into mutualfund values(11,'GLE',1200.00);
insert into mutualfund values(12,'FBE',1750.00);
insert into mutualfund values(13,'SLJ',1100.00);
insert into mutualfund values(14,'SRD',1200.00);
insert into mutualfund values(15,'QSF',1520.00);
insert into mutualfund values(16,'CPE',1200.00);
insert into mutualfund values(17,'GLA',300.00);
insert into mutualfund values(18,'ART',900.00);
insert into mutualfund values(19,'URE',1000.00);
insert into mutualfund values(20,'TATA',3000.00);

-- user details--

drop table if exists userrecord;

CREATE TABLE IF NOT EXISTS `MyPortfolio`.`userrecord` (
  `user_id` INT(20) NOT NULL AUTO_INCREMENT,
  `user_name` VARCHAR(255) DEFAULT NULL,
    `user_password` VARCHAR(255) DEFAULT NULL,
        
  PRIMARY KEY (`user_id`))

AUTO_INCREMENT = 1;



INSERT INTO userrecord (user_id,user_name,user_password) VALUES (101,'rubin','1234');
INSERT INTO userrecord (user_id,user_name,user_password) VALUES (102,'rejin','6287');
INSERT INTO userrecord (user_id,user_name,user_password) VALUES (103,'delin','8822');
INSERT INTO userrecord (user_id,user_name,user_password) VALUES (104,'dwane','7612');