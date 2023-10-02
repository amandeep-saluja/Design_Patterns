package simplefactory;

import simplefactory.logger.impl.DebugLogger;
import simplefactory.logger.impl.ErrorLogger;
import simplefactory.logger.ILogger;
import simplefactory.logger.impl.InfoLogger;

public class LoggerFactory {
    public static ILogger createLogger(LogLevel logLevel) {
        switch(logLevel) {
            case INFO: return new InfoLogger();
            case DEBUG: return new DebugLogger();
            case ERROR: return new ErrorLogger();
        }
        return null;
    }
}
