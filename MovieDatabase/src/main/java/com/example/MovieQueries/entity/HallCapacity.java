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
@Table(name = "HallCapacity")
public class HallCapacity {

    @EmbeddedId
    HallCapacityKey id;

    @ManyToOne
    @MapsId("HallId")
    @JoinColumn(name = "HallId")
    private Hall hall;
    @ManyToOne
    @MapsId("SeatTypeId")
    @JoinColumn(name = "SeatTypeId")
    private SeatType seatType;

    private int SeatCount;
}
