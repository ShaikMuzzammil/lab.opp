import java.util.Scanner;

abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract void calculateSalary(double baseSalary);
}

class Manager extends Employee {
    Manager(String name) {
        super(name);
    }

    @Override
    void calculateSalary(double baseSalary) {
        System.out.printf("%s's Salary: %.2f%n", name, baseSalary + 5000);
    }
}

class Developer extends Employee {
    Developer(String name) {
        super(name);
    }

    @Override
    void calculateSalary(double baseSalary) {
        System.out.printf("%s's Salary: %.2f%n", name, baseSalary + 3000);
    }
}

public class Interface_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter employee role (manager/developer): ");
        String role = sc.nextLine();
        
        System.out.print("Enter base salary: ");
        double salary = sc.nextDouble();
        
        Employee employee;
        if (role.equalsIgnoreCase("manager")) {
            employee = new Manager(name);
        } else {
            employee = new Developer(name);
        }
        
        employee.calculateSalary(salary);
        sc.close(); // Close the scanner to prevent resource leaks
    }
}