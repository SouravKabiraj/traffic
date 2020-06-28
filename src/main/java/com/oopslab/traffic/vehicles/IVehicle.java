package com.oopslab.traffic.vehicles;

import com.oopslab.traffic.measurements.time.Time;
import com.oopslab.traffic.measurements.velocity.Velocity;

public interface IVehicle {
    Velocity getTopSpeed();

    Time getTimeToCrossCrater();
}
