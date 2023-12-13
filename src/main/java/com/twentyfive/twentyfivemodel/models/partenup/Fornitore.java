package com.twentyfive.twentyfivemodel.models.partenup;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fornitore {
    @Id
    @GeneratedValue
    private long idfornitore;

    @Column(unique = true)
    private String nomefornitore;

    private Date datainiziocontratto;

    private Date datafinecontratto;

    @OneToMany(cascade = CascadeType.ALL)
    private List<QuotazioneGiornaliera> quotazioni;

}
