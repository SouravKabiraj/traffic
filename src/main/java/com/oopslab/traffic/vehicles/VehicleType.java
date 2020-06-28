package com.oopslab.traffic.vehicles;

public enum VehicleType {
    Car("Car"),
    Bike("Bike"),
    Tuktuk("Tuktuk");

    private final String value;

    VehicleType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
