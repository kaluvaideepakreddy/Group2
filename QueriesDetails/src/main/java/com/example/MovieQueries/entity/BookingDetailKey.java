package com.example.MovieQueries.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
@Embeddable
@AllArgsConstructor
@Data
@NoArgsConstructor
@EqualsAndHashCode
public class BookingDetailKey implements Serializable {
    @Column(name = "BookingId")
    private Long BookingId;
    @Column(name ="SeatTypeId")
    private Long SeatTypeId;
}
