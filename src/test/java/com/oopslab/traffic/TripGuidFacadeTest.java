package com.oopslab.traffic;

import com.oopslab.traffic.measurements.velocity.Velocity;
import com.oopslab.traffic.measurements.velocity.VelocityUnit;
import com.oopslab.traffic.weathers.WeatherType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static junit.framework.TestCase.assertEquals;


@SpringBootTest
public class TripGuidFacadeTest {

    @Autowired
    private TripGuidFacade tripGuidFacade;

    @Test
    public void shouldChooseCarAndOrbitOne() {
        TripOption bestTripOption = tripGuidFacade.getBestTripOption(WeatherType.RAINY, new Velocity(40, VelocityUnit.MegaMilePerHour), new Velocity(25, VelocityUnit.MegaMilePerHour));

        assertEquals("CAR ORBIT2", bestTripOption.toString());
    }

    @Test
    public void shouldChooseTuktukAndOrbitOne() {
        TripOption bestTripOption = tripGuidFacade.getBestTripOption(WeatherType.SUNNY, new Velocity(12, VelocityUnit.MegaMilePerHour), new Velocity(10, VelocityUnit.MegaMilePerHour));

        assertEquals("TUKTUK ORBIT1", bestTripOption.toString());
    }

    @Test
    public void shouldChooseCarAndOrbitTwo() {
        TripOption bestTripOption = tripGuidFacade.getBestTripOption(WeatherType.WINDY, new Velocity(14, VelocityUnit.MegaMilePerHour), new Velocity(20, VelocityUnit.MegaMilePerHour));

        assertEquals("CAR ORBIT2", bestTripOption.toString());
    }

    @Test
    public void shouldChooseTuktukAndOrbitTwo() {
        TripOption bestTripOption = tripGuidFacade.getBestTripOption(WeatherType.RAINY, new Velocity(8, VelocityUnit.MegaMilePerHour), new Velocity(15, VelocityUnit.MegaMilePerHour));

        assertEquals("TUKTUK ORBIT2", bestTripOption.toString());
    }
}