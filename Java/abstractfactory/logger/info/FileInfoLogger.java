package abstractfactory.logger.info;

public class FileInfoLogger implements InfoLogger {

    @Override
    public void log(String msg) {
        System.out.println("File Info Logger: " + msg);
    }
}
