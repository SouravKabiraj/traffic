package com.oopslab.traffic.vehicles;

import com.oopslab.traffic.measurements.time.Time;
import com.oopslab.traffic.measurements.time.TimeUnit;
import com.oopslab.traffic.measurements.velocity.Velocity;
import com.oopslab.traffic.measurements.velocity.VelocityUnit;

public class Car extends Vehicle {
    public Car() {
        topSpeed = new Velocity(20, VelocityUnit.MegaMilePerHour);
        crossCraterTime = new Time(3, TimeUnit.Min);
    }
}