create database demo;
use demo;
create table Products (
id int primary key,
productCode varchar(50),
productName varchar(50),
productPrice  varchar(50),
productAmount varchar(50),
productDescription varchar(50),
productStatus varchar(50)
);
insert into Products
value(2,'01','sua','300','a','b','1'),
(3,'02','KEM','400','c','d','0');
explain select productName
from Products
where productCode='02';
alter table Products add index index_product_name(productName);
alter table Products add index composite_index_product_name(productName,productPrice);
create view product_view  as
select productCode,productName,productPrice,productStatus
from Products;
CREATE OR REPLACE VIEW product_view as
select productCode,productName,productPrice,productStatus
from Products
where productName='kem';
drop view product_view;
delimiter $$
create procedure get_product()
begin
select*
from Products;
end $$
delimiter ;
call get_product();

delimiter $$
create procedure change_product_id(in a int,in b varchar(50))
begin
replace Products
set productName=b
where id=a;
end $$
delimiter ;

call change_product_id(1,'sung');

delimiter $$
create procedure delete_product(in a int)
begin
delete from products
where id=a;
end $$
delimiter ;
call delete_product(3);