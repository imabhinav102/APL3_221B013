public class EagerSingleton {
    
    private static final EagerSingleton uniqueInstance = new EagerSingleton();


    private EagerSingleton() {
        System.out.println("Eager Singleton instance created.");
    }

    
    public static EagerSingleton getInstance() {
        return uniqueInstance;
    }

    public static void main(String[] args) {
        EagerSingleton instance1 = EagerSingleton.getInstance();
        EagerSingleton instance2 = EagerSingleton.getInstance();

        System.out.println("Are both instances the same? " + (instance1 == instance2)); 
    }
}
