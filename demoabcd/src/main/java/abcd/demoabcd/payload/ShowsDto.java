package abcd.demoabcd.payload;


import com.sun.istack.NotNull;
import lombok.Data;
import javax.validation.constraints.NotEmpty;

import java.util.Date;

@Data
public class ShowsDto {
    @NotNull
    @NotEmpty
    private long SlotNo;
    @NotNull
    @NotEmpty
    private Date FromDate;
    @NotNull
    @NotEmpty
    private Date ToDate;

}