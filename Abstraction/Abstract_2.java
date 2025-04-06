import java.util.Scanner;

abstract class Exam {
    abstract void calculateGrade(int score);
}

class ScienceExam extends Exam {
    @Override
    void calculateGrade(int score) {
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 70) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }
    }
}

class MathExam extends Exam {
    @Override
    void calculateGrade(int score) {
        if (score >= 85) {
            System.out.println("Grade: A");
        } else if (score >= 65) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }
    }
}

public class Abstract_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Exam Type (science/math): ");
        String examType = sc.nextLine();
        
        Exam exam;
        if (examType.equalsIgnoreCase("science")) {
            exam = new ScienceExam();
        } else {
            exam = new MathExam();
        }
        
        System.out.print("Enter Exam Score: ");
        int score = sc.nextInt();
        exam.calculateGrade(score);
        
        sc.close(); // Close the scanner to prevent resource leaks
    }
}