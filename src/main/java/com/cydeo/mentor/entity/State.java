package com.cydeo.mentor.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Data
@Entity
public class State extends BaseEntity {


    //    private Long id;
    private String stateCode;
    private String stateName;
}
