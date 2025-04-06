class ShapeCalculator {
    // Overloaded methods for different shapes
    double calculateArea(double radius) {
        return Math.PI * radius * radius; // Circle
    }

    double calculateArea(double length, double breadth) {
        return length * breadth; // Rectangle
    }

    double calculateArea(double base, double height, boolean isTriangle) {
        return (isTriangle) ? 0.5 * base * height : base * height; // Triangle or Parallelogram
    }
}

public class Shapeoverloading {
    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();

        // Polymorphism in action: invoking overloaded methods
        System.out.printf("Area of Circle: %.2f%n", calculator.calculateArea(7.0));
        System.out.printf("Area of Rectangle: %.2f%n", calculator.calculateArea(10.0, 5.0));
        System.out.printf("Area of Triangle: %.2f%n", calculator.calculateArea(8.0, 4.0, true));
    }
}
