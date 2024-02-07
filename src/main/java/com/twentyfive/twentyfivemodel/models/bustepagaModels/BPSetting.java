package com.twentyfive.twentyfivemodel.models.bustepagaModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BPSetting {

    private String id;
    private String userId;
    private String mailText;
    private String fileName;
}
