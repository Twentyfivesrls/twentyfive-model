package com.twentyfive.twentyfivemodel.dto.partenupDto;

import com.twentyfive.twentyfivemodel.models.partenup.PuntoVendita;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PuntoVenditaConCliente {
    private PuntoVendita puntovendita;

    private String nomecliente;
}
