CREATE TABLE booking_timeslot
(
    timeslot_id INTEGER     NOT NULL,
    booking_id  VARCHAR(36) NOT NULL,
    FOREIGN KEY (timeslot_id) REFERENCES timeslot (id),
    FOREIGN KEY (booking_id) REFERENCES booking (id)
);