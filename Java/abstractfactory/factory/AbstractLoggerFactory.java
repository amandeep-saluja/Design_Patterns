package abstractfactory.factory;

import abstractfactory.LogType;
import abstractfactory.logger.ILogger;

public interface AbstractLoggerFactory {
    ILogger createFactory(LogType type);
}
