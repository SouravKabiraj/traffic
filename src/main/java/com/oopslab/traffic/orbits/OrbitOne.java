package com.oopslab.traffic.orbits;

import com.oopslab.traffic.measurements.length.Length;
import com.oopslab.traffic.measurements.length.LengthUnit;
import com.oopslab.traffic.measurements.velocity.Velocity;

public class OrbitOne extends Orbit {

    public OrbitOne(Velocity trafficSpeed) {
        cratersCount = 20;
        distance = new Length(18, LengthUnit.MegaMile);
        maxPossibleSpeed = trafficSpeed;
    }
}
