package com.marlonjones.gyrochecklib;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.widget.TextView;

/**
 * Created by Marlon Jones (@MJonesDev on 1/19/2017.
 github.com/MJonesDev
 */

public abstract class GyroClass implements SensorEventListener {
    private Context context;
    TextView textX, textY, textZ;
    SensorManager sensorManager;
    Sensor sensor;


    public GyroClass(Context current){
        this.context = current;
        context.getResources().getLayout(R.layout.text);
    }

}
