package com.cydeo.mentor.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "ROLE")
public class Role extends BaseEntity {


//    private Long id;
    private String name;
}
