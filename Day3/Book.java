import java.util.Scanner;

public class Book {
    static String libraryName = "City Central Library";

    private String title;
    private String author;
    final private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    public void displayDetails() {
        if (this instanceof Book) {
            displayLibraryName();
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter book title: ");
            String title = sc.nextLine();

            System.out.print("Enter book author: ");
            String author = sc.nextLine();

            System.out.print("Enter book ISBN: ");
            String isbn = sc.nextLine();

            books[i] = new Book(title, author, isbn);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("\nBook " + (i + 1) + " Details:");
            books[i].displayDetails();
        }
    }
}
