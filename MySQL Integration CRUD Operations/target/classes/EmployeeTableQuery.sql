DROP TABLE IF EXISTS Employees;
CREATE TABLE Employees (
    id BIGINT PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    email_id VARCHAR(255) NOT NULL
);
INSERT INTO Employees (id, first_name, last_name, email_id) VALUES
(1, 'Zeus', 'Olympian', 'zeus@mythology.com'),
(2, 'Hera', 'Olympian', 'hera@mythology.com'),
(3, 'Poseidon', 'God of the Sea', 'poseidon@mythology.com'),
(4, 'Athena', 'Goddess of Wisdom', 'athena@mythology.com'),
(5, 'Apollo', 'God of the Sun', 'apollo@mythology.com'),
(6, 'Theseus', 'Aethra', 'theseus@mythology.com'),
(7, 'Achilles', 'Peleus', 'achilles@mythology.com'),
(8, 'Odysseus', 'Laertes', 'odysseus@mythology.com'),
(9, 'Perseus', 'Danaë', 'perseus@mythology.com');