package com.teamc.fms.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "booking")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @NotNull
    @ManyToOne
    private Tenant tenant;
    @NotNull
    @ManyToOne
    private BookingType bookingType;
    @NotNull
    @ManyToOne
    private SubscriptionType subscriptionType;
    @NotNull
    private LocalDate bookingDate;
    private String notes;
}
