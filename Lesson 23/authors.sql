create table if not exists books (
id int,
title text,
total_pages int,
isbn text,
publication_date date
);

create table if not exists authors (
id int,
first_name text,
last_name text
);

create table if not exists book_authors (
book_id int,
author_id int
);