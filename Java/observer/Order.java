package observer;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String id;
    private String dish;
    private String status;
    private List<Observer> observers;

    public Order(String id, String dish) {
        this.id = id;
        this.dish = dish;
        this.observers = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        this.observers.remove(observer);
    }

    private void notifyObservers(String details) {
        observers.forEach(observer -> observer.update(this));
    }

    public void setStatus(String status) {
        this.status = status;
        this.notifyObservers(status);
    }

    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }
}
