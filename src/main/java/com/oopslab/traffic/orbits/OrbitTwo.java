package com.oopslab.traffic.orbits;

import com.oopslab.traffic.measurements.length.Length;
import com.oopslab.traffic.measurements.length.LengthUnit;
import com.oopslab.traffic.measurements.velocity.Velocity;

public class OrbitTwo extends Orbit {
    public OrbitTwo(Velocity trafficSpeed) {
        distance = new Length(20, LengthUnit.MegaMile);
        cratersCount = 10;
        maxPossibleSpeed = trafficSpeed;
    }
}
