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
@Table(name = "Shows")
public class Shows {

    @Id
    @SequenceGenerator(
            name = "Shows_sequence",
            sequenceName = "Shows_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Shows_sequence"
    )
    private long Show_Id;
    private long Slot_No;
    private Date FromDate;
    private Date ToDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "hallId",
            referencedColumnName = "HallId"
    )
    private Hall hall;

}
