package abstractfactory;

import abstractfactory.factory.AbstractLoggerFactory;
import abstractfactory.factory.DebugLoggerFactory;
import abstractfactory.factory.ErrorLoggerFactory;
import abstractfactory.factory.InfoLoggerFactory;
import abstractfactory.logger.ILogger;

public class Main {
    public static void main(String[] args) {
        AbstractLoggerFactory factory = null;
        ILogger logger = null;

        // Debug

        factory = new DebugLoggerFactory();
        logger = factory.createFactory(LogType.CONSOLE);
        logger.log("Inside main");

        factory = new DebugLoggerFactory();
        logger = factory.createFactory(LogType.FILE);
        logger.log("Inside main");

        // Info

        factory = new InfoLoggerFactory();
        logger = factory.createFactory(LogType.CONSOLE);
        logger.log("Inside main");

        factory = new InfoLoggerFactory();
        logger = factory.createFactory(LogType.FILE);
        logger.log("Inside main");

        // Error

        factory = new ErrorLoggerFactory();
        logger = factory.createFactory(LogType.CONSOLE);
        logger.log("Inside main");

        factory = new ErrorLoggerFactory();
        logger = factory.createFactory(LogType.FILE);
        logger.log("Inside main");
    }
}
