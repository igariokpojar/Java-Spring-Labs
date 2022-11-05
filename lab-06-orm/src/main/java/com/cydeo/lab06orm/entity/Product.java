package com.cydeo.lab06orm.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
//@Table(name = "products")
public class Product extends BaseEntity{

    private String name;
    private Long price;
    private Integer quantity;
    private Integer remaining_quantity;

    @ManyToMany
    @JoinTable(name = "product_category_rel",
    joinColumns = @JoinColumn(name = "p_id"),
    inverseJoinColumns = @JoinColumn(name = "c_id"))
    private List<Category> category;

}
