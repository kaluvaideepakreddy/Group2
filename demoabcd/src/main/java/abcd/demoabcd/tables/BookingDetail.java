package abcd.demoabcd.tables;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookingDetail {
    @EmbeddedId
    BookingDetailKey id;
    @ManyToOne
    @MapsId("BookingId")
    @JoinColumn(name ="BookingId")
    private  Booking Booking;
    @ManyToOne
    @MapsId("SeatTypeId")
    @JoinColumn(name="SeatTypeId")
    private SeatType SeatType;
    private  Long NoOfSeats;
}
