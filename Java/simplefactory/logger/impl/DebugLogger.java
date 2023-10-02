package simplefactory.logger.impl;

import simplefactory.logger.ILogger;

public class DebugLogger implements ILogger {
    @Override
    public void log(String logMsg) {
        System.out.println("Debug Log: " + logMsg);
    }
}
