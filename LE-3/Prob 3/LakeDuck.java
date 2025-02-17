public class LakeDuck extends Duck {
    public LakeDuck() {
        super(new CanFly(), new Quack());
    }

    @Override
    void display() {
        System.out.println("I'm a Lake Duck.");
    }
}
