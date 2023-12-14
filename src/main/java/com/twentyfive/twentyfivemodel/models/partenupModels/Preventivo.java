package com.twentyfive.twentyfivemodel.models.partenupModels;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Preventivo {
    @Id
    @GeneratedValue
    private long id;

    private Date data;

    private String nomecliente;

    @OneToOne
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

    @OneToMany(fetch = FetchType.EAGER)
    private List<VoceDiRettificaConValore> listavocidirettifica = new LinkedList<>();
}
