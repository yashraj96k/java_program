import java.util.Scanner;

// Base Class
class Vehicle {
    void start() {
        System.out.println("The vehicle is starting.");
    }
}

// Subclass 1 - Car
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("The car starts with a key or push button.");
    }
}

// Subclass 2 - Bike
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("The bike starts with a self-start or kick.");
    }
}

// Subclass 3 - Truck
class Truck extends Vehicle {
    @Override
    void start() {
        System.out.println("The truck starts with a heavy-duty ignition system.");
    }
}

// Main Class
public class polymorphism {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a vehicle type to start:");
        System.out.println("1. Car");
        System.out.println("2. Bike");
        System.out.println("3. Truck");
        System.out.print("Enter your choice (1-3): ");

        int choice = scanner.nextInt();

        Vehicle myVehicle; // Superclass reference

        switch (choice) {
            case 1:
                myVehicle = new Car();
                break;
            case 2:
                myVehicle = new Bike();
                break;
            case 3:
                myVehicle = new Truck();
                break;
            default:
                System.out.println("Invalid choice! Defaulting to a generic vehicle.");
                myVehicle = new Vehicle();
                break;
        }

        myVehicle.start(); // Calls overridden method based on object type

        scanner.close();
    }
}
