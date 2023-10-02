package abstractfactory.factory;

import abstractfactory.LogType;
import abstractfactory.logger.ILogger;
import abstractfactory.logger.debug.ConsoleDebugLogger;
import abstractfactory.logger.debug.FileDebugLogger;

public class DebugLoggerFactory implements AbstractLoggerFactory {
    @Override
    public ILogger createFactory(LogType type) {
        if (LogType.FILE.toString().equalsIgnoreCase(String.valueOf(type))) {
            return new FileDebugLogger();
        } else {
            return new ConsoleDebugLogger();
        }
    }
}
