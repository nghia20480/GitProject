
USE quanlysinhvien;
select*from student
where StudentName like 'H%';
select*from class
where month(class.StartDate)='12';
select*from subject
where subject.Credit between 3 and 5;
update student
set ClassID=2
where StudentName='Hung';
USE quanlysinhvien;

