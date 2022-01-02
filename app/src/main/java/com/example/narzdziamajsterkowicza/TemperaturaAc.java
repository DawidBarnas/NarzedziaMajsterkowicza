package com.example.narzdziamajsterkowicza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import java.text.BreakIterator;

public class TemperaturaAc extends AppCompatActivity implements SensorEventListener {
    private TextView textView3;
    private SensorManager sensorManager;
    private Sensor tempSensor;
    private Boolean isTemperatureSensoreAvailable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);

        textView3 = findViewById(R.id.textView3);
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);

        if(sensorManager.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE)!=null)
        {
            tempSensor = sensorManager.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE);
            isTemperatureSensoreAvailable = true;
        }else{
            textView3.setText("No sensor.");
            isTemperatureSensoreAvailable = false;
        }
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
    textView3.setText(sensorEvent.values[0]+" °C");

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }


    @Override
    protected void onResume() {
        super.onResume();
        if(isTemperatureSensoreAvailable){
            sensorManager.registerListener(this, tempSensor, SensorManager.SENSOR_DELAY_NORMAL);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if(isTemperatureSensoreAvailable){
            sensorManager.unregisterListener(this);
        }
    }
}