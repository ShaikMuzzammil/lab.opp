import java.io.*;
import java.util.*;

public class FileHandling_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file path: ");
        String path = sc.nextLine();
        
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            int lines = 0, words = 0, chars = 0;
            String line;
            
            while((line = br.readLine()) != null) {
                lines++;
                chars += line.length();
                words += line.split("\\s+").length;
            }
            
            System.out.println("File Analysis:");
            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + chars);
            
        } catch(FileNotFoundException e) {
            System.out.println("Error: File not found");
        } catch(IOException e) {
            System.out.println("Error reading file");
        }
    }
}