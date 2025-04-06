interface BonusCalculator {
    default double calculateBonus(double salary) {
        return salary * 0.10; // Default 10% bonus
    }
}

interface TaxCalculator {
    default double calculateTax(double salary) {
        return salary * 0.15; // Default 15% tax
    }
}

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.printf("Base Salary: %.2f%n", salary);
    }
}

class PayrollSystem extends Employee implements BonusCalculator, TaxCalculator {
    PayrollSystem(String name, double salary) {
        super(name, salary);
    }

    double calculateNetPay() {
        double bonus = calculateBonus(salary);
        double tax = calculateTax(salary);
        return salary + bonus - tax;
    }

    void displayPayrollDetails() {
        displayEmployeeDetails();
        System.out.printf("Bonus: %.2f%n", calculateBonus(salary));
        System.out.printf("Tax: %.2f%n", calculateTax(salary));
        System.out.printf("Net Pay: %.2f%n", calculateNetPay());
    }
}

public class Hybrid_2 {
    public static void main(String[] args) {
        PayrollSystem employee = new PayrollSystem("John Doe", 50000);
        System.out.println("--- Payroll Details ---");
        employee.displayPayrollDetails();
    }
}