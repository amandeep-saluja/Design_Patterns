package abstractfactory.factory;

import abstractfactory.LogType;
import abstractfactory.logger.ILogger;
import abstractfactory.logger.info.ConsoleInfoLogger;
import abstractfactory.logger.info.FileInfoLogger;

public class InfoLoggerFactory implements AbstractLoggerFactory {
    @Override
    public ILogger createFactory(LogType type) {
        if (LogType.FILE.toString().equalsIgnoreCase(String.valueOf(type))) {
            return new FileInfoLogger();
        } else {
            return new ConsoleInfoLogger();
        }
    }
}
