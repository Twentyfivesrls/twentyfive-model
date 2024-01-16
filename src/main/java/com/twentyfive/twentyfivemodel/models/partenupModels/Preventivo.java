package com.twentyfive.twentyfivemodel.models.partenupModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Preventivo {
    
    
    private long id;

    private Date data;

    private String nomecliente;

    private Fabbisogno riferimento;

    private double prezzoalpubblicogasolioservito;
    private double prezzoalpubblicogasolioself;

    private double prezzoalpubblicobenzinaservito;
    private double prezzoalpubblicobenzinaself;

    private double prezzoalpubblicosupremeservito;
    private double prezzoalpubblicosupremeself;

    private double prezzoalpubblicogplservito;
    private double prezzoalpubblicogplself;

    private double marginecessionegasolio;
    private double marginecessionebenzina;
    private double marginecessionesupreme;
    private double marginecessionegpl;

    private List<VoceDiRettificaConValore> listavocidirettifica = new LinkedList<>();
}
