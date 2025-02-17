public class Main {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        Duck woodenDuck = new WoodenDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck lakeDuck = new LakeDuck();

        Duck[] ducks = {rubberDuck, woodenDuck, redHeadDuck, lakeDuck};

        for (Duck duck : ducks) {
            duck.display();
            duck.swim();
            duck.performFly();
            duck.performQuack();
            System.out.println();
        }
    }
}
