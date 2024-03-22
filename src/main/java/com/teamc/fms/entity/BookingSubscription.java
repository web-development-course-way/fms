package com.teamc.fms.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Data
@Entity
@Table(name="booking_subscription")
public class BookingSubscription {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @NotNull
    private LocalDate startDate;

    @NotNull
    private LocalDate endDate;

    @NotNull
    private LocalDate subsciptionDate;

    @OneToOne
    @JoinColumn(name="booking_id")
    private Booking booking;


}
