import java.io.*;

public class FileHandling_3 {
    public static void main(String[] args) {
        String file1 = "file1.txt";
        String file2 = "file2.txt";

        try (BufferedReader reader1 = new BufferedReader(new FileReader(file1));
             BufferedReader reader2 = new BufferedReader(new FileReader(file2))) {

            String line1, line2;
            int lineCount = 1;
            boolean isIdentical = true;

            while ((line1 = reader1.readLine()) != null | (line2 = reader2.readLine()) != null) {
                if (line1 == null || line2 == null || !line1.equals(line2)) {
                    System.out.printf("Difference at Line %d:%nFile1: %s%nFile2: %s%n", lineCount,
                            line1 == null ? "null" : line1, line2 == null ? "null" : line2);
                    isIdentical = false;
                }
                lineCount++;
            }

            if (isIdentical) {
                System.out.println("The files are identical.");
            } else {
                System.out.println("The files have differences.");
            }

        } catch (IOException e) {
            System.out.println("Error comparing files: " + e.getMessage());
        }
    }
}
