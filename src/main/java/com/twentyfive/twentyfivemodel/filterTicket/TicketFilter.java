package com.twentyfive.twentyfivemodel.filterTicket;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketFilter extends FilterObject {
    private String eventName;
    private LocalDateTime eventDateStart;
    private LocalDateTime eventDateEnd;
}
