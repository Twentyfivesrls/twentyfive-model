package com.twentyfive.twentyfivemodel.models.partenupModels;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Trasporto {


    private long id;

    private Date datadicaricazione;

    private Fabbisogno fabbisogno;

    private Atk atk;

    private Rimorchio rimorchio;

    private Autista autista;

    private String nometrasportatore;

}
