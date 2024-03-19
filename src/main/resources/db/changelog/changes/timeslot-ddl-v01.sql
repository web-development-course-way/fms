CREATE TABLE timeslot
(
    id          INTEGER PRIMARY KEY,
    start_hour  TIME        NOT NULL,
    end_hour    TIME        NOT NULL,
    facility_id VARCHAR(36) NOT NULL,
    FOREIGN KEY (facility_id) REFERENCES facility (id)
);