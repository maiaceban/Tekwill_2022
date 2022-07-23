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

--
select
	'Alice'        as name,
	170            as height_in_centimerters,
	170 * 0.393701 as "height in inches";
select
	'BOB'          as NAME,
	160            as "HEIGHT IN CENTIMETERS",
	160 * 0.393701 as "HEIGHT IN INCHES";

--
select
	concat(first_name, ' ' , last_name) as nume,
	age as varsta,
	age * 2000 as salariu,
	first_name = 'Ranna' "is Ranna"
from
	employees;

-- Class Exercises:
-- Ex 23.7 Where employees
-- 1. select all emloyees that are younger than 45
select * from employees where age < 45;
-- 2. select all employees that have first name 'Lauren' or last name 'Beaulieu'
select * from employees where first_name = 'Lauren' or  last_name = 'Beaulieu';
-- 3. select all employees that are older than 60 or younger than 20
select * from employees where age > 60 or age < 20;

-- Ex 23.8 Sort employees
-- 1. order employees by age in a descending order 
select * from employees order by age desc;
-- 2. order employees by first name in a descending order 
select * from employees order by first_name desc;
-- 3. order employees by age in a ascendant order and by last name in a descending order 
select * from employees order by age asc, last_name desc;

-- Ex 23.9 Update employees 
-- 1. Update the empployees with id=26, set his first name to 'Alexandru' and last name to 'cel Bun'
select * from employees where id = 26;
update employees set first_name = 'Alexandru', last_name = 'cel Bun' where id = 26;
-- 2. Update the employees with first_name = Marv by setting his age to 85
select * from employees where first_name = 'Marv';
update employees set age = 85 where first_name = 'Marv';
-- 3. Update all emloyees that are older than 70 to have the first name 'Abgar'
select * from employees where  age > 70;
update employees set first_name = 'Abgar' where age > 70;

-- ex 23.10 Delete employees
-- 1. Delete all employees that are younger than 20
-- select * from employees;
delete from employees where age < 20;
-- 2. delete all employees with first name 'Abgar'
delete from employees where first_name = 'Abgar';

-- Ex 23.11 Add new employees
select * from employees where email in ('maiacebanjava@gmail.com', 'joracardan@yahoo.com', 'asilegratii@mail.ru');
insert into employees (first_name, last_name, email, age) 
values 
('Ceban', 'Maia', 'maiacebanjava@gmail.com', 26),
('Joachim', 'Worsnip', 'jwornip0@sina.com.cn', 29),
('Groian', 'Tatiana', 'groiantatiana@gmail.com', 38);

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



