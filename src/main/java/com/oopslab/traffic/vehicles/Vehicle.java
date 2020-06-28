package com.oopslab.traffic.vehicles;

import com.oopslab.traffic.measurements.time.Time;
import com.oopslab.traffic.measurements.velocity.Velocity;

public abstract class Vehicle implements IVehicle {
    Velocity topSpeed;
    Time crossCraterTime;

    @Override
    public Velocity getTopSpeed() {
        return topSpeed;
    }

    @Override
    public Time getTimeToCrossCrater() {
        return crossCraterTime;
    }
}
