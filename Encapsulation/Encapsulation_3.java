import java.util.Scanner;

class SmartDevice {
    private int brightness;
    private int volume;
    private final int DEFAULT_BRIGHTNESS = 50; // Default brightness level
    private final int DEFAULT_VOLUME = 50; // Default volume level

    // Constructor to initialize device settings to default values
    public SmartDevice() {
        this.brightness = DEFAULT_BRIGHTNESS;
        this.volume = DEFAULT_VOLUME;
    }

    // Getter for brightness
    public int getBrightness() {
        return brightness;
    }

    // Setter for brightness
    public void setBrightness(int brightness) {
        if (brightness >= 0 && brightness <= 100) {
            this.brightness = brightness;
            System.out.println("Brightness set to: " + brightness);
        } else {
            System.out.println("Invalid brightness level! Must be between 0 and 100.");
        }
    }

    // Getter for volume
    public int getVolume() {
        return volume;
    }

    // Setter for volume
    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
            System.out.println("Volume set to: " + volume);
        } else {
            System.out.println("Invalid volume level! Must be between 0 and 100.");
        }
    }

    // Method to reset settings to default values
    public void resetSettings() {
        this.brightness = DEFAULT_BRIGHTNESS;
        this.volume = DEFAULT_VOLUME;
        System.out.println("Settings have been reset to default values.");
    }
}

public class Encapsulation_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartDevice device = new SmartDevice();
        int choice;

        do {
            System.out.println("\n--- Smart Device Settings ---");
            System.out.println("1. Set Brightness");
            System.out.println("2. Set Volume");
            System.out.println("3. View Current Settings");
            System.out.println("4. Reset to Default Settings");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter brightness level (0-100): ");
                    int brightness = sc.nextInt();
                    device.setBrightness(brightness);
                    break;
                case 2:
                    System.out.print("Enter volume level (0-100): ");
                    int volume = sc.nextInt();
                    device.setVolume(volume);
                    break;
                case 3:
                    System.out.println("Current Brightness: " + device.getBrightness());
                    System.out.println("Current Volume: " + device.getVolume());
                    break;
                case 4:
                    device.resetSettings();
                    break;
                case 5:
                    System.out.println("Exiting the settings. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        sc.close(); // Close the scanner to prevent resource leaks
    }
}