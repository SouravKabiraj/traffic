package com.oopslab.traffic.measurements.time;

import com.oopslab.traffic.measurements.IMeasurement;

public class Time implements Comparable<Time>, IMeasurement {
    private final int value;
    private final TimeUnit unit;

    public int getValue() {
        return value;
    }

    public TimeUnit getUnit() {
        return unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return value == time.value &&
                unit == time.unit;
    }

    public Time(int value, TimeUnit timeUnit) {
        this.value = value;
        this.unit = timeUnit;
    }

    @Override
    public int compareTo(Time time) {
        if (this.equals(time)) {
            return 0;
        } else {
            int time1;
            int time2;
            if (unit == TimeUnit.Hour) {
                time1 = value * 60;
            } else {
                time1 = value;
            }
            if (time.unit == TimeUnit.Hour) {
                time2 = time.value * 60;
            } else {
                time2 = time.value;
            }
            return time1 - time2;
        }
    }
}
