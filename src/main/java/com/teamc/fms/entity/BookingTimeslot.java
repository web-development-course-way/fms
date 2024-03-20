package com.teamc.fms.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "booking_timeslot")
public class BookingTimeslot {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String timeslotId;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String bookingId;
}
