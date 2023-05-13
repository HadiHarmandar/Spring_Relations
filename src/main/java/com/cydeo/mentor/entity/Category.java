package com.cydeo.mentor.entity;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Category extends BaseEntity {


//    private Long id;
    private String categoryName;
    private int tax;

}
