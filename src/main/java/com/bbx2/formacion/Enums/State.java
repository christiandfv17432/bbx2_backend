package com.bbx2.formacion.Enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public enum State {

    ACTIVE("Active"),DISCONTINUED("Discontinued");

    private String state;


}
