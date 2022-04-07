package com.example.MovieQueries.entity;

import   lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Booking")
public class Booking {
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
    private long BookingId;
    private Date BookedDate;
    private Date ShowDate;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "ShowId",
            referencedColumnName = "Show_Id"
    )
    private Shows shows;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "UserId",
            referencedColumnName = "UserId"
    )
    private Users users;
}
