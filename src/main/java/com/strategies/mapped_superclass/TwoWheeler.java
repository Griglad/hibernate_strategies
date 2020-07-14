package com.strategies.mapped_superclass;

import javax.persistence.Entity;

@Entity
public class TwoWheeler extends Vehicle {

    private String steeringHandle;

    public TwoWheeler(){

    }

    public String getSteeringHandle(){
        return steeringHandle;
    }
    public void setSteeringHandle(String steeringHandle){
        this.steeringHandle = steeringHandle;
    }
}
