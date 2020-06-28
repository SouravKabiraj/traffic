package com.oopslab.traffic.vehicles;

import com.oopslab.traffic.measurements.time.Time;
import com.oopslab.traffic.measurements.time.TimeUnit;
import com.oopslab.traffic.measurements.velocity.Velocity;
import com.oopslab.traffic.measurements.velocity.VelocityUnit;

public class Tuktuk extends Vehicle {
    public Tuktuk() {
        topSpeed = new Velocity(12, VelocityUnit.MegaMilePerHour);
        crossCraterTime = new Time(1, TimeUnit.Min);
    }
}
