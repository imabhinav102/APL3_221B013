public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        super(new CanFly(), new Quack());
    }

    @Override
    void display() {
        System.out.println("I'm a RedHead Duck.");
    }
}
