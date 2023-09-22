package com.twentyfive.twentyfivemodel.models.emailModels;

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
