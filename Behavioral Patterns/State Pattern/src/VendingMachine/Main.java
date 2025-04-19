package VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();

        vm.setState(new NoCoinState());
        vm.getState();

        vm.setState(new HasCoinState());
        vm.getState();

        vm.setState(new ItemDispensedState());
        vm.getState();

        vm.setState(new SoldOutState());
        vm.getState();
    }
}
