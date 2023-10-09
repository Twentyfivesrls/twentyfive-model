package com.twentyfive.twentyfivemodel.models.ticketModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressBook {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
}
