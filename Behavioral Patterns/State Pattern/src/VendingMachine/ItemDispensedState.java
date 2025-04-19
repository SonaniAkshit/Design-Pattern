package VendingMachine;

public class ItemDispensedState implements VmState {
    public void pressButton() {
        System.out.println("Dispensed");
    }
}
