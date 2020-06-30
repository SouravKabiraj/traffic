package com.oopslab.traffic.commandInterface;

import com.oopslab.traffic.facadeInterface.TripOption;
import com.oopslab.traffic.facadeInterface.TripGuidFacade;
import com.oopslab.traffic.measurements.velocity.Velocity;
import com.oopslab.traffic.measurements.velocity.VelocityUnit;
import com.oopslab.traffic.weathers.WeatherType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FlatTextCommandInterfaceInterface implements ICommandInterface {

    @Autowired
    TripGuidFacade tripGuidFacade;

    @Override
    public void execute(String command) {
        String[] commandParts = command.split(" ");
        WeatherType weather = WeatherType.valueOf(commandParts[0]);
        int orbitOneTrafficSpeed = Integer.parseInt(commandParts[1]);
        int orbitTwoTrafficSpeed = Integer.parseInt(commandParts[2]);
        TripOption bestTripOption = tripGuidFacade.getTripOption(weather,
                new Velocity(orbitOneTrafficSpeed, VelocityUnit.MegaMilePerHour),
                new Velocity(orbitTwoTrafficSpeed, VelocityUnit.MegaMilePerHour));
        System.out.println(bestTripOption.toString());
    }
}
