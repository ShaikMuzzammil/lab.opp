class Rectangle { 
public void area(int length, int breadth) { System.out.println("Rectangle Area: " + (length * breadth)); 
} 
 
public void perimeter(int length, int breadth) { 
System.out.println("Rectangle Perimeter: " + (2 * (length + breadth))); 
} 
} 
 
class Circle { 
public void area(double radius) { 
System.out.println("Circle Area: " + (Math.PI * radius * radius)); 
} 
 
public void circumference(double radius) { System.out.println("Circle Circumference: " + (2 * 
Math.PI * radius)); 
} 
} 
 
public class MainPackage2 { 
public static void main(String[] args) { 
Rectangle rect = new Rectangle(); 
Circle circ = new Circle(); 
 
rect.area(12, 5); 
rect.perimeter(12, 5); 
 
circ.area(6.5); 
circ.circumference(6.5); 
} 
} 
