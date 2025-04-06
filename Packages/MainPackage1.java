class WelcomeMessage { 
    public void display() { 
        System.out.println("Welcome to Java Programming using User-Defined Package (15a)!"); 
    } 
} 
 
public class MainPackage1 { 
    public static void main(String[] args) { 
        WelcomeMessage msg = new WelcomeMessage(); 
        msg.display(); 
    } 
}
