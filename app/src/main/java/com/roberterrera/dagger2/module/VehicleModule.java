package com.roberterrera.dagger2.module;

import com.roberterrera.dagger2.model.Motor;
import com.roberterrera.dagger2.model.Vehicle;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Rob on 4/25/16.
 */

@Module
public class VehicleModule {

    /**
     * Vehicle needs Motor to work properly. That is why we need to create two providers:
     * one for Motor (the independent model) and another one for Vehicle (indicating its dependency).
     * The @Singleton annotation indicates that there will be only one instance of the object.
     */

    @Provides @Singleton
    Motor provideMotor(){
        return new Motor();
    }

    @Provides @Singleton
    Vehicle provideVehicle(){
        return new Vehicle(new Motor());
    }
}
