package com.oopslab.traffic.measurements.length;

import com.oopslab.traffic.measurements.IMeasurement;

public class Length implements IMeasurement<LengthUnit> {
    private final int value;
    private final LengthUnit unit;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return value == length.value &&
                unit == length.unit;
    }

    public Length(int value, LengthUnit lengthUnit) {
        this.value = value;
        this.unit = lengthUnit;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public LengthUnit getUnit() {
        return unit;
    }
}
