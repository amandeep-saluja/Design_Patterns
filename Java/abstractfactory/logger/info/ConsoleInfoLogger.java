package abstractfactory.logger.info;

public class ConsoleInfoLogger implements InfoLogger {
    @Override
    public void log(String msg) {
        System.out.println("Console Info Logger: " + msg);
    }
}
