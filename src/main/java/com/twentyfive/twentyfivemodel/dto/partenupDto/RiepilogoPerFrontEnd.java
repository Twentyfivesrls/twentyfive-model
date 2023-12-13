package com.twentyfive.twentyfivemodel.dto.partenupDto;

import com.twentyfive.twentyfivemodel.models.partenup.Fabbisogno;
import com.twentyfive.twentyfivemodel.models.partenup.Preventivo;
import com.twentyfive.twentyfivemodel.models.partenup.Trasporto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RiepilogoPerFrontEnd {
    private long id;

    private Fabbisogno fabbisogno;


    private double caligasolio;
    private double calibenzina;
    private double calisupreme;
    private double caligpl;

    private double ultimoscarico;

    private Trasporto trasporto;

    private Preventivo preventivo;

    private String das;

    private double prezzogasoliofornitore;
    private double prezzosupremefornitore;
    private double prezzobenzinafornitore;
    private double prezzogplfornitore;


    private String numerofatturafornitore;

    // CALCOLABILE
    private double importofatturafornitore;


    private String numerofatturapartenopea;


    // Da preventivo
    private double importofattura;

    private Date databonifico;
    private double importobonifico;


    // Da Preventivo
    private double importopreventivo;

    // CALCOLABILE
    private double residuodaversare;


    private double totalevolumicarburantitradizionali;
}
