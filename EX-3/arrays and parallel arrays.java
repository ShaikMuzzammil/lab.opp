import java.util.Scanner;

public class NameCollector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[100]; // Array to store names
        int index = 0; // Starting index

        // Starting the process
        while (true) {
            // Collecting the first name
            System.out.print("What is your name? ");
            names[index] = scanner.nextLine();

            // Collecting the last name
            System.out.print("What is your last name? ");
            names[index] += " " + scanner.nextLine(); // Concatenate last name

            // Asking if the user wants to enter more names
            System.out.print("Do you want to enter more names? Enter 0 for No or 1 for Yes: ");
            int exit = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            if (exit == 0) {
                break; // Exit the loop if user chooses not to continue
            } else {
                index++; // Increment the index for the next entry
            }
        }

        // Printing collected names
        System.out.println("Collected Names:");
        for (int i = 0; i <= index; i++) {
            System.out.println(names[i]);
        }
        // End of program
        scanner.close();
    }
}
