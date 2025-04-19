package VendingMachine;

public class VendingMachine {
    private VmState state;

    public VendingMachine() {
        state = new NoCoinState();
    }

    public void setState(VmState newstate) {
        state = newstate;
    }

    public VmState getState() {
        state.pressButton();
        return state;
    }
}
