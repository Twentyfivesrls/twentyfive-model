package com.twentyfive.twentyfivemodel.models.partenupModels;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue
    private long idcliente;

    private String nomecliente;

    private String partitaiva;

    @OneToMany()
    private List<PuntoVendita> listapuntivendita = new LinkedList<>();

    private double marginegasolioservito;
    private double marginegasolioself;

    private double marginebenzinaservito;
    private double marginebenzinaself;

    private double marginesupremeservito;
    private double marginesupremeself;

    private double marginegplservito;
    private double marginegplself;
}
