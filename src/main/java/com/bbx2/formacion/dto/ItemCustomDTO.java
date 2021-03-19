package com.bbx2.formacion.dto;

import com.bbx2.formacion.Enums.State;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ItemCustomDTO {
    private Long id;
    private String itemCode;
    private String description;
    private Double price;
    private State state;
    private String date;
    private String creator;

    public ItemCustomDTO() {

    }
}
