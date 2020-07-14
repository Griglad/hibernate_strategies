package com.strategies.single_table;

import javax.persistence.*;

@Entity
//In order to place accurate select statements i put a DescriminatorColumn
@DiscriminatorColumn(name = "Vehicle_Type",discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Vehicle {
    @Id
    @GeneratedValue
    private int id;
    private String name;


    public Vehicle() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

