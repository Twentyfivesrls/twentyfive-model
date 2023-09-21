package com.twentyfive.twentyfivemodel.filterTicket;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressBookFilter extends FilterObject  {
    private String firstName;
    private String lastName;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
