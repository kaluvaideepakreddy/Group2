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
@Table(name = "Hall")
public class Hall {


    @Id
    @SequenceGenerator(
            name = "Hall_sequence",
            sequenceName = "Hall_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Hall_sequence"
    )


    private long HallId;
    private String HallDesk;
    private String TotalCapacity;

}
