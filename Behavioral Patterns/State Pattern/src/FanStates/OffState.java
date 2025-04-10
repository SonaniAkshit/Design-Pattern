package FanStates;

// Concrete States
class OffState implements FanState {
    public void pressButton(Fan fan) {
        System.out.println("Turning fan to LOW");
        fan.setState(new LowState());
    }
}
