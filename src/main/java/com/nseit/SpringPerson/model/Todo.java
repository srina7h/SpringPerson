package com.nseit.SpringPerson.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Todo {
    @Id
    @GeneratedValue
    private int id;
    private String itemName;
    private boolean completed;


}
