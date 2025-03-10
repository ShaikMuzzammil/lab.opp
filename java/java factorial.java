import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Variable to store the factorial
        long factorial = 1;

        // Edge case: factorial of 0 is 1
        if (number == 0) {
            System.out.println("Factorial of 0 is: 1");
        } else {
            // Calculate factorial for non-zero numbers
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        scanner.close();
    }
}