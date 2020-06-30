package com.oopslab.traffic.inputHandler;

import org.springframework.stereotype.Component;

import java.io.*;

@Component
public class TextFileInputHandler implements IFileInputHandler {
    public String getInputCommand(File file) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        return bufferedReader.readLine();
    }
}
