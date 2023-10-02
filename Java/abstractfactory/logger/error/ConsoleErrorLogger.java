package abstractfactory.logger.error;

public class ConsoleErrorLogger implements ErrorLogger {
    @Override
    public void log(String msg) {
        System.out.println("Console Error Logger: " + msg);
    }
}
