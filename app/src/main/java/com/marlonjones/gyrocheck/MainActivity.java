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

        /**BuildConfig.DEBUG - If the app is in DEBUG mode, it will show the library**/

        if (BuildConfig.DEBUG) {
            GyroCheck.addTo(this);
        }
        else {
            GyroCheck.addTo(this);
            /** This is the standard use of the Library. This is
             just added in this case so the sample can show it in both debug and
             standard modes. **/
        }
    }
}
