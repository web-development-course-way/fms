CREATE TABLE tenant
(
    id             VARCHAR(36) PRIMARY KEY,
    first_name     VARCHAR(255) NOT NULL,
    last_name      VARCHAR(255) NOT NULL,
    email          VARCHAR(255) NOT NULL UNIQUE,
    phone_code     VARCHAR(10),
    phone_number   VARCHAR(255),
    nationality_id VARCHAR(3),
    birth_date     DATE,
    UNIQUE (phone_code, phone_number),
    UNIQUE (first_name, last_name),
    FOREIGN KEY (nationality_id) REFERENCES country (code)
);