package com.multiplex.publish.PublishDetails.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="shows",uniqueConstraints = {
        @UniqueConstraint(columnNames = {"MovieId"}),
        @UniqueConstraint(columnNames = {"MovieName"})
})
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ShowId;
    @NotBlank(message="Movie name is mandatory")
    private String MovieName;
    private long HallId;
    private long MovieId;
    private long SlotNo;
    private Date FromDate;
    private Date ToDate;
    @Enumerated(EnumType.STRING)
    private ShowType showType;


}
