import java.util.Scanner;

class Order {
    private int orderId;
    private String status;

    // Constructor
    public Order(int orderId, String status) {
        this.orderId = orderId;
        this.status = status;
    }

    // Getter for orderId
    public int getOrderId() {
        return orderId;
    }

    // Getter for status
    public String getStatus() {
        return status;
    }

    // Method to update the status of the order
    public void updateStatus(String newStatus) {
        if (newStatus.equalsIgnoreCase("shipped") || 
            newStatus.equalsIgnoreCase("delivered") || 
            newStatus.equalsIgnoreCase("cancelled")) {
            status = newStatus;
            System.out.println("Order #" + orderId + " status updated to: " + status);
        } else {
            System.out.println("Invalid status! Must be 'shipped', 'delivered', or 'cancelled'.");
        }
    }
}

public class  {
    public static void main(String[] args) {
        Order order = new Order(12345, "Processing");
        
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Current Status: " + order.getStatus());
        
        order.updateStatus("shipped");
        order.updateStatus("delivered");
        order.updateStatus("in transit"); // Invalid status
    }
}

class SmartDevice {
    private int brightness;
    private int volume;

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
}

public class SmartDeviceSettings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartDevice device = new SmartDevice();
        
        System.out.println("--- Smart Device Settings ---");
        
        System.out.print("Enter brightness level (0-100): ");
        int brightness = sc.nextInt();
        device.setBrightness(brightness);
        
        System.out.print("Enter volume level (0-100): ");
        int volume = sc.nextInt();
        device.setVolume(volume);
        
        System.out.println("Current Brightness: " + device.getBrightness());
        System.out.println("Current Volume: " + device.getVolume());
        
        sc.close(); // Close the scanner to prevent resource leaks
    }
}