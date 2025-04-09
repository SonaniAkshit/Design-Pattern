package EmailandSMSservices;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        // Add observers
        order.addObserver(new EmailObserver());
        order.addObserver(new SMSObserver());

        // Change order status
        order.changeStatus("PLACED");
        order.changeStatus("SHIPPED");
        order.changeStatus("DELIVERED");
    }
}