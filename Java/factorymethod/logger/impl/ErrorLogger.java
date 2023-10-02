package factorymethod.logger.impl;

import factorymethod.logger.ILogger;

public class ErrorLogger implements ILogger {
    @Override
    public void log(String loggingMessage) {
        System.out.println("ERROR LOG: " + loggingMessage);
    }
}
