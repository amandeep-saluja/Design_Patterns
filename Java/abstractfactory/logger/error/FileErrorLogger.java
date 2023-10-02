package abstractfactory.logger.error;

public class FileErrorLogger implements ErrorLogger {
    @Override
    public void log(String msg) {
        System.out.println("File Error Logger: " + msg);
    }
}
