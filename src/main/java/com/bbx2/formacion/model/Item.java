package com.bbx2.formacion.model;

import com.bbx2.formacion.Enums.State;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.aspectj.lang.annotation.RequiredTypes;
import org.hibernate.annotations.Type;


import javax.persistence.*;
import java.util.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Item {

    @Id
    @SequenceGenerator(
            name = "item_sequence",
            sequenceName = "item_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "item_sequence")
    private Long id;


    private String itemCode;

    @Column(nullable = false)
    private String description;
    @Column
    private Double price;
    @Column
    @Enumerated(value = EnumType.STRING)
    private State state;

    @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    @JoinTable(name = "ITEM_SUPPLIER", joinColumns = { @JoinColumn(name = "ITEM_ID") }, inverseJoinColumns = {
            @JoinColumn(name = "SUPPLIER_ID") })
    private Set<Supplier> suppliers = new HashSet<>();

    @OneToMany(targetEntity = PriceReduction.class)
    private Set<PriceReduction> priceReduction = new HashSet<>();
    private String date;
    private String creator;

    public Item(){}



}
