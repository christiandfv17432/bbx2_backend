package com.bbx2.formacion.dto;

import com.bbx2.formacion.Enums.State;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter

public class ItemDTO {

    private Long id;
    private String description;
    private Double price;
    private State state;
    private Set<SupplierDTO> supplierDTOS;
    private PriceReductionDTO priceReductionDTO;
    private String date;
    private String user;

    public ItemDTO(){}

    public ItemDTO(Long id, String description, Double price, State state, Set<SupplierDTO> supplierDTOS, PriceReductionDTO priceReductionDTO, String date, String user) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.state = state;
        this.supplierDTOS = supplierDTOS;
        this.priceReductionDTO = priceReductionDTO;
        this.date = date;
        this.user = user;
    }
}
