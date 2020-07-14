package com.strategies.mapped_superclass;

import javax.persistence.Entity;

@Entity
public class FourWheeler extends Vehicle {

    private String steeringWheel;


    public FourWheeler(){

    }
    public String getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(String steeringWheel) {
        this.steeringWheel = steeringWheel;
    }
}
