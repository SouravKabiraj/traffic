package com.oopslab.traffic.orbits;

import com.oopslab.traffic.vehicles.Vehicle;

public class SunnyOrbit extends OrbitDecorator {
    public SunnyOrbit(Orbit orbit) {
        super(orbit);
    }

    @Override
    boolean canDrive(Vehicle vehicle) {
        return true;
    }

    @Override
    public int getCratersCount() {
        return (int) (orbit.cratersCount * .9);
    }

}
