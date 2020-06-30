package com.oopslab.traffic.facadeInterface;

import com.oopslab.traffic.measurements.time.Time;
import com.oopslab.traffic.orbits.OrbitDecorator;
import com.oopslab.traffic.vehicles.Vehicle;

public class TripOption implements Comparable<TripOption> {
    private Vehicle vehicle;
    private OrbitDecorator orbit;
    private Time tripCompletionTime;

    public TripOption(Vehicle vehicle, OrbitDecorator orbit, Time tripCompletionTime) {
        this.vehicle = vehicle;
        this.orbit = orbit;
        this.tripCompletionTime = tripCompletionTime;
    }

    @Override
    public String toString() {
        return vehicle.getClass().getSimpleName().toUpperCase() + " " + orbit.getOrbitName();
    }

    @Override
    public int compareTo(TripOption tripOption) {
        return tripCompletionTime.compareTo(tripOption.tripCompletionTime);
    }
}
