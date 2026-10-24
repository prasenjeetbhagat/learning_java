
public class Abstraction {
    public static void main(String[] args) {

        vehicle obj;

        obj = new bike();
        obj.start();
        obj.display();

        obj = new car();
        obj.start();
        obj.display();
    }
}

abstract class vehicle {
    int nooftyres;

    void display() {
        System.out.println("Vehicle has " + nooftyres + " tyres");
    }

    abstract void start();
}

class bike extends vehicle {

    void start() {
        nooftyres = 2;
        System.out.println("Bike starts with a key");
    }
}

class car extends vehicle {

    void start() {
        nooftyres = 4;
        System.out.println("Car starts with a key");
    }
}
