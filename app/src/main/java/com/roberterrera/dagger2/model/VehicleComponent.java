package com.roberterrera.dagger2.model;

import com.roberterrera.dagger2.module.VehicleModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Rob on 4/25/16.
 */

/**
 * The connection between the provider of dependencies, @Module, and the classes requesting them
 * through @Inject is made using @Component, which is an interface.
 */

@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {

    Vehicle provideVehicle();
}
