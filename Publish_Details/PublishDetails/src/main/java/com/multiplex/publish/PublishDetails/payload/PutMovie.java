package com.multiplex.publish.PublishDetails.payload;

import lombok.Data;
import com.multiplex.publish.PublishDetails.Validation.ValidMovie;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
@Data
public class PutMovie {
    @NotNull
    @NotEmpty
    @ValidMovie
    private String MovieName;
    @NotEmpty
    @NotNull
    private Long MovieId;
}
