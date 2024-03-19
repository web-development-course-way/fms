CREATE TABLE country
(
    code        VARCHAR(2) PRIMARY KEY,
    name        VARCHAR(255) NOT NULL UNIQUE,
    nationality VARCHAR(255) NOT NULL UNIQUE
);