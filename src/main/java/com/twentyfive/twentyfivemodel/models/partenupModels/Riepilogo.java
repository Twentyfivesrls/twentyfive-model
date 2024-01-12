package com.twentyfive.twentyfivemodel.models.partenupModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Riepilogo {
    
    
    private long id;
    private Fabbisogno fabbisogno;
    private double caligasolio;
    private double calibenzina;
    private double calisupreme;
    private double caligpl;

    private double ultimoscarico;

    private Trasporto trasporto;

    private Preventivo preventivo;

    private String das;

    private String numerofatturafornitore;

    private String numerofatturapartenopea;

    private Date databonifico;
    private double importobonifico;

    public Riepilogo(Fabbisogno fabbisogno,Trasporto trasporto,Preventivo preventivo){
        this.fabbisogno = fabbisogno;
        this.trasporto = trasporto;
        this.preventivo = preventivo;
    }
}
