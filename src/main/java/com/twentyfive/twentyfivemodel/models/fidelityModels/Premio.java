package com.twentyfive.twentyfivemodel.models.fidelityModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Premio {

    private String id;
    private String cardId;

    private LocalDateTime claimDate;
    private boolean claimed;
}
