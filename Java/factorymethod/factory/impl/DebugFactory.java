package factorymethod.factory.impl;

import factorymethod.factory.ILoggerFactory;
import factorymethod.logger.impl.DebugLogger;
import factorymethod.logger.ILogger;

public class DebugFactory implements ILoggerFactory {
    @Override
    public ILogger createLogger() {
        return new DebugLogger();
    }
}
