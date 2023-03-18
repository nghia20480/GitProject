use quanlybanhang;
insert into Customer
value(1,'Minh Quan',10),
(2,'Ngoc Oanh',20),
(3,'Hong Ha',50);
insert into Order1
value(1,1,'2006-3-21',null),
(2,2,'2006-3-23',null),
(3,1,'2006-3-16',null);
insert into product
value(1,'may giat',3),
(2,'tu lanh',5),
(3,'dieu hoa',7),
(4,'quat',1),
(5,'bep dien',2);
insert into oderdetail
value(1,1,'3'),
(1,3,'7'),
(1,4,'2'),
(2,1,'1'),
(3,1,'8'),
(2,5,'4'),
(2,3,'3');
use quanlybanhang;
select oID,oDate,oTotalPrice
from order1;
select cName , pName 
from customer  join order1 on customer.cID=order1.cID  join oderdetail on order1.oID=oderdetail.oID  join product on oderdetail.pID=product.pID
;
select cName
from customer  left join order1 on customer.cID=order1.cID 
where oID is null;

select cID,oDate,pPrice*oderdetail as 'gia tien'
from order1  join oderdetail on order1.oID=oderdetail.oID  join product on oderdetail.pID=product.pID
;



