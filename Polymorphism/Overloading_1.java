class Vehicle {
    protected String make;
    protected String model;

    Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    Vehicle(String make) {
        this(make, "Unknown Model");
    }

    Vehicle() {
        this("Unknown Make", "Unknown Model");
    }

    void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
    }
}

class ElectricVehicle extends Vehicle {
    private int batteryCapacity;

    ElectricVehicle(String make, String model, int batteryCapacity) {
        super(make, model);
        this.batteryCapacity = batteryCapacity;
    }

    ElectricVehicle(String make, int batteryCapacity) {
        super(make, "Unknown Model");
        this.batteryCapacity = batteryCapacity;
    }

    ElectricVehicle(int batteryCapacity) {
        super("Unknown Make", "Unknown Model");
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

public class Overloading_1 {
    public static void main(String[] args) {
        Vehicle basicVehicle1 = new Vehicle("Toyota", "Corolla");
        Vehicle basicVehicle2 = new Vehicle("Honda");
        Vehicle basicVehicle3 = new Vehicle();

        ElectricVehicle electricVehicle1 = new ElectricVehicle("Tesla", "Model S", 100);
        ElectricVehicle electricVehicle2 = new ElectricVehicle("Nissan", 40);
        ElectricVehicle electricVehicle3 = new ElectricVehicle(75);

        System.out.println("--- Basic Vehicle Details ---");
        basicVehicle1.displayDetails();
        basicVehicle2.displayDetails();
        basicVehicle3.displayDetails();

        System.out.println("\n--- Electric Vehicle Details ---");
        electricVehicle1.displayDetails();
        electricVehicle2.displayDetails();
        electricVehicle3.displayDetails();
    }
}