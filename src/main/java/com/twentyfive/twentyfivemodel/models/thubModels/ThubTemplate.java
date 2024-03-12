package com.twentyfive.twentyfivemodel.models.thubModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ThubTemplate {

    private String name;
    private String backgroundColor;
    private String backgroundImage;
    private String buttonColor;
    private String buttonStyle;
    private String buttonTextColor;
    private String font;
    private String fontColor;
}
