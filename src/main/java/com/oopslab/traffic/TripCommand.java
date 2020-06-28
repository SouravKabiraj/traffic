package com.oopslab.traffic;

import com.oopslab.traffic.measurements.velocity.Velocity;
import com.oopslab.traffic.measurements.velocity.VelocityUnit;
import com.oopslab.traffic.weathers.WeatherType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TripCommand implements ICommand {

    @Autowired
    TripGuidFacade tripGuidFacade;

    @Override
    public void execute(String command) {
        String[] commandParts = command.split(" ");
        WeatherType weather = WeatherType.valueOf(commandParts[0]);
        int orbitOneTrafficSpeed = Integer.parseInt(commandParts[1]);
        int orbitTwoTrafficSpeed = Integer.parseInt(commandParts[2]);
        TripOption bestTripOption = tripGuidFacade.getBestTripOption(weather,
                new Velocity(orbitOneTrafficSpeed, VelocityUnit.MegaMilePerHour),
                new Velocity(orbitTwoTrafficSpeed, VelocityUnit.MegaMilePerHour));
        System.out.println(bestTripOption.toString());
    }
}
