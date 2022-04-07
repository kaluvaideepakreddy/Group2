package abcd.demoabcd.tables;
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
public class Hall {
    @Id
    @SequenceGenerator(
            name="Hall_sequence",
            sequenceName = "Hall_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Hall_sequence"
    )
    private Long HallId;
    private String HallDesc;
    private Long TotalCapacity;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(
            name="HallId",
            referencedColumnName = "HallId"
    )
    private List<Shows> Shows;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(
            name="HallId",
            referencedColumnName = "HallId"
    )
    private List<HallCapacity> HallCapacity;



}
