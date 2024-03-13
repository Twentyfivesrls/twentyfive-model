package com.twentyfive.twentyfivemodel.dto.fidelityDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CardDto {

    private String cardId;
    private String customerId;

    private String name;
    private String surname;
    private String email;
    private String groupName;
    private String phoneNumber;
    private LocalDateTime creationDate; //when the card is created
    private LocalDateTime expirationDate;
    private LocalDateTime lastScanDate; //when the card is scanned for the last time
    private int numberOfDaysForPrize;
    private int scanNumberExecuted;
    private int maxScanNumber;
    public Boolean isActive;
}
