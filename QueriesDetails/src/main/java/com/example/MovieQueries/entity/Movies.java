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
@Table(name = "Movies")

public class Movies {

    @Id
    @SequenceGenerator(
            name = "Movies_sequence",
            sequenceName = "Movies_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Movies_sequence"
    )
    private long MovieID;
    private String MovieName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "MovieID",
            referencedColumnName = "MovieId"
    )
    private List<Shows> showsList;
}
