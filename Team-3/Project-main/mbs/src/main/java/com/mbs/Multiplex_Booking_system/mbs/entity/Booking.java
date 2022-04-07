package com.mbs.Multiplex_Booking_system.mbs.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Booking {
    @Id
    @SequenceGenerator(
            name = "Booking_Sequence",
            sequenceName = "Booking_Sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Booking_Sequence"

    )
    private Long BookingId;
    //    private long ShowId;
//    private long UserId;
    private Date BookedDate;
    private Date ShowDate;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name="ShowId",
            referencedColumnName="ShowId"
    )
    private Shows shows;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name="UserId",
            referencedColumnName="UserId"

    )
    private Users users;



}