package com.twentyfive.twentyfivemodel.models.qrGenModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailNotification {
    private String id;
    private String subject;
    private String emailAddress;
    private String messagge;
}
