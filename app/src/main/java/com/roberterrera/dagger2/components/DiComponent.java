package com.roberterrera.dagger2.components;

import com.roberterrera.dagger2.MainActivity;
import com.roberterrera.dagger2.modules.NetworkApiModule;


import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Rob on 4/25/16.
 */

@Singleton
@Component(modules = {NetworkApiModule.class})
public interface DiComponent {
    // Updates the fields in the activities.
    void inject(MainActivity activity);
}
