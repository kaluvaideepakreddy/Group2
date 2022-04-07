package com.mbs.Multiplex_Booking_system.mbs.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder


public class BookingDetails {
    //    @Id
//    @SequenceGenerator(
//            name = "BookingDetail_Sequence",
//            sequenceName = "BookingDetail_Sequence",
//            allocationSize = 1
//    )
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE,
//            generator = "BookingDetail_Sequence"
//
//    )
//    private long BookingId;
//    private long SeatTypeId;
    @EmbeddedId
    private BookingDetailsKey Id;
    @ManyToOne
    @MapsId("BookingId")
    @JoinColumn(name="BookingId")
    private Booking Booking;
    @ManyToOne
    @MapsId("SeatTypeId")
    @JoinColumn(name="SeatTypeId")
    private SeatType seatType;


    private Long NoofSeats;

}