package com.twentyfive.twentyfivemodel.models.thubModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ThubCustomTheme {

    private String backgroundColor;
    private String backgroundImage;
    private String buttonShape;
    private String buttonStyle;
    private String buttonColor;
    private String buttonTextColor;
    private String font;
    private String fontColor;
}
