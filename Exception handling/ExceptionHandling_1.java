import java.util.*;

class PrimeException extends Exception {
    public PrimeException(String msg) {
        super(msg);
    }
}

class PerfectSquareException extends Exception {
    public PerfectSquareException(String msg) {
        super(msg);
    }
}

public class ExceptionHandling_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== AI Number Analyzer 3000 ===");
        
        while(true) {
            System.out.print("\nEnter a number (0 to exit): ");
            try {
                int num = sc.nextInt();
                if(num == 0) break;
                
                if(isPrime(num)) 
                    throw new PrimeException(num + " is a prime number!");
                if(isPerfectSquare(num))
                    throw new PerfectSquareException(num + " is a perfect square!");
                
                System.out.println(num + " is a normal number");
            } 
            catch(PrimeException e) {
                System.out.println("*** Special Number Detected: " + e.getMessage());
            }
            catch(PerfectSquareException e) {
                System.out.println("*** Special Number Detected: " + e.getMessage());
            }
            catch(InputMismatchException e) {
                System.out.println("Invalid input! Please enter integers only");
                sc.nextLine(); // clear buffer
            }
        }
        System.out.println("Goodbye!");
        sc.close();
    }
    
    private static boolean isPrime(int n) {
        if(n <= 1) return false;
        for(int i=2; i<=Math.sqrt(n); i++)
            if(n%i == 0) return false;
        return true;
    }
    
    private static boolean isPerfectSquare(int n) {
        int sqrt = (int)Math.sqrt(n);
        return sqrt*sqrt == n;
    }
}