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
public class Booking {
    @Id
    @SequenceGenerator(
            name="Booking_sequence",
            sequenceName = "Booking_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator="Booking_sequence"
    )
    private  Long BookingId;
    private Date BookedDate;
    private  Date ShowDate;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "ShowId",
            referencedColumnName = "ShowId"
    )
    private Shows Show;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "UserId",
            referencedColumnName = "UserId"
    )
    private Users user;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(
            name="BookingId",
            referencedColumnName = "BookingId"
    )
    private List<BookingDetail> BookingDetail;
}
