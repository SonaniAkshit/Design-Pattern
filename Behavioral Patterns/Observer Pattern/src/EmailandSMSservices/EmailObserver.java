package EmailandSMSservices;

public class EmailObserver implements iObserver {
    @Override
    public void update(String status) {
        System.out.println("Email Notification: Order status changed to " + status);
    }
}