package com.oopslab.traffic;

import com.oopslab.traffic.inputHandler.IFileInputHandler;
import com.oopslab.traffic.inputHandler.TextFileInputHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class TrafficApplication {

    public static void main(String[] args) throws IOException {
        ApplicationContext context = SpringApplication.run(TrafficApplication.class, args);
        TripCommand tripCommand = context.getBean(TripCommand.class);
        IFileInputHandler inputHandler = context.getBean(TextFileInputHandler.class);
        tripCommand.execute(inputHandler.getInputCommand(new File(args[0])));
    }
}
