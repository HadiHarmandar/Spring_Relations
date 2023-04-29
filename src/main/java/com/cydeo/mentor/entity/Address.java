package com.cydeo.mentor.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Data
@Entity
public class Address extends BaseEntity {

    //    private Long id;
    private String description;
    private String zipCode;

    @ManyToOne
    private State state;


}
