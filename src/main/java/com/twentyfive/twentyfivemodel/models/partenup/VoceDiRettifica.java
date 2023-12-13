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
public class VoceDiRettifica {
    @Id
    @GeneratedValue
    private long idvocedirettifica;

    @Column(unique = true)
    private String nomevoce;

    // TRUE = AGGIUNTA, FALSE = SOTTRATTA
    private boolean aggiuntasottratta;
}
