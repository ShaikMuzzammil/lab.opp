import java.util.Scanner;

interface LightControl {
    void switchOn();
    void switchOff();
}

interface TemperatureControl {
    void setTemperature(int temperature);
}

class SmartHome implements LightControl, TemperatureControl {
    @Override
    public void switchOn() {
        System.out.println("Lights are switched ON.");
    }

    @Override
    public void switchOff() {
        System.out.println("Lights are switched OFF.");
    }

    @Override
    public void setTemperature(int temperature) {
        System.out.println("Temperature is set to " + temperature + " degrees.");
    }
}

public class Interface_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartHome home = new SmartHome();
        
        System.out.println("Welcome to Smart Home System!");
        System.out.print("Do you want to turn ON the lights? (yes/no): ");
        String lightAction = sc.nextLine();
        
        if (lightAction.equalsIgnoreCase("yes")) {
            home.switchOn();
        } else {
            home.switchOff();
        }
        
        System.out.print("Enter the desired temperature: ");
        int temperature = sc.nextInt();
        home.setTemperature(temperature);
        
        sc.close(); // Close the scanner to prevent resource leaks
    }
}