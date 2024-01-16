package com.twentyfive.twentyfivemodel.models.partenupModels;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuotazioneGiornaliera {
    
    
    private long id;

    private Date data;

    private double prezzobenzina;

    private double prezzogasolio;

    private double prezzosupreme;

    private double prezzogpl;
}
