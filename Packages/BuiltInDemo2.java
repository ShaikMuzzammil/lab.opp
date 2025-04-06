import java.io.File; import java.time.LocalDateTime; import java.time.format.DateTimeFormatter; 
import java.text.SimpleDateFormat; 
 
public class BuiltInDemo2 { 
public static void main(String[] args) { 
File file = new File("test.txt"); 
System.out.println("File exists: " + file.exists()); 
 
 
LocalDateTime now = LocalDateTime.now(); 
DateTimeFormatter dtf = 
DateTimeFormatter.ofPattern("yyyy-MM-dd 
HH:mm:ss"); 
System.out.println("Current Date-Time: " + now.format(dtf)); 
SimpleDateFormat sdf = new SimpleDateFormat("dd-
MM-yyyy"); 
System.out.println("Formatted Current Date: " + sdf.format(new java.util.Date())); 
} 
} 
