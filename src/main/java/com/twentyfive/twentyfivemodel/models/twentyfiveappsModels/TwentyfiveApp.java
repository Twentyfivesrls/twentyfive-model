package com.twentyfive.twentyfivemodel.models.twentyfiveappsModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TwentyfiveApp {
    private String id;
    private String title;
    private String description;
    private String imageUrl;
    private Byte[] imageContent;
    private Boolean isPremium;
    private Boolean isIncoming;
}
