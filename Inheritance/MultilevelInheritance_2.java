import java.util.Scanner;

class University {
protected String universityName;

University(String universityName) {
this.universityName = universityName;
}

void displayUniversityDetails() {
System.out.println("University: " + universityName);
}
}

class Department extends University {
protected String departmentName;

Department(String universityName, String departmentName) {
super(universityName); 
this.departmentName = departmentName;
}

void displayDepartmentDetails() {
displayUniversityDetails();
System.out.println("Department: " + departmentName);
}
}

class Student extends Department {
private String studentName;
private int rollNumber;

Student(String universityName, String departmentName, String studentName, int rollNumber) {
super(universityName, departmentName); 
this.studentName = studentName;
this.rollNumber = rollNumber;
}

void displayStudentDetails() {
displayDepartmentDetails();
System.out.println("Student Name: " + studentName);
System.out.println("Roll Number: " + rollNumber);
}
}

public class MultilevelInheritance_2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
try {
System.out.print("Enter University Name: ");
String universityName = sc.nextLine();
System.out.print("Enter Department Name: ");
String departmentName = sc.nextLine();
System.out.print("Enter Student Name: ");
String studentName = sc.nextLine();
System.out.print("Enter Roll Number: ");
int rollNumber = sc.nextInt();

Student student = new Student(universityName, departmentName, studentName, rollNumber);
System.out.println("\n--- University Information ---");
student.displayStudentDetails();

} catch (Exception e) {
System.out.println("Error: " + e.getMessage());
} finally {
sc.close();
}
}
}
