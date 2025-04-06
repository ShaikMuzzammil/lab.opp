class Property {
    protected String location;
    protected double price;

    Property(String location, double price) {
        this.location = location;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Location: " + location);
        System.out.printf("Price: %.2f%n", price);
    }
}

class CommercialProperty extends Property {
    private String businessType;

    CommercialProperty(String location, double price, String businessType) {
        super(location, price);
        this.businessType = businessType;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Business Type: " + businessType);
    }
}

public class Constructor_1 {
    public static void main(String[] args) {
        Property residential = new Property("Downtown", 2500000.50);
        Property commercial = new CommercialProperty("City Center", 5000000, "Retail");

        System.out.println("--- Residential Property Details ---");
        residential.displayDetails();

        System.out.println("\n--- Commercial Property Details ---");
        commercial.displayDetails();
    }
}