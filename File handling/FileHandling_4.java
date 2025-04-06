import java.io.*;
import java.util.*;

public class FileHandling_4 {
    public static void main(String[] args) {
        String fileName = "textfile.txt";
        try {
            Map<String, Integer> wordCount = countWords(fileName);
            System.out.println("Word Frequencies:");
            wordCount.forEach((word, count) -> System.out.println(word + ": " + count));
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    private static Map<String, Integer> countWords(String fileName) throws IOException {
        Map<String, Integer> wordCount = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");
                for (String word : words) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
        }
        return wordCount;
    }
}
