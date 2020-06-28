package com.oopslab.traffic.measurements;

public interface IMeasurement<T> {
    int getValue();

    T getUnit();
}
