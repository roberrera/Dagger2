package com.roberterrera.dagger2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.roberterrera.dagger2.classes.MyApplication;
import com.roberterrera.dagger2.classes.NetworkApi;

import javax.inject.Inject;

public class MainActivity extends Activity {

    @Inject
    NetworkApi networkApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((MyApplication) getApplication()).getComponent().inject(this);

        boolean injected =  networkApi == null ? false : true;
        TextView userAvailable = (TextView) findViewById(R.id.target);
        userAvailable.setText("Dependency injection worked: " + String.valueOf(injected));
    }
}
