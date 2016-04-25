package com.roberterrera.dagger2.modules;

import com.roberterrera.dagger2.classes.NetworkApi;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Rob on 4/25/16.
 */

@Module
public class NetworkApiModule {
    @Provides
    @Singleton
    public NetworkApi getNetwork(){
        return new NetworkApi();
    }
}
