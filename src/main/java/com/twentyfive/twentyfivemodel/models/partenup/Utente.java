package com.twentyfive.twentyfivemodel.models.partenup;

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
}
