import java.util.Scanner;

class Event {
    protected String eventName;
    protected double ticketPrice;

    Event(String eventName, double ticketPrice) {
        if (ticketPrice <= 0) {
            throw new IllegalArgumentException("Ticket price must be greater than 0.");
        }
        this.eventName = eventName;
        this.ticketPrice = ticketPrice;
    }

    void displayEventDetails() {
        System.out.println("Event: " + eventName);
        System.out.printf("Ticket Price: %.2f%n", ticketPrice);
    }
}

class TicketBooking extends Event {
    private int numberOfTickets;

    TicketBooking(String eventName, double ticketPrice, int numberOfTickets) {
        super(eventName, ticketPrice);
        if (numberOfTickets <= 0) {
            throw new IllegalArgumentException("Number of tickets must be greater than 0.");
        }
        this.numberOfTickets = numberOfTickets;
    }

    double calculateTotalCost() {
        return numberOfTickets * ticketPrice;
    }

    void displayBookingDetails() {
        displayEventDetails();
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.printf("Total Cost: %.2f%n", calculateTotalCost());
    }
}

public class SingleInheritence_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Event Name: ");
            String eventName = sc.nextLine();
            System.out.print("Enter Ticket Price: ");
            double ticketPrice = sc.nextDouble();
            System.out.print("Enter Number of Tickets: ");
            int numberOfTickets = sc.nextInt();

            TicketBooking booking = new TicketBooking(eventName, ticketPrice, numberOfTickets);
            booking.displayBookingDetails();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}