package com.twentyfive.twentyfivemodel.models.partenupModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fornitore {
    
    
    private long idfornitore;

    
    private String nomefornitore;

    private Date datainiziocontratto;

    private Date datafinecontratto;

    private List<QuotazioneGiornaliera> quotazioni;

}
