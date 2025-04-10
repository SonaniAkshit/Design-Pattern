package FanStates;

// Context
class Fan {
    private FanState state;

    public Fan() {
        state = new OffState(); // initial state
    }

    public void setState(FanState newState) {
        state = newState;
    }

    public void pressButton() {
        state.pressButton(this);
    }
}
