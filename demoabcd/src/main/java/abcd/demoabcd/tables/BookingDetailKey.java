package abcd.demoabcd.tables;

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
public class BookingDetailKey implements Serializable {
    @Column(name="BookingId")
    private Long BookingId;
    @Column(name="SeatTypeId")
    private Long SeatTypeId;
}
