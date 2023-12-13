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
@AllArgsConstructor
@NoArgsConstructor
public class Riepilogo {
    @Id
    @GeneratedValue
    private long id;

    @OneToOne
    private Fabbisogno fabbisogno;


    private double caligasolio;
    private double calibenzina;
    private double calisupreme;
    private double caligpl;

    private double ultimoscarico;


    @OneToOne
    private Trasporto trasporto;

    @OneToOne
    private Preventivo preventivo;

    private String das;

    private String numerofatturafornitore;

    private String numerofatturapartenopea;

    private Date databonifico;
    private double importobonifico;
}
