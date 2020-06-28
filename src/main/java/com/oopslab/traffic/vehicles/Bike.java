package com.oopslab.traffic.vehicles;

import com.oopslab.traffic.measurements.time.Time;
import com.oopslab.traffic.measurements.time.TimeUnit;
import com.oopslab.traffic.measurements.velocity.Velocity;
import com.oopslab.traffic.measurements.velocity.VelocityUnit;

public class Bike extends Vehicle {
    public Bike() {
        topSpeed = new Velocity(10, VelocityUnit.MegaMilePerHour);
        crossCraterTime = new Time(2, TimeUnit.Min);
    }
}
