package com.cydeo.mentor.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "invoice_product")
public class Invoice_Product extends BaseEntity{

    private int quantity;
    private double profit;

    @ManyToOne
    private Invoice invoice;

    @ManyToOne
    private Product product;


}
