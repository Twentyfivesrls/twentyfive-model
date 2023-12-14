package com.twentyfive.twentyfivemodel.models.partenupModels;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Utente {
    @Id
    private String username;

    private String password;

    private String passwordinchiaro;
    // 0 = ADMIN , 1 = VIEWER, 2 = CLIENTE
    private int ruolo;
}
