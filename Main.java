public class Main {
    String name;
    int speed;

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        if (speed > 200) {
            System.out.println("OVERSPEEDING IS NOT ALLOWED !!");
        } else {
            this.speed = speed;
        }
    }

    public String getName() {
        return this.name;
    }

    public int getSpeed() {
        return this.speed;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.setName("Mercedes");
        obj.setSpeed(201);  
        System.out.println("Name of the car is: " + obj.getName());
        System.out.println("Speed of the car is: " + obj.getSpeed());
        
        obj.setSpeed(150); 
        System.out.println("Name of the car is: " + obj.getName());
        System.out.println("Speed of the car is: " + obj.getSpeed());
    }
}
