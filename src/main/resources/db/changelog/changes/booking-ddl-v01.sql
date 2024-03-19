CREATE TABLE booking
(
    id                   VARCHAR(36) PRIMARY KEY,
    tenant_id            VARCHAR(255) NOT NULL,
    booking_type_id      INTEGER      NOT NULL,
    subscription_type_id INTEGER      NOT NULL,
    booking_date         DATE         NOT NULL,
    notes                TEXT,
    FOREIGN KEY (tenant_id) REFERENCES tenant (id),
    FOREIGN KEY (booking_type_id) REFERENCES booking_type (id),
    FOREIGN KEY (subscription_type_id) REFERENCES subscription_type (id)
);