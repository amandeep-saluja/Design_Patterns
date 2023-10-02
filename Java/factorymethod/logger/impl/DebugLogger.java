package factorymethod.logger.impl;

import factorymethod.logger.ILogger;

public class DebugLogger implements ILogger {

    @Override
    public void log(String loggingMessage) {
        System.out.println("DEBUG LOG: " + loggingMessage);
    }
}
