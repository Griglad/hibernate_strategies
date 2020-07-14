package com.strategies.single_table;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Bike")
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
