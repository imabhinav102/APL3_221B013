/*
3. Test for Polymorphism
Write another statement in Application class: Mother m1=new Child ( ); Now, call show 
() with reference variable m1 and ‘.’ (dot) operator. Discuss the result with your 
instructor. Now, make the method show ( ) static in Mother only and check the results 
after executing Application. Repeat this by making show () static in Child only. Observe 
the errors. Test whether the static methods are inheritable or not. Now make show () 
static in both Mother as well as in Child and discuss the results with your instructor. 
Make a table to summarize your results.
*/





/*
//Case 1: Without static Method
class Mother {
    void show() {
        System.out.println("Instance method in Mother");
    }
}

class Child extends Mother {
    void show() {
        System.out.println("Instance method in Child");
    }
}

class Application {
    public static void main(String[] args) {
        Mother m1 = new Child();
        m1.show(); // Instance method in Child (runtime polymorphism)
    }
}








//Case 2: show() is static in Mother Only
class Mother {
    static void show() {
        System.out.println("Static method in Mother");
    }
}

class Child extends Mother {
    // No override for static method
}

class Application {
    public static void main(String[] args) {
        Mother m1 = new Child();
        m1.show(); // Calls the static method in Mother
    }
}







//Case 3: show() is static in Child Only
class Mother {
    void show() {
        System.out.println("Instance method in Mother");
    }
}

class Child extends Mother {
    static void show() {
        System.out.println("Static method in Child");
    }
}

class Application {
    public static void main(String[] args) {
        Mother m1 = new Child();
        m1.show(); // Error: m1.show() refers to the instance method in Mother
    }
}
*/





//Case 4: show() is static in Both Mother and Child
class Mother {
    static void show() {
        System.out.println("Static method in Mother");
    }
}

class Child extends Mother {
    static void show() {
        System.out.println("Static method in Child");
    }
}

class Application {
    public static void main(String[] args) {
        Mother m1 = new Child();
        m1.show(); // Calls the static method in Mother (resolved by reference type)

        Child ch = new Child();
        ch.show(); // Calls the static method in Child
    }
}









