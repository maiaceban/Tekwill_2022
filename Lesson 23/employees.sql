select * from employees where age < 45;
select * from employees where  first_name = 'Lauren' or last_name = 'Beaulieu';
select * from employees where age > 60 or age < 20;


select * from employees order by age desc;
select * from employees order by first_name desc ;
select * from employees order by age asc, last_name desc;


select * from employees where id = 26;
update employees  set first_name = 'Alexandru', last_name = 'cel Bun' where id = 26;
select * from employees where first_name = 'Marv' ;
update employees set age = 85 where first_name = 'Marv';
select * from employees where age > 70;
update employees set first_name = 'Abgar' where age > 70;


delete from employees where age < 20;
delete from employees where first_name ='Alexandru';

select
	*
from
	employees
where
	email in ('maiacebanjava@gmail.com', 'joracardan@yahoo.com', 'asilegratii@mail.ru');
insert into employees (first_name, last_name, email, age) 
values ('Ceban', 'Maia', 'maiacebanjava@gmail.com', 26),
('Jora', 'Cardan','joracardan@yahoo.com', 32),
('Vasile', 'Gratii', 'asilegratii@mail.ru', 27);




