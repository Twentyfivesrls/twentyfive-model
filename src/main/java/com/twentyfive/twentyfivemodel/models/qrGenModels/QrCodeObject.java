package com.twentyfive.twentyfivemodel.models.qrGenModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QrCodeObject {
    private String idQrCode;
    private String name;
    private String link;
    private String description;
    private String qrImage;
    private String username;
    private Boolean isActivated;

    /*private String tDirectory;*/
    public QrCodeObject(String name, String link, String description, String qrCodeImagePath,
                        String username, Boolean isActivated){
        this.name = name;
        this.link = link;
        this.description = description;
        this.qrImage = qrCodeImagePath;
        this.username = username;
        this.isActivated = isActivated;
    }
}
