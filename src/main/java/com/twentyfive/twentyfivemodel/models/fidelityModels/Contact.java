package com.twentyfive.twentyfivemodel.models.fidelityModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {

    private String id;

    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private Date creationDate;

}
