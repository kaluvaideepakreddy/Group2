package com.mbs.Multiplex_Booking_system.mbs.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
@Builder

public class SeatType {
    @Id
    @SequenceGenerator(
            name = "SeatType_Sequence",
            sequenceName = "SeatType_Sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SeatType_Sequence"

    )
    private long SeatTypeId;
    private String SeatTypeDesc;
    private float SeatFare;
}
