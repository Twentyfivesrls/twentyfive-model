package com.twentyfive.twentyfivemodel.models.partenupModels;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class VoceDiRettificaConValore {
    
    
    private long id;

    private String vocedirettifica;

    // true = + , false = -
    private boolean segno;

    private double valore;

    private String descrizione;
}
