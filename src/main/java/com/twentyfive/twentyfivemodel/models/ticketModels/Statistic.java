package com.twentyfive.twentyfivemodel.models.ticketModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Statistic {
    private String id;
    private String idEvent;
    private Integer totalTicket;
    private Integer totalTicketActivated;
    private String userId;
}
