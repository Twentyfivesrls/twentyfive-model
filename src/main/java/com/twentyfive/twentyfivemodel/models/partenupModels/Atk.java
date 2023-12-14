package com.twentyfive.twentyfivemodel.models.partenupModels;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Atk {
    @Id
    @GeneratedValue
    private long idatk;

    @Column(unique = true)
    private String codice;

    @Column(unique = true)
    private String targa;


    private String suggerito;
}
