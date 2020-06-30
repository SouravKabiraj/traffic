package com.oopslab.traffic.inputHandler;

import java.io.File;
import java.io.IOException;

public interface IFileInputHandler {
    public String getInputCommand(File file) throws IOException;
}
