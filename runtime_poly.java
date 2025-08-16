class Vehicle {
    void displayInfo() {
        System.out.println("This is a Vehicle.");
    }
}

class Car extends Vehicle {
    void displayInfo() {
        System.out.println("This is a Car.");
    }
}

class SportsCar extends Car {
    void displayInfo() {
        System.out.println("This is a Sports Car.");
    }
}

public class runtime_poly {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Car();
        Vehicle vehicle3 = new SportsCar();

        vehicle1.displayInfo(); // Calls displayInfo() in Vehicle class
        vehicle2.displayInfo(); // Calls displayInfo() in Car class
        vehicle3.displayInfo(); // Calls displayInfo() in SportsCar class
    }
}
