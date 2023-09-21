package com.twentyfive.twentyfivemodel.models.qrGenModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QrStatistics {
    private String idQrStatistics;
    private Date scanDate;
    private String idQrCodeObject;
    private String browser;
    private String os;
    private String device;
    private String deviceType;
    private String lat;
    private String lon;
}
