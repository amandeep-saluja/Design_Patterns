package simplefactory.logger.impl;

import simplefactory.logger.ILogger;

public class ErrorLogger implements ILogger {
    @Override
    public void log(String logMsg) {
        System.out.println("Error Log: " + logMsg);
    }
}
