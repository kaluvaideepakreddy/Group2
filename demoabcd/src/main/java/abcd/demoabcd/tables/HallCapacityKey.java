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
public class HallCapacityKey implements Serializable {
    @Column(name="HallId")
    private Long HallId;
    @Column(name="SeatTypeId")
    private Long SeatTypeId;
}
