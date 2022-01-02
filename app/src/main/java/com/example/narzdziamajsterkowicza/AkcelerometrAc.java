package com.example.narzdziamajsterkowicza;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AkcelerometrAc extends AppCompatActivity implements SensorEventListener {

    private static final String TAG = "AkcelerometrAc";
    TextView xValues, yValues, zValues;
    private SensorManager sensorManager;
    Sensor accelerometer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akcelerometr);

        xValues = (TextView) findViewById(R.id.xValues);
        yValues = (TextView) findViewById(R.id.yValues);
        zValues = (TextView) findViewById(R.id.zValues);


        Log.d(TAG, "onCreate: Initializing Sensor Services");
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);

        accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sensorManager.registerListener(AkcelerometrAc.this, accelerometer, SensorManager.SENSOR_DELAY_NORMAL);
        Log.d(TAG, "onCreate: Registered accelerometer listener");
    }
    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        Log.d(TAG, "onSensorChanged: X: " + sensorEvent.values[0] + "Y: " + sensorEvent.values[1] + "Z: " + sensorEvent.values[2]);

        xValues.setText("X: " + sensorEvent.values[0]);
        yValues.setText("Y: " + sensorEvent.values[1]);
        zValues.setText("Z: " + sensorEvent.values[2]);

    }


}