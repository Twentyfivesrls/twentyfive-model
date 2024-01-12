package com.twentyfive.twentyfivemodel.models.partenupModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Trasportatore {
    
    
    private String nometrasportatore;

    private List<Rimorchio> listarimorchi;

    private List<Atk> listaatk;

    private List<Autista> listaautisti;
}
