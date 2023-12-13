package com.twentyfive.twentyfivemodel.models.partenup;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VoceDiRettificaConValore {
    @Id
    @GeneratedValue
    private long id;

    private String vocedirettifica;

    // true = + , false = -
    private boolean segno;

    private double valore;

    private String descrizione;
}
