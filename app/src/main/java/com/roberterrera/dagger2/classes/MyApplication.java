package com.roberterrera.dagger2.classes;

import android.app.Application;
import android.os.Bundle;

import com.roberterrera.dagger2.components.DiComponent;

/**
 * Created by Rob on 4/25/16.
 */
public class MyApplication extends Application {
    DiComponent component;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate();
        component = DaggerDiComponent.builder().build();
    }

    public DiComponent getComponent() {
        return component;
    }