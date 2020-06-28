package com.oopslab.traffic.orbits;

import com.oopslab.traffic.vehicles.Vehicle;
import com.oopslab.traffic.vehicles.VehicleType;

public class WindyOrbit extends OrbitDecorator {
    public WindyOrbit(Orbit orbit) {
        super(orbit);
    }

    @Override
    boolean canDrive(Vehicle vehicle) {
        return !vehicle.getClass().getSimpleName().equals(VehicleType.Tuktuk.toString());
    }

    @Override
    public int getCratersCount() {
        return orbit.cratersCount;
    }
}
