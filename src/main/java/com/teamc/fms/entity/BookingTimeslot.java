package com.teamc.fms.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "booking_timeslot")
public class BookingTimeslot {

   @ManyToOne
    private TimeSlot timeSlot;

   @ManyToOne
    private Booking booking;
}

