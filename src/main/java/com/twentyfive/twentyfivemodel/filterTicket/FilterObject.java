package com.twentyfive.twentyfivemodel.filterTicket;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilterObject {
    private Integer page;
    private Integer size;
}
