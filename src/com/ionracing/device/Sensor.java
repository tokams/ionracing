package com.ionracing.device;

import java.util.HashMap;

/**
 * Created by fabriece on 06.02.2015.
 */
public abstract class Sensor {
    public static enum SENSOR_TYPE{GPS, GYRO, ACCELEROMETER, POS_STREERING_WHEEL, ROT_FWR, ROT_FWL, ROT_RWR, ROT_RWL};
    public int id = -1;
    public long time = -1;
    public SENSOR_TYPE type = null;
    public HashMap<String, Number> values = null;

    @Override
    public String toString() {
        return "Sensor{" +
                "id=" + id +
                ", time=" + time +
                ", type=" + type +
                ", values=" + values +
                '}';
    }
}
