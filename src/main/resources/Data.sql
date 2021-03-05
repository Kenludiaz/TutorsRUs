.COPY tutors(id, first_name,  last_name, email, phone, remote, rating, subject)
FROM '/tutors.csv'
DELIMITER ','
CSV HEADER;