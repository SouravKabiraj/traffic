package com.oopslab.traffic;

import com.oopslab.traffic.commandInterface.FlatTextCommandInterfaceInterface;
import com.oopslab.traffic.commandInterface.ICommandInterface;
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
        ICommandInterface flatTextCommandInterface = context.getBean(FlatTextCommandInterfaceInterface.class);
        IFileInputHandler inputHandler = context.getBean(TextFileInputHandler.class);
        flatTextCommandInterface.execute(inputHandler.getInputCommand(new File(args[0])));
    }
}
