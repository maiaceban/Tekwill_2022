-- String expressions examples
select
	concat('maiaceban', '@proton', '.me');
select
	char_length('tekwill'); -- count the number of characters. it returns '7' 
select
	reverse('Formidabil');  -- it returns 'libadimroF'
select
	replace ('superpupermegabeton', 'per', ''); -- it returns 'supumegabeton'
select
	substr('hello, My name is Maia', 19, 4); -- it returns 'Maia'

	
-- Logic expressions
select ((true and true) and (not false)) or false; -- it returns '[true]' 
select ((true and true) and (not true)) or false;  -- it returns '[false]' 

select
	'Alice' as name,
	170 as height_in_centimerters,
	170 * 0.393701 as "height in inches";
select
	'BOB' as NAME,
	160 as "HEIGHT IN CENTIMETERS",
	160 * 0.393701 as "HEIGHT IN INCHES";

select * from employees where age < 45;
select * from employees where  first_name = 'Lauren' or last_name = 'Beaulieu';
select * from employees where age > 60 or age < 20;

-- Ex 23.8 Order by DESC and ASC
select * from employees order by age desc;
select * from employees order by first_name desc ;
select * from employees order by age asc, last_name desc;

-- Ex 23.9 Update employees
select * from employees where id = 26;
update employees  set first_name = 'Alexandru', last_name = 'cel Bun' where id = 26;
select * from employees where first_name = 'Marv' ;
update employees set age = 85 where first_name = 'Marv';
select * from employees where age > 70;
update employees set first_name = 'Abgar' where age > 70;

-- Ex 23.10 delete employees
delete from employees where age < 20;
delete from employees where first_name ='Alexandru';

-- Exx 23.11 Add new employees
select * from employees where email in ('maiacebanjava@gmail.com', 'joracardan@yahoo.com', 'asilegratii@mail.ru');
insert into employees (first_name, last_name, email, age) 
values ('Ceban', 'Maia', 'maiacebanjava@gmail.com', 26),
('Jora', 'Cardan','joracardan@yahoo.com', 32),
('Vasile', 'Gratii', 'asilegratii@mail.ru', 27);


-- Ex 23.12 Department table
select * from departments;
insert into departments values (1, 'python');
create table if not exists departments (
department_id int not null,
department_name varchar(20)
);



-- Ex 23.13 Department table constraints - adding a new column to the existing table
select * from employees;
alter table employees add column department_id int;

-- Ex 23.14 Department table consistency constrains 
select * from departments d;
alter table departments add constraint department_id_key unique (department_id); 
alter table departments alter column department_id set not null;

alter table departments alter column department_name set not null;
alter table departments alter column department_name set default 'Unknown';

-- Ex 23.15  Primary key



