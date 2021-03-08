package com.bbx2.formacion.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PriceReduction {

    private double reducePrice;
    private String startDate;
    private String endDate;
}
