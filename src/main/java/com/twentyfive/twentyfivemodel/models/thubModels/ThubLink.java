package com.twentyfive.twentyfivemodel.models.thubModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ThubLink {

    private String id;
    private String name;
    private String url;
    private boolean isActive;
    private String thumbnail;
}
