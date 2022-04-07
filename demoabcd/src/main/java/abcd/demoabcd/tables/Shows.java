package abcd.demoabcd.tables;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import javax.validation.constraints.NotBlank;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Shows {
    @Id
    @SequenceGenerator(
            name="Show_sequence",
            sequenceName = "Show_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Show_sequence"
    )

    private Long ShowId;

    @NotBlank
    private Long SlotNo;
    @NotBlank
    private Date FromDate;
    @NotBlank
    private Date ToDate;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "HallId",
            referencedColumnName = "HallId"
    )
    private Hall hall;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "MovieId",
            referencedColumnName = "MovieId"
    )
    private Movies Movies;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(
            name="ShowId",
            referencedColumnName = "ShowId"
    )
    private List<Booking> Booking;
}
