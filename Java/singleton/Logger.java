package singleton;

import java.util.concurrent.locks.ReentrantLock;

public class Logger {
    private Logger() {}

    private static ReentrantLock lock = new ReentrantLock();

    private static Logger instance;

    public static Logger getInstance() {
        if(instance == null) {
            //apply lock
            lock.lock();
            if (instance == null) {
                instance = new Logger();
            }
            //release lock
            lock.unlock();
        }
        return instance;
    }
}
