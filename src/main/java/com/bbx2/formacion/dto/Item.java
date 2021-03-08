package com.bbx2.formacion.dto;

import com.bbx2.formacion.Enums.State;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter

public class Item {

    private Long code;
    private String description;
    private double price;
    private State state;
    private Set<Supplier> suppliers;
    private PriceReduction priceReduction;
    private String date;
    private String user;


    public Item(Long code, String description, double price, State state, Set<Supplier> suppliers, PriceReduction priceReduction, String date, String user) {
        this.code = code;
        this.description = description;
        this.price = price;
        this.state = state;
        this.suppliers = suppliers;
        this.priceReduction = priceReduction;
        this.date = date;
        this.user = user;
    }
}
