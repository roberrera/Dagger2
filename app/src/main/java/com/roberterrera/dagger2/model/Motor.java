package com.roberterrera.dagger2.model;

/**
 * Created by Rob on 4/25/16.
 */

/*
Motor is the independent class and Vehicle is the dependent class.
 */
public class Motor {

    private int rpm;

    public Motor(){
        this.rpm = 0;
    }

    public int getRpm(){
        return rpm;
    }

    public void accelerate(int value){
        rpm = rpm + value;
    }

    public void brake(){
        rpm = 0;
    }
}
