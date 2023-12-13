package com.twentyfive.twentyfivemodel.dto.partenupDto;

import com.twentyfive.twentyfivemodel.models.partenup.Preventivo;
import com.twentyfive.twentyfivemodel.models.partenup.VoceDiRettificaConValore;
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
