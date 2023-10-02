package factorymethod.factory.impl;

import factorymethod.factory.ILoggerFactory;
import factorymethod.logger.impl.ErrorLogger;
import factorymethod.logger.ILogger;

public class ErrorFactory implements ILoggerFactory {
    @Override
    public ILogger createLogger() {
        return new ErrorLogger();
    }
}
