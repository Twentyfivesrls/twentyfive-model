package com.twentyfive.twentyfivemodel.dto.ticketDto;

import com.twentyfive.twentyfivemodel.models.ticketModels.AddressBook;
import com.twentyfive.twentyfivemodel.models.ticketModels.Ticket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketAndAddressBook {
    private Ticket ticket;
    private AddressBook addressBook;
}
