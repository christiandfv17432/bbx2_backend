package com.bbx2.formacion.model;

import com.bbx2.formacion.Enums.State;
import lombok.Data;
import org.hibernate.annotations.Type;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String description;
    @Column
    private Double price;
    @Column
    @Enumerated(value = EnumType.STRING)
    private State state;

    @ManyToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    @JoinTable(
            name="items_suppliers",
            joinColumns = {
                    @JoinColumn(name="item_id",referencedColumnName = "id",nullable = false,updatable = false)
            },inverseJoinColumns = @JoinColumn(name="supplier_id",referencedColumnName ="id",nullable = false,updatable = false)
    )
    private List<Supplier> suppliers = new ArrayList<>();

    @OneToMany(targetEntity = PriceReduction.class)
    private List<PriceReduction> priceReduction;
    private String date;
    private String creator;

    public Item(){

    }




}
