package Snake;

public class NonPoisonousBite implements BiteBehavior {
    public void bite() {
        System.out.println("This snake bites but it's harmless. 🐍🙂");
    }
}