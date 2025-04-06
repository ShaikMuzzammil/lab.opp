import java.util.Scanner;

interface Dimensions {
    double area();
    double perimeter();
}

class Rectangle implements Dimensions {
    private double length;
    private double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return length * breadth;
    }

    @Override
    public double perimeter() {
        return 2 * (length + breadth);
    }
}

public class Interface_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Length of Rectangle: ");
        double length = sc.nextDouble();
        
        System.out.print("Enter Breadth of Rectangle: ");
        double breadth = sc.nextDouble();
        
        Rectangle rectangle = new Rectangle(length, breadth);
        
        System.out.printf("Area: %.2f%n", rectangle.area());
        System.out.printf("Perimeter: %.2f%n", rectangle.perimeter());
        
        sc.close(); // Close the scanner to prevent resource leaks
    }
}