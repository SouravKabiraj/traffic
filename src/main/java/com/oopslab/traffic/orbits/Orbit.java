package com.oopslab.traffic.orbits;

import com.oopslab.traffic.measurements.length.Length;
import com.oopslab.traffic.measurements.velocity.Velocity;

public abstract class Orbit implements IOrbit {
    protected Length distance;
    protected int cratersCount;
    protected Velocity maxPossibleSpeed;

    public Velocity getMaxPossibleSpeed() {
        return maxPossibleSpeed;
    }

    @Override
    public int getCratersCount() {
        return cratersCount;
    }
}
