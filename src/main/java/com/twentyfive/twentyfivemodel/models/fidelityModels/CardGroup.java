package com.twentyfive.twentyfivemodel.models.fidelityModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CardGroup {

    private String id;
    private String ownerId;

    private String name;
    private String description;
    private Date creationDate;
    private Date expirationDate;
    private int scanNumber; //number of scan that a card belonging to this group has to do
    private int numberOfDaysForPrize; //number of days a user can wait to claim the prize
    private Boolean isActive;
}
