package com.bbx2.formacion.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ItemResponse {

    private Long itemCode;
    private String description;

    public ItemResponse(){}
}
