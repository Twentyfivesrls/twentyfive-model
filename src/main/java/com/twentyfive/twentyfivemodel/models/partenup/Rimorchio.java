package com.twentyfive.twentyfivemodel.models.partenup;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rimorchio {
    @Id
    @Column(unique = true)
    private String targa;
}
