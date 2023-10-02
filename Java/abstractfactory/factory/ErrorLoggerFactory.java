package abstractfactory.factory;

import abstractfactory.LogType;
import abstractfactory.logger.ILogger;
import abstractfactory.logger.error.ConsoleErrorLogger;
import abstractfactory.logger.error.FileErrorLogger;

public class ErrorLoggerFactory implements AbstractLoggerFactory {
    @Override
    public ILogger createFactory(LogType type) {
        if (LogType.FILE.toString().equalsIgnoreCase(String.valueOf(type))) {
            return new FileErrorLogger();
        } else {
            return new ConsoleErrorLogger();
        }
    }
}
