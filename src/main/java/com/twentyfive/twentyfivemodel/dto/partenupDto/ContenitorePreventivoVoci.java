package com.twentyfive.twentyfivemodel.dto.partenupDto;

import com.twentyfive.twentyfivemodel.models.partenupModels.Preventivo;
import com.twentyfive.twentyfivemodel.models.partenupModels.VoceDiRettificaConValore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContenitorePreventivoVoci {
    Preventivo preventivo;
    List<VoceDiRettificaConValore> dareinserirenelpuntovendita;
}
