package com.bbx2.formacion.dto;

import com.bbx2.formacion.model.Item;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class SupplierDTO {
    private Long id;
    private String name;
    private String country;

    public SupplierDTO (){}


}
