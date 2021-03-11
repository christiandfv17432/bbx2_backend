package com.bbx2.formacion.dto;

import com.bbx2.formacion.Enums.State;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;



@Getter
@Setter
@AllArgsConstructor
public class ItemDTO {

    private Long id;
    private String itemCode;
    private String description;
    private Double price;
    private State state;
    private Set<SupplierDTO> suppliers = new HashSet<>();
    private Set<PriceReductionDTO> priceReduction = new HashSet<>();
    private String date;
    private String creator;

    public ItemDTO(Long id, String itemCode, String description, Double price, Set<SupplierDTO> suppliers, Set<PriceReductionDTO> priceReduction, String creator) {
        this.id = id;
        this.itemCode = itemCode;
        this.description = description;
        this.price = price;
        this.state=  State.ACTIVE;
        this.suppliers = suppliers;
        this.priceReduction = priceReduction;
        String pattern = "MM-dd-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        this.date = simpleDateFormat.format(new Date());
        this.creator = creator;
    }



    public ItemDTO() {

    }


}
