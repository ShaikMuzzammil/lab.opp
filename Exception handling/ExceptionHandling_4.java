import java.util.*;

class CalcException extends Exception {
    CalcException(String msg) {
        super(msg);
    }
}

public class ExceptionHandling_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Scientific Calculator");

        while (true) {
            System.out.print("\nEnter expression (num op num) or 'exit': ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) break;

            try {
                String[] parts = input.trim().split(" ");
                if (parts.length != 3) throw new CalcException("Invalid format. Use: num op num");

                double a = Double.parseDouble(parts[0]);
                double b = Double.parseDouble(parts[2]);
                String op = parts[1];

                switch (op) {
                    case "+":
                        System.out.println("Result: " + (a + b));
                        break;
                    case "-":
                        System.out.println("Result: " + (a - b));
                        break;
                    case "*":
                        System.out.println("Result: " + (a * b));
                        break;
                    case "/":
                        if (b == 0) throw new CalcException("Cannot divide by zero");
                        System.out.println("Result: " + (a / b));
                        break;
                    case "^":
                        System.out.println("Result: " + Math.pow(a, b));
                        break;
                    default:
                        throw new CalcException("Invalid operator. Use +, -, *, /, or ^");
                }
            } catch (CalcException | NumberFormatException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        sc.close();
        System.out.println("Calculator closed.");
    }
}
