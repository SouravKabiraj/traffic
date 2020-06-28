package com.oopslab.traffic.weathers;

public enum WeatherType {
    SUNNY("SUNNY"),
    RAINY("RAINY"),
    WINDY("WINDY");

    private final String value;

    WeatherType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
