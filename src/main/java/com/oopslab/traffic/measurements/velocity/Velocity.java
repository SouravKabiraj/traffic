package com.oopslab.traffic.measurements.velocity;

import com.oopslab.traffic.measurements.IMeasurement;

public class Velocity implements IMeasurement<VelocityUnit>, Comparable<Velocity> {
    private int value;
    private VelocityUnit unit;

    public Velocity(int value, VelocityUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Velocity velocity = (Velocity) o;
        return value == velocity.value &&
                unit == velocity.unit;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public VelocityUnit getUnit() {
        return unit;
    }

    @Override
    public int compareTo(Velocity velocity) {
        return value - velocity.value;
    }
}
