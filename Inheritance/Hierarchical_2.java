class Shape {
    void draw() {
        System.out.println("Drawing a shape...");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle...");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle...");
    }
}

public class Hierarchical_2 {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        shape1.draw();

        Shape shape2 = new Rectangle();
        shape2.draw();
    }
}