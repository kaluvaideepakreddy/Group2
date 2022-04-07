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
public class Movies {
    @Id
    @SequenceGenerator(
            name="Movie_sequence",
            sequenceName = "Movie_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Movie_sequence"
    )
    private Long MovieId;
    private String MovieName;
    /*@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(
            name="MovieId",
            referencedColumnName = "MovieId"
    )
    private List<Shows> Shows;*/
}
