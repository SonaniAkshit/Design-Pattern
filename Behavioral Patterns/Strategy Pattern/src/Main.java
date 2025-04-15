// Step 1: Strategy Interface
interface BiteBehavior {
    void bite();
}

// Step 2: Concrete Strategy - Poisonous Snake
class PoisonousBite implements BiteBehavior {
    public void bite() {
        System.out.println("This snake injects venom! 🐍☠️");
    }
}

// Step 3: Concrete Strategy - Non-Poisonous Snake
class NonPoisonousBite implements BiteBehavior {
    public void bite() {
        System.out.println("This snake bites but it's harmless. 🐍🙂");
    }
}

// Step 4: Context - Snake class
class Snake {
    private BiteBehavior biteBehavior;

    // Constructor accepts a BiteBehavior
    public Snake(BiteBehavior biteBehavior) {
        this.biteBehavior = biteBehavior;
    }

    // Perform bite based on strategy
    public void performBite() {
        biteBehavior.bite();
    }

    // Allow changing bite behavior at runtime
    public void setBiteBehavior(BiteBehavior biteBehavior) {
        this.biteBehavior = biteBehavior;
    }
}

// Step 5: Test in main()
public class Main {
    public static void main(String[] args) {
        // Create a poisonous snake
        Snake cobra = new Snake(new PoisonousBite());
        System.out.print("Cobra: ");
        cobra.performBite();

        // Create a non-poisonous snake
        Snake python = new Snake(new NonPoisonousBite());
        System.out.print("Python: ");
        python.performBite();

        // Change behavior at runtime
        System.out.print("Changing Python to poisonous: ");
        python.setBiteBehavior(new PoisonousBite());
        python.performBite();
    }
}
