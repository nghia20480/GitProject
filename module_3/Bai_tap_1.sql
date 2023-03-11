create table class(
	id_class int,name varchar(50) not null
);
create table student(
	id_student int primary key auto_increment,
    name varchar(50),age int);
create table teacher(
	id_teacher int ,
    name varchar(50),
	age int,
    country varchar(50)
);