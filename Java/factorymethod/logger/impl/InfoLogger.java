package factorymethod.logger.impl;

import factorymethod.logger.ILogger;

public class InfoLogger implements ILogger {

    @Override
    public void log(String loggingMessage) {
        System.out.println("INFO LOG: " + loggingMessage);
    }
}
