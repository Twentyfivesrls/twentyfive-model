package com.twentyfive.twentyfivemodel.models.fidelityModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {

    private String id;
    private String cardGroupId;
    private String customerId;

    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private int scanNumberExecuted;
    private LocalDateTime creationDate; //when the card is created
    private LocalDateTime lastScanDate; //when the card is scanned for the last time
    public Boolean isActive;
}
