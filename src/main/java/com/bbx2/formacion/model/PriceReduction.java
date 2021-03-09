package com.bbx2.formacion.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Data
public class PriceReduction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double reducePrice;
    private String startDate;
    private String endDate;

    public PriceReduction() {
    }


    public PriceReduction(Long id, double reducePrice, String startDate, String endDate) {
        this.id = id;
        this.reducePrice = reducePrice;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
