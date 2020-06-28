package com.oopslab.traffic.measurements.time;

import com.oopslab.traffic.measurements.IConverter;

public class HourToMinTimeConverter implements IConverter<Time> {
    @Override
    public Time convert(Time time) {
        return new Time(time.getValue() * 60, TimeUnit.Min);
    }
}
