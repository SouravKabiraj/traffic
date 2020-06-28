package com.oopslab.traffic.orbits;

import com.oopslab.traffic.vehicles.Vehicle;
import com.oopslab.traffic.vehicles.VehicleType;

public class RainyOrbit extends OrbitDecorator {
    public RainyOrbit(Orbit orbit) {
        super(orbit);
    }

    @Override
    boolean canDrive(Vehicle vehicle) {
        return !vehicle.getClass().getSimpleName().equals(VehicleType.Bike.toString());
    }

    @Override
    public int getCratersCount() {
        return (int) (orbit.cratersCount * 1.2);
    }
}
