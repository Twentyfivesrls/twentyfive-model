package com.twentyfive.twentyfivemodel.models.partenup;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Autista {

    @Id
    @GeneratedValue
    private long idautista;

    @Column(unique = true)
    private String nomeautista;

}

