package FanStates;

// Concrete States
class HighState implements FanState {
    public void pressButton(Fan fan) {
        System.out.println("Turning fan OFF");
        fan.setState(new OffState());
    }
}
