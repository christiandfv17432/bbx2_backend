package com.bbx2.formacion.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
@Data
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String country;

    @ManyToMany(fetch = FetchType.LAZY)
    private Set<Item> items = new HashSet<>();

    public Supplier(){}


    public Supplier(Long id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }


}