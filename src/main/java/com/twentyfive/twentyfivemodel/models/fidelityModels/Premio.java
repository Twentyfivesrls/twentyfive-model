package com.twentyfive.twentyfivemodel.models.fidelityModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Premio {

    private String id;
    private String name;
    private String cardId;
    private int quantity;

}
