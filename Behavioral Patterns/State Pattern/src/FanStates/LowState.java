package FanStates;

// Concrete States
class LowState implements FanState {
    public void pressButton(Fan fan) {
        System.out.println("Turning fan to HIGH");
        fan.setState(new HighState());
    }
}
