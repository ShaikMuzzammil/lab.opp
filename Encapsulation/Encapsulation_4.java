import java.util.Scanner;

class Car {
    private int speed;
    private int distance; // Total distance traveled in kilometers
    private double fuel; // Fuel in liters
    private final double FUEL_CONSUMPTION_RATE = 0.1; // Fuel consumption rate in liters per km

    // Constructor
    public Car() {
        this.speed = 0;
        this.distance = 0;
        this.fuel = 50; // Initial fuel in liters
    }

    // Getter for speed
    public int getSpeed() {
        return speed;
    }

    // Getter for distance
    public int getDistance() {
        return distance;
    }

    // Getter for fuel
    public double getFuel() {
        return fuel;
    }

    // Setter for speed
    public void setSpeed(int speed) {
        if (speed >= 0 && speed <= 200) {
            this.speed = speed;
            System.out.println("Speed set to: " + speed + " km/h");
        } else {
            System.out.println("Invalid speed! Must be between 0 and 200 km/h.");
        }
    }

    // Method to accelerate the car
    public void accelerate(int increment) {
        if (speed + increment <= 200) {
            speed += increment;
            System.out.println("Accelerated. Current Speed: " + speed + " km/h");
        } else {
            System.out.println("Cannot accelerate beyond 200 km/h!");
        }
    }

    // Method to apply brakes
    public void brake(int decrement) {
        if (speed - decrement >= 0) {
            speed -= decrement;
            System.out.println("Brakes applied. Current Speed: " + speed + " km/h");
        } else {
            System.out.println("Car is already at a stop!");
        }
    }

    // Method to drive the car for a certain distance
    public void drive(int distance) {
        if (fuel <= 0) {
            System.out.println("Not enough fuel to drive!");
            return;
        }

        this.distance += distance;
        double fuelUsed = distance * FUEL_CONSUMPTION_RATE;
        if (fuelUsed > fuel) {
            System.out.println("Not enough fuel for this distance! You can only drive " + (fuel / FUEL_CONSUMPTION_RATE) + " km.");
            return;
        }

        fuel -= fuelUsed;
        System.out.println("Drove " + distance + " km. Total distance: " + this.distance + " km. Fuel left: " + fuel + " liters.");
    }
}

public class Encapsulation_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = new Car();
        int choice;

        do {
            System.out.println("\n--- Car Speed Management ---");
            System.out.println("1. Set Speed");
            System.out.println("2. Accelerate");
            System.out.println("3. Brake");
            System.out.println("4. Drive");
            System.out.println("5. View Current Status");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter speed (0-200 km/h): ");
                    int speed = scanner.nextInt();
                    car.setSpeed(speed);
                    break;
                case 2:
                    System.out.print("Enter acceleration increment: ");
                    int increment = scanner.nextInt();
                    car.accelerate(increment);
                    break;
                case 3:
                    System.out.print("Enter brake decrement: ");
                    int decrement = scanner.nextInt();
                    car.brake(decrement);
                    break;
                case 4:
                    System.out.print("Enter distance to drive (in km): ");
                    int distance = scanner.nextInt();
                    car.drive(distance);
                    break;
                case 5:
                    System.out.println("Current Speed: " + car.getSpeed() + " km/h");
                    System.out.println("Total Distance: " + car.getDistance() + " km");
                    System.out.println("Fuel Left: " + car.getFuel() + " liters");
                    break;
                case 6:
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 6);

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}