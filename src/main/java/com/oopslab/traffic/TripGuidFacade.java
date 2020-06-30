package com.oopslab.traffic;

import com.oopslab.traffic.measurements.time.Time;
import com.oopslab.traffic.measurements.velocity.Velocity;
import com.oopslab.traffic.orbits.*;
import com.oopslab.traffic.vehicles.Bike;
import com.oopslab.traffic.vehicles.Car;
import com.oopslab.traffic.vehicles.Tuktuk;
import com.oopslab.traffic.vehicles.Vehicle;
import com.oopslab.traffic.weathers.WeatherType;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

@Component
public class TripGuidFacade {
    public TripOption getBestTripOption(WeatherType weatherType, Velocity orbitOneTrafficSpeed, Velocity orbitTwoTrafficSpeed) {
        ArrayList<OrbitDecorator> orbitDecorators = new ArrayList<>();
        orbitDecorators.add(getOrbit(weatherType, new OrbitOne(orbitOneTrafficSpeed)));
        orbitDecorators.add(getOrbit(weatherType, new OrbitTwo(orbitTwoTrafficSpeed)));
        TreeSet<TripOption> tripPossibilities = getAllTripPossibilities(getVehicles(), orbitDecorators);
        return tripPossibilities.iterator().next();
    }

    private List<Vehicle> getVehicles() {
        ArrayList<Vehicle> list = new ArrayList<>();
        list.add(new Car());
        list.add(new Bike());
        list.add(new Tuktuk());
        return list;
    }

    private TreeSet<TripOption> getAllTripPossibilities(List<Vehicle> vehicles, List<OrbitDecorator> orbitDecorators) {
        TreeSet<TripOption> tripOptions = new TreeSet<>();
        orbitDecorators.forEach(orbit -> {
            vehicles.forEach(vehicle -> {
                try {
                    Time time = orbit.calculateOrbitTripTimeFor(vehicle);
                    tripOptions.add(new TripOption(vehicle, orbit, time));
                } catch (Exception e) {
                    // Consuming Wrong Orbit Vehicle combination.
                }
            });
        });
        return tripOptions;
    }

    private OrbitDecorator getOrbit(WeatherType weatherType, Orbit orbit) {
        switch (weatherType) {
            case RAINY:
                return new RainyOrbit(orbit);
            case WINDY:
                return new WindyOrbit(orbit);
            default:
                return new SunnyOrbit(orbit);
        }
    }
}
