package com.oopslab.traffic;

import com.oopslab.traffic.measurements.time.Time;
import com.oopslab.traffic.measurements.time.TimeUnit;
import com.oopslab.traffic.measurements.velocity.Velocity;
import com.oopslab.traffic.measurements.velocity.VelocityUnit;
import com.oopslab.traffic.orbits.OrbitOne;
import com.oopslab.traffic.orbits.RainyOrbit;
import com.oopslab.traffic.vehicles.Car;
import com.oopslab.traffic.weathers.WeatherType;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.*;

@SpringBootTest
class TripCommandTest {

    @Mock
    TripGuidFacade tripGuidFacade;

    @InjectMocks
    TripCommand tripCommand;


    @Test
    void shouldExecuteRAINY_40_25() {
        RainyOrbit rainyOrbit1 = new RainyOrbit(new OrbitOne(new Velocity(10, VelocityUnit.MegaMilePerHour)));
        TripOption tripOption = new TripOption(new Car(), rainyOrbit1, new Time(10, TimeUnit.Hour));

        when(tripGuidFacade.getBestTripOption(eq(WeatherType.RAINY), eq(new Velocity(40, VelocityUnit.MegaMilePerHour)), eq(new Velocity(25, VelocityUnit.MegaMilePerHour)))).thenReturn(tripOption);

        tripCommand.execute("RAINY 40 25");

        verify(tripGuidFacade, times(1)).getBestTripOption(eq(WeatherType.RAINY), eq(new Velocity(40, VelocityUnit.MegaMilePerHour)), eq(new Velocity(25, VelocityUnit.MegaMilePerHour)));
    }

    @Test
    void shouldExecuteSUNNY_12_10() {
        RainyOrbit rainyOrbit1 = new RainyOrbit(new OrbitOne(new Velocity(10, VelocityUnit.MegaMilePerHour)));
        TripOption tripOption = new TripOption(new Car(), rainyOrbit1, new Time(10, TimeUnit.Hour));

        when(tripGuidFacade.getBestTripOption(eq(WeatherType.SUNNY), eq(new Velocity(12, VelocityUnit.MegaMilePerHour)), eq(new Velocity(10, VelocityUnit.MegaMilePerHour)))).thenReturn(tripOption);

        tripCommand.execute("SUNNY 12 10");

        verify(tripGuidFacade, times(1)).getBestTripOption(eq(WeatherType.SUNNY), eq(new Velocity(12, VelocityUnit.MegaMilePerHour)), eq(new Velocity(10, VelocityUnit.MegaMilePerHour)));
    }

    @Test
    void shouldExecuteWINDY_14_20() {
        RainyOrbit rainyOrbit1 = new RainyOrbit(new OrbitOne(new Velocity(10, VelocityUnit.MegaMilePerHour)));
        TripOption tripOption = new TripOption(new Car(), rainyOrbit1, new Time(10, TimeUnit.Hour));

        when(tripGuidFacade.getBestTripOption(eq(WeatherType.WINDY), eq(new Velocity(14, VelocityUnit.MegaMilePerHour)), eq(new Velocity(20, VelocityUnit.MegaMilePerHour)))).thenReturn(tripOption);

        tripCommand.execute("WINDY 14 20");

        verify(tripGuidFacade, times(1)).getBestTripOption(eq(WeatherType.WINDY), eq(new Velocity(14, VelocityUnit.MegaMilePerHour)), eq(new Velocity(20, VelocityUnit.MegaMilePerHour)));
    }

    @Test
    void shouldExecuteRAINY_8_15() {
        RainyOrbit rainyOrbit1 = new RainyOrbit(new OrbitOne(new Velocity(10, VelocityUnit.MegaMilePerHour)));
        TripOption tripOption = new TripOption(new Car(), rainyOrbit1, new Time(10, TimeUnit.Hour));

        when(tripGuidFacade.getBestTripOption(eq(WeatherType.RAINY), eq(new Velocity(8, VelocityUnit.MegaMilePerHour)), eq(new Velocity(15, VelocityUnit.MegaMilePerHour)))).thenReturn(tripOption);

        tripCommand.execute("RAINY 8 15");

        verify(tripGuidFacade, times(1)).getBestTripOption(eq(WeatherType.RAINY), eq(new Velocity(8, VelocityUnit.MegaMilePerHour)), eq(new Velocity(15, VelocityUnit.MegaMilePerHour)));
    }
}