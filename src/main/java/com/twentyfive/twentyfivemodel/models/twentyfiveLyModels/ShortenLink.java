package com.twentyfive.twentyfivemodel.models.twentyfiveLyModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShortenLink {
    private String id;
    private String destinationUrl;
    private String shortUrl;
    private Date createdAt;
    private String userId;
}
