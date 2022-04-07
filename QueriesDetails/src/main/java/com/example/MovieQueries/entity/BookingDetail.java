package com.example.MovieQueries.entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "BookingDetail")
public class BookingDetail {
    @EmbeddedId
    private BookingDetailKey id;
    @ManyToOne
    @MapsId("BookingId")
    @JoinColumn(name = "BookingId")
    private Booking BookingId;
    @ManyToOne
    @MapsId("SeatTypeId")
    @JoinColumn(name = "SearTypeId")
    private SeatType SeatTypeId;
    private int NoOfSeats;

}
