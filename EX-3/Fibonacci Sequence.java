import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of terms
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        // Variables to store the first two terms
        int first = 0, second = 1;

        System.out.println("Fibonacci series up to " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            // Calculate the next term
            int nextTerm = first + second;
            first = second;
            second = nextTerm;
        }

        scanner.close();
    }
}
