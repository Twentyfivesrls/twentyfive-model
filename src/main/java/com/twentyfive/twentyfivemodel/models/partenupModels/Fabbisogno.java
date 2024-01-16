package com.twentyfive.twentyfivemodel.models.partenupModels;





import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fabbisogno {
    
    
    private long id;

    private Date data;

    private PuntoVendita puntoVendita;

    private BaseDiCarico basedicarico;

    private Fornitore fornitore;

    private boolean preventivoesistente;

    private boolean trasportoesistente;


    private boolean smaltito;

    private double gasolio;
    private double benzina;
    private double supreme;
    private double gpl;

}
