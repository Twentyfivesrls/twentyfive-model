package com.twentyfive.twentyfivemodel.models.partenupModels;





import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class VoceDiRettifica {
    
    
    private long idvocedirettifica;

    
    private String nomevoce;

    // TRUE = AGGIUNTA, FALSE = SOTTRATTA
    private boolean aggiuntasottratta;
}
