package simplefactory;

import simplefactory.logger.ILogger;

public class Main {
    public static void main(String[] args) {

        ILogger debugLogger = LoggerFactory.createLogger(LogLevel.DEBUG);
        ILogger errorLogger = LoggerFactory.createLogger(LogLevel.ERROR);
        ILogger infoLogger = LoggerFactory.createLogger(LogLevel.INFO);

        debugLogger.log("Inside main");
        errorLogger.log("Inside main");
        infoLogger.log("Inside main");

    }
}
