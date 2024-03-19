CREATE TABLE booking_subscription
(
    id                VARCHAR(36) PRIMARY KEY,
    start_date        DATE        NOT NULL,
    end_date          DATE        NOT NULL,
    subscription_date DATE        NOT NULL,
    booking_id        VARCHAR(36) NOT NULL UNIQUE,
    FOREIGN KEY (booking_id) REFERENCES booking (id)
);