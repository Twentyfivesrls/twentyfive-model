package com.twentyfive.twentyfivemodel.models.ticketModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event {
    private String id;
    private String name;
    private String description;
    private LocalDateTime date;
    private String location;
    private Boolean enabled;
}
