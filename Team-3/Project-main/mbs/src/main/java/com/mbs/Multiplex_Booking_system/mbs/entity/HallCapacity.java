package com.mbs.Multiplex_Booking_system.mbs.entity;

import lombok.AllArgsConstructor;
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


public class HallCapacity {
    //    @Id
//    @SequenceGenerator(
//            name = "HallCapacity_Sequence",
//            sequenceName = "HallCapacity_Sequence",
//            allocationSize = 1
//    )
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE,
//            generator = "HallCapacity_Sequence"
//
//    )
//    private Long HallId;
//    private Long SeatTypeId;
    @EmbeddedId
    HallCapacityKey id;
    @ManyToOne
    @MapsId("HallID")
    @JoinColumn(name="HallID")
    private Hall hall;
    @ManyToOne
    @MapsId("SeatTypeId")
    @JoinColumn(name="SeatTypeId")
    private SeatType seatType;
    private int SeatCount;
}
