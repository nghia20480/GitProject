create database  QuanLyBanHang;
use QuanLyBanHang;
create table Customer(cID int primary key,
cName varchar(50),
cAge int);
create table Order1(oID int primary key,
cID int not null, 
FOREIGN KEY (cID)REFERENCES Customer(cID),
oDate datetime,
oTotalPrice int);
create table Product(
pID int primary key,
pName varchar(50),
pPrice int);
create table OderDetail(
oID int not null,
pID int not null,
Foreign key (oID) references Order1(oID),
Foreign key (pID) references Product(pID),
primary key(oID,pID),
OderDetail varchar(50));