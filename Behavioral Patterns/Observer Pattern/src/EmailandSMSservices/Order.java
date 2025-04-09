//Subject
package EmailandSMSservices;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String status;
    private List<iObserver> observers = new ArrayList<>();

    public void addObserver(iObserver observer) {
        observers.add(observer);
    }

    public void changeStatus(String newStatus) {
        this.status = newStatus;
        notifyObservers();
    }

    private void notifyObservers() {
        for (iObserver observer : observers) {
            observer.update(status);
        }
    }
}
