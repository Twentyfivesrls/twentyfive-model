package com.twentyfive.twentyfivemodel.models.partenup;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PuntoVendita {
    @Id
    @GeneratedValue
    private long idpunto;

    private String codicedestinazione;

    private String nome;

    private String via;

    private String citta;

    private String provincia;

    private String cap;

    @OneToMany(cascade = CascadeType.ALL)
    private List<VoceDiRettificaConValore> listavocidirettifica;
}
