CREATE TABLE facility
(
    id           VARCHAR(36) PRIMARY KEY,
    name         VARCHAR(255) NOT NULL UNIQUE,
    max_capacity INTEGER      NOT NULL DEFAULT 1,
    description  TEXT
);