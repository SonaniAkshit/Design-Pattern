package FanStates;

// Client
public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan();

        fan.pressButton(); // OFF -> LOW
        fan.pressButton(); // LOW -> HIGH
        fan.pressButton(); // HIGH -> OFF
        //fan.pressButton(); // OFF -> LOW
    }
}
