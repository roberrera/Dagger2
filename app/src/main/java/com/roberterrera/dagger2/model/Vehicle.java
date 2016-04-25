package com.roberterrera.dagger2.model;

import javax.inject.Inject;

/**
 * Created by Rob on 4/25/16.
 */
public class Vehicle {

    private Motor motor;

    /**
     *
     * Now that we have the providers for our different models, we need to request them.
     * Just as Vehicle needs Motor, we have to add the @Inject annotation in the Vehicle constructor.
     */

    @Inject
    public Vehicle(Motor motor){
        this.motor = motor;
    }

    /**
     *
     * The @Inject annotation can be used to request dependencies in the constructor, fields, or methods.
     * In this case, we're keeping the injection in the constructor.
     */

    public void increaseSpeed(int value){
        motor.accelerate(value);
    }

    public void stop(){
        motor.brake();
    }

    public int getSpeed(){
        return motor.getRpm();
    }
}
