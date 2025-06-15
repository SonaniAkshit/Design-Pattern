package Snake;

public class Snake {
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
    } /
}


// hello coders
