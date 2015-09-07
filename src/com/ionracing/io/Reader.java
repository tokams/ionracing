package com.ionracing.io;

import com.ionracing.device.Sensor;

/**
 * Classes that implement this interface can read sensor data from a variable sources and return sensor objects.
 * Created by fabriece on 06.02.2015.
 */
public interface Reader {

    public Sensor getSensor();
    public Sensor getSensor(String data);
    public Sensor getSensor(byte[] data);
}
