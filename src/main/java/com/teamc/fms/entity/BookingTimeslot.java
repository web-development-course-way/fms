package com.teamc.fms.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "booking_timeslot")
@IdClass(BookingTimeslotPKId.class)
public class BookingTimeslot {

    @Id
    @ManyToOne
    @JoinColumn(name = "timeslot_id")
    private TimeSlot timeSlot;

    @Id
    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;
}

