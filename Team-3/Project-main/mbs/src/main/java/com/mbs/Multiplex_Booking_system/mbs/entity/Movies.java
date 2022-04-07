package com.mbs.Multiplex_Booking_system.mbs.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Movies {
    @Id
    @SequenceGenerator(
            name = "Movies_Sequence",
            sequenceName = "Movies_Sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Movies_Sequence"

    )
    private Long MovieId;
    private String MovieName;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(
            name="MovieId",
            referencedColumnName="MovieId"
    )
    private List<Shows> showsList;

}