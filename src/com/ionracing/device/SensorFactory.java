package com.ionracing.device;

/**
 * Created by fabriece on 06.02.2015.
 */
public class SensorFactory {
    public Sensor getSensor(Sensor.SENSOR_TYPE TYPE){
        switch (TYPE){
            case GPS:
                return new GPSSensor();
            default:
                return null;
        }
    }
}
