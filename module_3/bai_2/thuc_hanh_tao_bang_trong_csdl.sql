create database student_manager_2;
create table student_manager_2.hocsinh(
mahs varchar(50) primary key,
ngaysinh datetime,
lop varchar(20),
gt varchar(50));
create table student_manager_2.monhoc(
mamh varchar(50) primary key,
tenmh varchar(50) ,
magv varchar(50));

create table student_manager_2.bangdiem(
mahs varchar(50),
mamh varchar(50),
diemthi int,
ngaykt datetime,
primary key (mahs,mamh),
foreign key(mahs) references hocsinh(mahs),
foreign key(mamh) references monhoc(mamh)
);
create table student_manager_2.giaovien(
magv varchar(50) primary key,
tengv varchar(50),
sdt varchar(50)
);

alter table student_manager_2.monhoc add magv varchar(50);
alter table student_manager_2.monhoc add constraint fk_magv foreign key(magv) references giaovien(magv);
