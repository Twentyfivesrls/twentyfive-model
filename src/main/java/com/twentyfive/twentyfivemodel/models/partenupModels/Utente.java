package com.twentyfive.twentyfivemodel.models.partenupModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Utente {

    private String username;

    private String password;

    private String passwordinchiaro;
    // 0 = ADMIN , 1 = VIEWER, 2 = CLIENTE
    private int ruolo;
}
