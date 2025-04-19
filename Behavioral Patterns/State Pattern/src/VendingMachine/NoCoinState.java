package VendingMachine;

public class NoCoinState implements VmState{
    public void pressButton() {
        System.out.println("NoCoin");
    }
}
