package com.marlonjones.gyrocheck;

import android.os.Bundle;
import android.support.v4.*;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.marlonjones.gyrochecklib.GyroCheck;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /**
         * GyroCheck.addTo(this); - Adds the GyroCheck library to your current view.
         * BuildConfig.DEBUG - If the app is in DEBUG mode, it will show the library.
         **/

        if (BuildConfig.DEBUG) {
            GyroCheck.addTo(this);
        }
        else {
            GyroCheck.addTo(this);
            /**
             * Without using BuildConfig.DEBUG, the library will be shown
             * in the view you put it in, no matter the build type.
             **/
        }
    }
}
