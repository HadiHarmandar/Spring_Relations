package com.cydeo.mentor.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Product extends BaseEntity {

    private String name;
    private double price;

    @ManyToOne
    private Category category;


}
