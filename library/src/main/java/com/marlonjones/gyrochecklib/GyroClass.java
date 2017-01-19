package com.marlonjones.gyrochecklib;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Marlon Jones (@MJonesDev on 1/19/2017.
 github.com/MJonesDev
 */

public class GyroClass extends LinearLayout {
     Context context;
    TextView textX, textY, textZ;
     SensorManager sensorManager;
    Sensor sensor;


    public GyroClass(Context current){
        super(current);
        this.context = current;
        context.getResources().getLayout(R.layout.text);
        inflate(context, R.layout.text, this);
        sensorManager = (SensorManager)context.getSystemService(Context.SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);

        textX = (TextView) findViewById(R.id.TextX);
        textY = (TextView) findViewById(R.id.TextY);
        textZ = (TextView) findViewById(R.id.TextZ);
        sensorManager.registerListener(gyroListener, sensor,
                SensorManager.SENSOR_DELAY_NORMAL);
    }


    public SensorEventListener gyroListener = new SensorEventListener() {

        @Override
        public void onSensorChanged(SensorEvent sensorEvent) {
            float x = sensorEvent.values[0];
            float y = sensorEvent.values[1];
            float z = sensorEvent.values[2];

            textX.setText("X : " + (int)x + " rad/s");
            textY.setText("Y : " + (int)y + " rad/s");
            textZ.setText("Z : " + (int)z + " rad/s");
        }

        @Override
        public void onAccuracyChanged(Sensor sensor, int i) {

        }
    };
}
