import java.util.Scanner;

abstract class Vehicle {
    abstract void serviceCost();
}

class Bike extends Vehicle {
    @Override
    void serviceCost() {
        System.out.println("Bike Service Cost: $100");
    }
}

class Car extends Vehicle {
    @Override
    void serviceCost() {
        System.out.println("Car Service Cost: $200");
    }
}

public class Abstract_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Vehicle Type (bike/car): ");
        String vehicleType = sc.nextLine();
        
        Vehicle vehicle;
        if (vehicleType.equalsIgnoreCase("bike")) {
            vehicle = new Bike();
        } else {
            vehicle = new Car();
        }
        
        vehicle.serviceCost();
        sc.close(); // Close the scanner to prevent resource leaks
    }
}