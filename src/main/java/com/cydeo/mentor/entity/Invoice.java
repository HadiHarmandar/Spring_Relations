package com.cydeo.mentor.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;


@Data
@Entity
public class Invoice extends BaseEntity{

    private String invoiceNumber;
    private String invoiceType;

    @Column(columnDefinition = "DATE")
    private LocalDate invoiceDate;

    @ManyToOne
    private Client client;

}
