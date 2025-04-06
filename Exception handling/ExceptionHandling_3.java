import java.util.*;

class MatrixException extends Exception {
    MatrixException(String msg) {
        super(msg);
    }
}

public class ExceptionHandling_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Matrix Operations");

        try {
            System.out.print("Enter matrix size (rows columns): ");
            int rows = sc.nextInt();
            int cols = sc.nextInt();

            if (rows <= 0 || cols <= 0)
                throw new MatrixException("Dimensions must be positive");

            System.out.println("Enter matrix elements:");
            int[][] matrix = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            System.out.print("Enter operation (trace/transpose): ");
            String op = sc.next();

            switch (op.toLowerCase()) {
                case "trace":
                    if (rows != cols)
                        throw new MatrixException("Not a square matrix");
                    int trace = 0;
                    for (int i = 0; i < rows; i++)
                        trace += matrix[i][i];
                    System.out.println("Trace: " + trace);
                    break;

                case "transpose":
                    System.out.println("Transpose:");
                    for (int j = 0; j < cols; j++) {
                        for (int i = 0; i < rows; i++) {
                            System.out.print(matrix[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                default:
                    throw new MatrixException("Invalid operation");
            }
        } catch (MatrixException e) {
            System.out.println("Matrix Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Input Error: Invalid number format");
        } finally {
            sc.close();
        }
    }
}
