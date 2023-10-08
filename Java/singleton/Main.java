package singleton;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        System.out.println(logger.hashCode());

        Logger newLogger = Logger.getInstance();

        System.out.println(newLogger.hashCode());

        System.out.println(logger == newLogger);
    }
}
