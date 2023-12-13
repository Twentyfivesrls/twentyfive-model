package com.twentyfive.twentyfivemodel.models.partenup;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Trasporto {
    @Id
    @GeneratedValue
    private long id;

    private Date datadicaricazione;

    @OneToOne
    private Fabbisogno fabbisogno;

    @OneToOne
    private Atk atk;

    @OneToOne
    private Rimorchio rimorchio;

    @OneToOne
    private Autista autista;

    private String nometrasportatore;

}
