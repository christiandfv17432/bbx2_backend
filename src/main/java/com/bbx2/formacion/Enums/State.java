package com.bbx2.formacion.Enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
public enum State {

    ACTIVE("Active"),
    DISCONTINUED("Discontinued");


    String state;

    State(String state) {

        this.state = state;
    }
}

