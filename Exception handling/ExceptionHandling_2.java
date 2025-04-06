import java.util.*;
import java.util.regex.*;

class RegistrationException extends Exception {
    RegistrationException(String message) {
        super(message);
    }
}

public class ExceptionHandling_2 {
    private static final Map<String, String> users = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("User Registration System");

        while (true) {
            System.out.println("\n1. Register\n2. Login\n3. Exit");
            System.out.print("Choose option: ");

            try {
                int choice = Integer.parseInt(sc.nextLine());
                if (choice == 3) break;

                switch (choice) {
                    case 1:
                        registerUser(sc);
                        break;
                    case 2:
                        loginUser(sc);
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input format");
            } catch (RegistrationException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        sc.close();
    }

    static void registerUser(Scanner sc) throws RegistrationException {
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        validateUsername(username);

        System.out.print("Enter password: ");
        String password = sc.nextLine();
        validatePassword(password);

        users.put(username, password);
        System.out.println("Registration successful!");
    }

    static void loginUser(Scanner sc) throws RegistrationException {
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (!users.containsKey(username)) {
            throw new RegistrationException("Username not found");
        }

        if (!users.get(username).equals(password)) {
            throw new RegistrationException("Incorrect password");
        }

        System.out.println("Login successful! Welcome " + username);
    }

    static void validateUsername(String username) throws RegistrationException {
        if (username.length() < 5) {
            throw new RegistrationException("Username must be at least 5 characters");
        }
        if (!Pattern.matches("^[a-zA-Z0-9]+$", username)) {
            throw new RegistrationException("Username can only contain letters and numbers");
        }
        if (users.containsKey(username)) {
            throw new RegistrationException("Username already exists");
        }
    }

    static void validatePassword(String password) throws RegistrationException {
        if (password.length() < 8) {
            throw new RegistrationException("Password must be at least 8 characters");
        }
        if (!Pattern.compile("[0-9]").matcher(password).find()) {
            throw new RegistrationException("Password must contain at least one digit");
        }
        if (!Pattern.compile("[A-Z]").matcher(password).find()) {
            throw new RegistrationException("Password must contain at least one uppercase letter");
        }
    }
}
