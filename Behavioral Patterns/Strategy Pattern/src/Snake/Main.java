package Snake;

public class Main {
    public static void main(String[] args) {

        Snake cobra = new Snake(new PoisonousBite());
        System.out.print("Cobra: ");
        cobra.performBite();

        Snake python = new Snake(new NonPoisonousBite());
        System.out.print("Python: ");
        python.performBite();

        System.out.print("Changing Python to poisonous: ");
        python.setBiteBehavior(new PoisonousBite());
        python.performBite();
    }
}

