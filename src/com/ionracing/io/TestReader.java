package com.ionracing.io;

import com.ionracing.device.Sensor;
import com.ionracing.device.GPSSensor;

/**
 * Created by fabriece on 06.02.2015.
 */
public class TestReader extends ReaderAdapter {

    private static final String testSensorData = "01long:34.2323&lat:65.4545";
    @Override
    public Sensor getSensor() {
        int sensorId = Integer.parseInt(testSensorData.substring(0, 2));
        String rem = testSensorData.substring(2);
        String[] parts = rem.split("&");
        double lon = 0, lat = 0;
        for (String s : parts){
            if (s.startsWith("long")){
                //System.out.println(s.substring(5));
                lon = Double.parseDouble(s.substring(5));
                continue;
            }
            if (s.startsWith("lat")){
                //System.out.println(s.substring(4));
                lat = Double.parseDouble(s.substring(4));
                continue;
            }
        }
        Sensor sensor = new GPSSensor();
        sensor.values.put(GPSSensor.LONGITUDE, lon);
        sensor.values.put(GPSSensor.LATITUDE, lat);
        return sensor;
    }
}
