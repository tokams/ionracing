package com.ionracing.device;

import java.util.HashMap;

/**
 * Created by fabriece on 06.02.2015.
 */
public class GPSSensor extends Sensor {
    public static final String LONGITUDE = "longitude";
    public static final String LATITUDE = "latitude";
    public GPSSensor(){
        id = 0;
        type = SENSOR_TYPE.GPS;
        values = new HashMap<String, Number>(2);
        values.put(LONGITUDE, Integer.MIN_VALUE);
        values.put(LATITUDE, Integer.MIN_VALUE);

    }


}
