package com.twentyfive.twentyfivemodel.models.partenupModels;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuotazioneGiornaliera {
    @Id
    @GeneratedValue
    private long id;

    private Date data;

    private double prezzobenzina;

    private double prezzogasolio;

    private double prezzosupreme;

    private double prezzogpl;
}
