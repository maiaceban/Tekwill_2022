CREATE TABLE public.book_authors (
	book_id int4 NOT NULL,
	author_id int4 NOT NULL,
	CONSTRAINT book_authors_pkey PRIMARY KEY (book_id),
	CONSTRAINT book_id_key UNIQUE (book_id),
	CONSTRAINT fk_author FOREIGN KEY (author_id) REFERENCES public.authors(id) ON DELETE CASCADE,
	CONSTRAINT fk_book FOREIGN KEY (book_id) REFERENCES public.books(id) ON DELETE CASCADE
);

CREATE TABLE public.authors (
	id int4 NOT NULL,
	first_name text NOT NULL,
	last_name text NOT NULL,
	CONSTRAINT authors_pkey PRIMARY KEY (id)
);

CREATE TABLE public.books (
	id int4 NOT NULL,
	title text NOT NULL,
	total_pages int4 NOT NULL,
	isbn text NOT NULL,
	publication_date date NOT NULL,
	CONSTRAINT books_pkey PRIMARY KEY (id)
);