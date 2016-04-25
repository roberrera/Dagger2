package com.roberterrera.dagger2;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.roberterrera.dagger2.model.DaggerVehicleComponent;
import com.roberterrera.dagger2.model.Vehicle;
import com.roberterrera.dagger2.model.VehicleComponent;
import com.roberterrera.dagger2.module.VehicleModule;

public class MainActivity extends AppCompatActivity {

    Vehicle vehicle;

    /**
     * See http://code.tutsplus.com/tutorials/dependency-injection-with-dagger-2-on-android--cms-23345
     * for tutorial.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VehicleComponent component = DaggerVehicleComponent.builder()
                .vehicleModule(new VehicleModule()).build();

        vehicle = component.provideVehicle();

        Toast.makeText(this, String.valueOf(vehicle.getSpeed()), Toast.LENGTH_SHORT).show();
    }
}
