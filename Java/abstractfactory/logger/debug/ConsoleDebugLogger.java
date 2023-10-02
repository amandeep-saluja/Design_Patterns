package abstractfactory.logger.debug;

public class ConsoleDebugLogger implements DebugLogger {
    @Override
    public void log(String msg) {
        System.out.println("Console Debug Logger: " + msg);
    }
}
