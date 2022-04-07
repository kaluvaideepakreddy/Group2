package abcd.demoabcd.tables;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SeatType {
    @Id
    @SequenceGenerator(
            name="Seat_sequence",
            sequenceName = "Seat_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Seat_sequence"
    )
    private Long SeatTypeId;
    private String SeatTypeDesc;
    private Float SeatFare;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(
            name="SeatTypeId",
            referencedColumnName = "SeatTypeId"
    )
    private List<BookingDetail> BookingDetail;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(
            name="SeatTypeId",
            referencedColumnName = "SeatTypeId"
    )
    private List<HallCapacity> HallCapacity;
}
