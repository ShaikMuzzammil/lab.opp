import java.util.Scanner;

// Abstract Bank class
abstract class Bank {
    abstract double getInterestRate(); // Abstract method
    void displayInterestRate() {
        System.out.printf("Interest Rate: %.2f%%%n", getInterestRate());
    }
}

// Specific Bank subclasses
class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 5.5;
    }
}

class HDFC extends Bank {
    @Override
    double getInterestRate() {
        return 6.2;
    }
}

class ICICI extends Bank {
    @Override
    double getInterestRate() {
        return 6.0;
    }
}

public class Overriding_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display options to user
        System.out.println("Choose a bank to see its interest rate:");
        System.out.println("1. SBI\n2. HDFC\n3. ICICI");

        int choice = scanner.nextInt();
        Bank bank;

        // Dynamic behavior based on user choice
        switch (choice) {
            case 1:
                bank = new SBI();
                break;
            case 2:
                bank = new HDFC();
                break;
            case 3:
                bank = new ICICI();
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        // Display interest rate
        System.out.println("Selected Bank:");
        bank.displayInterestRate();
        scanner.close();
    }
}
