public class LazySingleton {

    private static LazySingleton uniqueInstance;


    private LazySingleton() {
        System.out.println("Lazy Singleton instance created.");
    }

    
    public static LazySingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new LazySingleton();
        }
        return uniqueInstance;
    }

    public static void main(String[] args) {
        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();

        System.out.println("Are both instances the same? " + (instance1 == instance2));
    }
}
