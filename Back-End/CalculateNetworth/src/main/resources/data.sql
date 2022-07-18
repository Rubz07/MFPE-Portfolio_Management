
create database AssetDetails;
use AssetDetails;




CREATE TABLE IF NOT EXISTS `AssetDetails`.`portfolio` (
  `portfolio_id` INT(20) ,
  PRIMARY KEY (`portfolio_id`));

CREATE TABLE IF NOT EXISTS `AssetDetails`.`stockdetail`(st_id int primary key,stock_name varchar(20),stock_count int,portfolio_id int,foreign key(portfolio_id) references portfolio(portfolio_id));

CREATE TABLE IF NOT EXISTS `AssetDetails`.`mutualfund`(mf_id int primary key,mutual_fund_name varchar(20),mutual_fund_units int,portfolio_id int,foreign key(portfolio_id) references portfolio(portfolio_id));

insert into portfolio values(101);
insert into portfolio values(102);
insert into portfolio values(103);
insert into portfolio values(104);
  


insert into stockdetail values(1,'SYNGENE',10,101);
insert into stockdetail values(2,'FOSECOIND',10,101);
insert into stockdetail values(3,'KSOLVES',10,101);
insert into stockdetail values(4,'MAHINDCIE',10,102);
insert into stockdetail values(5,'ELPRO',10,102);
insert into stockdetail values(6,'EIMCOELECO',10,101);
insert into stockdetail values(7,'PRAJIND',10,103);
insert into stockdetail values(8,'RAMRAT',10,102);
insert into stockdetail values(9,'INDOCO',10,104);
insert into stockdetail values(10,'RELIANCE',10,103);




insert into mutualfund values(11,'GLE',10,101);
insert into mutualfund values(12,'FBE',10,101);
insert into mutualfund values(13,'SLJ',10,101);
insert into mutualfund values(14,'SRD',10,102);
insert into mutualfund values(15,'QSF',10,102);
insert into mutualfund values(16,'CPE',10,102);
insert into mutualfund values(17,'GLA',10,103);
insert into mutualfund values(18,'ART',10,104);
insert into mutualfund values(19,'URE',10,104);
insert into mutualfund values(20,'TATA',10,104);