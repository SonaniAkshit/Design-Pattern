package FanStates;

// Client
public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan();

        fan.setState(new OffState());
        fan.requestFan(); // OFF -> LOW

        fan.setState(new LowState());
        fan.requestFan(); // LOW -> HIGH

        fan.setState(new HighState());
        fan.requestFan(); // HIGH -> OFF
    }
}
