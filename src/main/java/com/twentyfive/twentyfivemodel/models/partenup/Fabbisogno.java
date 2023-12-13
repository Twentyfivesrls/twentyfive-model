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
public class Fabbisogno {
    @Id
    @GeneratedValue
    private long id;

    private Date data;

    @OneToOne
    private PuntoVendita puntoVendita;

    @OneToOne
    private BaseDiCarico basedicarico;

    @OneToOne
    private Fornitore fornitore;

    private boolean preventivoesistente;

    private boolean trasportoesistente;


    private boolean smaltito;

    private double gasolio;
    private double benzina;
    private double supreme;
    private double gpl;

}
