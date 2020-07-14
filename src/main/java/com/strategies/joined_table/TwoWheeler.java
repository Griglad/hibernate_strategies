package com.strategies.joined_table;

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
