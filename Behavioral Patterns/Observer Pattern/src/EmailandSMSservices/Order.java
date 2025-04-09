//Subject
package EmailandSMSservices;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String status;
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void changeStatus(String newStatus) {
        this.status = newStatus;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(status);
        }
    }
}
