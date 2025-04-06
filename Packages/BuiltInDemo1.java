import java.util.Scanner; import java.util.Date; 
import java.lang.Math; 
 
public class BuiltInDemo1 { 
public static void main(String[] args) { Scanner scanner = new Scanner(System.in); 
 
System.out.print("Enter a number: "); int num = scanner.nextInt(); 
 
System.out.println("Square Root: " + Math.sqrt(num)); 
System.out.println("Cube: " + Math.pow(num, 3)); 
System.out.println("Absolute Value of -num: " + 
Math.abs(-num)); 
 
Date now = new Date(); 
System.out.println("Current Date: " + now); 
} 
} 
