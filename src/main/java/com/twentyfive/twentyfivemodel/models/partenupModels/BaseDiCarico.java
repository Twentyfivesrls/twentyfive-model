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
@AllArgsConstructor
@NoArgsConstructor
public class BaseDiCarico {
    @Id
    @GeneratedValue
    private Long idbasedicarico;

    @Column(unique = true)
    private String nomebasedicarico;
}
