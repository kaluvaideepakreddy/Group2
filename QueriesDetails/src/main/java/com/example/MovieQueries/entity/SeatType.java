package com.example.MovieQueries.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "SeatType")
public class SeatType {

    @Id
    @SequenceGenerator(
            name = "Booking_sequence",
            sequenceName = "Booking_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Booking_sequence"
    )
    private long SeatTypeId;
    private String SeatTypeDesc;
    private Float SeatFare;



}
