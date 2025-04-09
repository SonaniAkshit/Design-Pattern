package EmailandSMSservices;

public class EmailObserver implements Observer {
    @Override
    public void update(String status) {
        System.out.println("Email Notification: Order status changed to " + status);
    }
}