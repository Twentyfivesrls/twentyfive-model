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
public class Trasportatore {
    @Id
    @Column(unique = true)
    private String nometrasportatore;

    @OneToMany(cascade = {CascadeType.ALL})
    private List<Rimorchio> listarimorchi;

    @OneToMany(cascade = {CascadeType.ALL})
    private List<Atk> listaatk;

    @OneToMany(cascade = {CascadeType.ALL})
    private List<Autista> listaautisti;
}
