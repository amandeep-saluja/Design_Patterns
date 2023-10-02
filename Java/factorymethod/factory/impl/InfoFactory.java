package factorymethod.factory.impl;

import factorymethod.factory.ILoggerFactory;
import factorymethod.logger.ILogger;
import factorymethod.logger.impl.InfoLogger;

public class InfoFactory implements ILoggerFactory {
    @Override
    public ILogger createLogger() {
        return new InfoLogger();
    }
}
