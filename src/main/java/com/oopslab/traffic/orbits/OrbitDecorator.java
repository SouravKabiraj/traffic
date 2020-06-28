package com.oopslab.traffic.orbits;

import com.oopslab.traffic.measurements.time.Time;
import com.oopslab.traffic.measurements.time.TimeUnit;
import com.oopslab.traffic.measurements.velocity.Velocity;
import com.oopslab.traffic.vehicles.Vehicle;

public abstract class OrbitDecorator implements IOrbit, ITrackTimeCalculator {
    protected final Orbit orbit;

    public OrbitDecorator(Orbit orbit) {
        this.orbit = orbit;
    }

    abstract boolean canDrive(Vehicle vehicle);

    @Override
    public Time calculateOrbitTripTimeFor(Vehicle vehicle) throws Exception {
        if (!canDrive(vehicle)) {
            throw new Exception();
        } else {
            Velocity maxPossibleSpeed;
            if (vehicle.getTopSpeed().compareTo(orbit.getMaxPossibleSpeed()) < 0) {
                maxPossibleSpeed = vehicle.getTopSpeed();
            } else {
                maxPossibleSpeed = orbit.getMaxPossibleSpeed();
            }
            Time timeToCoverDistance = new Time((orbit.distance.getValue() * 60 / maxPossibleSpeed.getValue()), TimeUnit.Min);
            Time timeToCrossCrater = new Time((vehicle.getTimeToCrossCrater().getValue() * getCratersCount()), TimeUnit.Min);
            return new Time(timeToCoverDistance.getValue() + timeToCrossCrater.getValue(), TimeUnit.Min);
        }
    }

    public String getOrbitName() {
        switch (orbit.getClass().getSimpleName()) {
            case "OrbitOne":
                return "ORBIT1";
            default:
                return "ORBIT2";
        }
    }
}
