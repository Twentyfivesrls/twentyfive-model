package com.twentyfive.twentyfivemodel.models.partenupModels;





import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    
    
    private long idcliente;

    private String nomecliente;

    private String partitaiva;

    private List<PuntoVendita> listapuntivendita = new LinkedList<>();

    private double marginegasolioservito;
    private double marginegasolioself;

    private double marginebenzinaservito;
    private double marginebenzinaself;

    private double marginesupremeservito;
    private double marginesupremeself;

    private double marginegplservito;
    private double marginegplself;
}
