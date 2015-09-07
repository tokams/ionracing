package com.ionracing.io;

import com.ionracing.device.Sensor;

/**
 * Created by fabriece on 06.02.2015.
 */
public class ReaderAdapter implements Reader {
    @Override
    public Sensor getSensor() {
        return null;
    }

    @Override
    public Sensor getSensor(String data) {
        return null;
    }

    @Override
    public Sensor getSensor(byte[] data) {
        return null;
    }
}
