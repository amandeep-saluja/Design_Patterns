package factorymethod;

import factorymethod.factory.impl.DebugFactory;
import factorymethod.factory.impl.ErrorFactory;
import factorymethod.factory.ILoggerFactory;
import factorymethod.factory.impl.InfoFactory;
import factorymethod.logger.ILogger;

public class Main {
    public static void main(String[] args) {
        ILoggerFactory debugFactory = new DebugFactory();
        ILogger debugLogger = debugFactory.createLogger();

        ILoggerFactory errorFactory = new ErrorFactory();
        ILogger errorLogger = errorFactory.createLogger();

        ILoggerFactory infoFactory = new InfoFactory();
        ILogger infoLogger = infoFactory.createLogger();

        debugLogger.log("Inside main");
        errorLogger.log("Inside main");
        infoLogger.log("Inside main");
    }
}
