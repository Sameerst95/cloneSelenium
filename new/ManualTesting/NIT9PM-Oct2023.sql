show databases;

create database nit9PMOct2023;

use nit9PMOct2023;

show tables;

create table employee(Id int, Name varchar(50), Salary int, Designation varchar(50), DOJ datetime);

show columns from employee;

insert into employee values(1,"MS Dhoni",2500000,"Chief Executive Officer",now());

insert into employee values(2,"Rohit Sharma",1500000,"Senior Manager",now());

insert into employee values(3,"Virat Kohli",2500000,"Manager",now());

insert into employee(Name, Salary, DOJ) values("KL Rahul",1000000,"2023-11-03 00:00:00");

create table employee_unique (Id int auto_increment, Name varchar(50), Designation varchar(50) not null, Salary int, Location varchar(50), primary key(Id));

insert into employee_unique(Name, Designation, Salary, Location) values ("Suresh Raina","Senior Analyst",1000000,"Lucknow");

insert into employee_unique values(5,"Rahul Dravid","Chief Financial Officer",3000000,"Bengaluru");

select * from employee;

select * from employee_unique;

select Id, Name, Salary from employee;

select * from employee where Id=1;

select * from employee where Name="MS Dhoni";

select * from employee where DOJ = "2023-11-02 22:13:39";

select * from employee where Salary>1000000;

select * from employee where Id!=1;

select * from employee where Salary<1500000;

select * from employee where Salary<=1500000;

select * from employee where Name like "%Singh";

select * from employee where Name like "Sai%";

select * from employee where Name like "%Singh%";

select * from employee where Id=1 and Salary=1000000;

select * from employee where Id=1 or Salary=1000000;

select upper(Name) from employee;

select lower(Name) from employee;

select * from employee where Id is null;

select * from employee where Designation is not null;

select * from employee where Salary between 1000000 and 2000000;

select * from employee where Salary in (500000,1000000,1800000,1900000);

select * from employee order by Salary asc;

select * from employee order by DOJ desc;

select * from employee order by Name;

select max(Salary) from employee;

select min(Salary) from employee;

select avg(Salary) from employee;

select count(Designation) from employee;

select sum(Salary) from employee;

select datediff("2023-11-05","2023-11-01");

select timediff("","");

select * from employee where Salary = (select max(Salary) from employee);

select * from employee where Salary = (select min(Salary) from employee);

select * from employee order by Salary desc limit 1;

select * from employee order by Salary desc limit 3;

select * from employee order by Salary limit 1;

select * from employee order by Salary desc limit 1,1;

select distinct Id,Name,Salary from employee order by Salary limit 1,1;

select distinct Id,Name,Salary from employee;

select distinct Id,Name,Salary,DOJ from employee;

update employee set Id = 4 where Name = "KL Rahul";

update employee set Id = 6 where Name = "MS Dhoni";

update employee set Id = 9, Designation="Asst. Manager" where Name="KL Rahul";

alter table employee add Location varchar(50);

alter table employee modify Location int;

alter table employee drop Location;

alter table employee add Location varchar(50) after Designation;

alter table employee change column Salary int after DOJ;

alter table employeeNew rename employee;

alter table employee rename column Id to EmpId;

delete from employee where Id = 0;

create table dummyTable(Sno int);

insert into dummyTable values(1);

select * from dummyTable;

drop table employee;

create database dummyDB;

drop database dummyDB;

truncate table dummytable;

select table1.name, table1.salary, table1.designation, table2.location, table2.doj from table1 inner join table2 on table1.name = table2.name;

select table1.name, table1.salary, table1.designation from table1 right outer join table2
on table1.name = table2.name;

select table1.name, table1.salary, table1.designation from table1 left outer join table2
on table1.name = table2.name;

select table1.name, table2.Id from table1 cross join table2;