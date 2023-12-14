package com.twentyfive.twentyfivemodel.dto.partenupDto;

import com.twentyfive.twentyfivemodel.models.partenupModels.Atk;
import com.twentyfive.twentyfivemodel.models.partenupModels.BaseDiCarico;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrasportoFilter {
    private Atk atk;

    private BaseDiCarico baseDiCarico;

    private Date data;
}
