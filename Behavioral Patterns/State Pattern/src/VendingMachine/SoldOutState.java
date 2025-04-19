package VendingMachine;

public class SoldOutState implements VmState {
    public void pressButton() {
        System.out.println("SoldOut");
    }
}
