import java.io.*;
import java.util.Scanner;

public class FileHandling2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get source and destination file paths
        System.out.print("Enter source file: ");
        String src = sc.nextLine();
        System.out.print("Enter destination file: ");
        String dest = sc.nextLine();
        
        // Check if source file exists and is readable
        File sourceFile = new File(src);
        if (!sourceFile.exists() || !sourceFile.canRead()) {
            System.out.println("Error: Source file does not exist or is not readable.");
            sc.close();
            return;
        }

        try (InputStream in = new FileInputStream(sourceFile);
             OutputStream out = new FileOutputStream(dest)) {
            
            byte[] buffer = new byte[1024]; // 1KB buffer
            int bytesRead;
            long totalBytes = sourceFile.length(); // Total file size for progress
            long bytesCopied = 0;
            
            // Read and write with progress tracking
            while ((bytesRead = in.read(buffer)) > 0) {
                out.write(buffer, 0, bytesRead);
                bytesCopied += bytesRead;
                // Display progress (optional)
                double progress = (double) bytesCopied / totalBytes * 100;
                System.out.printf("Progress: %.2f%%\r", progress);
            }
            System.out.println("\nFile copied successfully. Total bytes copied: " + bytesCopied);
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error during file operation: " + e.getMessage());
        } finally {
            sc.close(); // Ensure Scanner is closed
        }
    }
}