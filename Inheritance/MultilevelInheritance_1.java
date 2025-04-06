import java.util.Scanner;

class Library {
protected String libraryName;

Library(String libraryName) {
this.libraryName = libraryName;
}

void displayLibraryDetails() {
System.out.println("Library Name: " + libraryName);
}
}

class Section extends Library {
protected String sectionName;

Section(String libraryName, String sectionName) {
super(libraryName); // Call the parent class constructor
this.sectionName = sectionName;
}

void displaySectionDetails() {
displayLibraryDetails();
System.out.println("Section: " + sectionName);
}
}

class Book extends Section {
private String bookName;
private String author;

Book(String libraryName, String sectionName, String bookName, String author) {
super(libraryName, sectionName); // Call the parent class constructor
this.bookName = bookName;
this.author = author;
}

void displayBookDetails() {
displaySectionDetails();
System.out.println("Book Name: " + bookName);
System.out.println("Author: " + author);
}
}

public class multilevelinheritance_1 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
try {
System.out.print("Enter Library Name: ");
String libraryName = sc.nextLine();
System.out.print("Enter Section Name: ");
String sectionName = sc.nextLine();
System.out.print("Enter Book Name: ");
String bookName = sc.nextLine();
System.out.print("Enter Author Name: ");
String author = sc.nextLine();

Book book = new Book(libraryName, sectionName, bookName, author);

System.out.println("\n--- Library Information ---");
book.displayBookDetails();
} catch (Exception e) {
System.out.println("Error: " + e.getMessage());
} finally {
sc.close();
}
}
}
