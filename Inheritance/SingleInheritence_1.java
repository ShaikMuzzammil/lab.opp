import java.util.Scanner;

class MarsRoverNavigation {
    protected double speed;

    MarsRoverNavigation(double speed) {
        if (speed <= 0) {
            throw new IllegalArgumentException("Speed must be greater than 0.");
        }
        this.speed = speed;
    }

    double travelTime(double distance) {
        if (distance <= 0) {
            throw new IllegalArgumentException("Distance must be greater than 0.");
        }
        return distance / speed;
    }
}

class SingleInheritence_1 extends MarsRoverNavigation {
    private double fuel;

    SingleInheritence_1(double speed, double fuel) {
        super(speed);
        if (fuel <= 0) {
            throw new IllegalArgumentException("Fuel must be greater than 0.");
        }
        this.fuel = fuel;
    }

    double fuelConsumption(double distance) {
        if (distance <= 0) {
            throw new IllegalArgumentException("Distance must be greater than 0.");
        }
        double fuelUsed = distance * 0.1;
        if (fuelUsed > fuel) {
            throw new IllegalArgumentException("Insufficient fuel for the given distance.");
        }
        return fuelUsed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Speed (km/h): ");
            double speed = sc.nextDouble();

            System.out.print("Enter Fuel (liters): ");
            double fuel = sc.nextDouble();

            System.out.print("Enter Distance (km): ");
            double distance = sc.nextDouble();

            SingleInheritence_1 rover = new SingleInheritence_1(speed, fuel);

            double time = rover.travelTime(distance);
            double fuelUsed = rover.fuelConsumption(distance);
            System.out.printf("Travel Time: %.2f hours%n", time);
            System.out.printf("Fuel Used: %.2f liters%n", fuelUsed);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}