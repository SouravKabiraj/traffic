package com.oopslab.traffic.orbits;

import com.oopslab.traffic.measurements.time.Time;
import com.oopslab.traffic.vehicles.Vehicle;

public interface ITrackTimeCalculator {
    Time calculateTripCompletionTimeBy(Vehicle vehicle) throws Exception;
}
