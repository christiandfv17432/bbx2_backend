package com.bbx2.formacion.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class PriceReductionDTO {
    private Long id;
    private Double reducePrice;
    private String startDate;
    private String endDate;

    public PriceReductionDTO(){}
}
