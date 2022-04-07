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
public class Users {
    @Id

    private Long UserId;
    private String UserName;
    private char UserType;
    private Long MobileNo;
    private String EmailId;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(
            name="UserId",
            referencedColumnName = "UserId"
    )
    private List<Booking> Booking;
}
