DROP TABLE IF EXISTS tutors;
CREATE TABLE tutors(id serial, first_name VARCHAR(255),  last_name VARCHAR(255), email VARCHAR(255), phone VARCHAR(14), remote BOOLEAN, rating FLOAT, subject VARCHAR(255));
