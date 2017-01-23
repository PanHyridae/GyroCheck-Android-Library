package com.marlonjones.gyrochecklib;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by Marlon Jones (@MJonesDev) on 1/19/2017.
 * github.com/MJonesDev
 */

public class GyroView extends FrameLayout implements SensorEventListener {

    Context context;
    TextView textX, textY, textZ;
    SensorManager sensorManager;
    Sensor sensor;

    public GyroView(Context context) {
        super(context);
        this.context = context;

        setFitsSystemWindows(true);

        View v = LayoutInflater.from(getContext()).inflate(R.layout.text, this, false);
        addView(v);

        sensorManager = (SensorManager) context.getSystemService(Context.SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);

        textX = (TextView) findViewById(R.id.TextX);
        textY = (TextView) findViewById(R.id.TextY);
        textZ = (TextView) findViewById(R.id.TextZ);

        sensorManager.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        float x = event.values[0];
        float y = event.values[1];
        float z = event.values[2];

        textX.setText("X : " + (int) x + " rad/s");
        textY.setText("Y : " + (int) y + " rad/s");
        textZ.setText("Z : " + (int) z + " rad/s");
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
