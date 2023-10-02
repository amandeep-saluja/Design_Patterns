package simplefactory.logger.impl;

import simplefactory.logger.ILogger;

public class InfoLogger implements ILogger {
    @Override
    public void log(String logMsg) {
        System.out.println("Info Log: " + logMsg);
    }
}
