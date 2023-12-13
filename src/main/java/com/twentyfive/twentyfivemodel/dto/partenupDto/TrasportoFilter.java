package com.twentyfive.twentyfivemodel.dto.partenupDto;

import com.twentyfive.twentyfivemodel.models.partenup.Atk;
import com.twentyfive.twentyfivemodel.models.partenup.BaseDiCarico;
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
