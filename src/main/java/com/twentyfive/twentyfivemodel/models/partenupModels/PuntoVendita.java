package com.twentyfive.twentyfivemodel.models.partenupModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PuntoVendita {
    
    
    private long idpunto;

    private String codicedestinazione;

    private String nome;

    private String via;

    private String citta;

    private String provincia;

    private String cap;

    private List<VoceDiRettificaConValore> listavocidirettifica;
}
