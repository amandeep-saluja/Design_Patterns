package abstractfactory.logger.debug;

public class FileDebugLogger implements DebugLogger {
    @Override
    public void log(String msg) {
        System.out.println("File Debug Logger: " + msg);
    }
}
