package com.twentyfive.twentyfivemodel.models.ticketModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
    private String id;
    private String eventId;
    private String eventName;
    private String code;
    private LocalDateTime eventDateStart;
    private LocalDateTime eventDateEnd;
    private Boolean active;
    private Boolean used;
    private String addressBookId;
    private String email;
    private String userId;
    private String url;

}
