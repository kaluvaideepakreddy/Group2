package com.mbs.Multiplex_Booking_system.mbs.entity;

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
    @SequenceGenerator(
            name = "Users_Sequence",
            sequenceName = "Users_Sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Users_Sequence"

    )
    private Long UserId;
    private String UserName;
    private char UserType;
    private int MobileNo;
    private String EmailId;

}