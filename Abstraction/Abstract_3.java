import java.util.Scanner;

abstract class Room {
    private String roomType;

    
    public Room(String roomType) {
        this.roomType = roomType;
    }

       abstract void roomDetails();
    abstract double getPrice();

    
    public static void displayRoomTypes() {
        System.out.println("Available Room Types:");
        System.out.println("1. Deluxe Room");
        System.out.println("2. Standard Room");
    }

    public String getRoomType() {
        return roomType;
    }
}

class DeluxeRoom extends Room {
    public DeluxeRoom() {
        super("Deluxe Room");
    }

    @Override
    void roomDetails() {
        System.out.println(getRoomType() + " with Sea View - $" + getPrice() + "/night");
    }

    @Override
    double getPrice() {
        return 250.0;
    }
}

class StandardRoom extends Room {
    public StandardRoom() {
        super("Standard Room");
    }

    @Override
    void roomDetails() {
        System.out.println(getRoomType() + " - $" + getPrice() + "/night");
    }

    @Override
    double getPrice() {
        return 150.0;
    }
}

public class Abstract_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Room.displayRoomTypes();         System.out.print("Enter Room Type (deluxe/standard): ");
        String roomType = sc.nextLine();
        
        Room room;
        if (roomType.equalsIgnoreCase("deluxe")) {
            room = new DeluxeRoom();
        } else {
            room = new StandardRoom();
        }
        
        room.roomDetails();
        sc.close();     }
}