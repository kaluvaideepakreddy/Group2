package com.example.MovieQueries.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HallCapacityKey implements Serializable {
    @Column(name = "seatTypeId")
    private Long seatTypeId;
    @Column(name = "HallId")
    private Long HallId;
}
