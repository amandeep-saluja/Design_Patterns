package factorymethod.factory;

import factorymethod.logger.ILogger;

public interface ILoggerFactory {
    ILogger createLogger();
}
