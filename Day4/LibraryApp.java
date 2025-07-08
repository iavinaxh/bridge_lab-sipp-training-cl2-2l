package Day4;
import java.util.ArrayList;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void showDetails() {
        System.out.println(title + " by " + author);
    }
}

class Library {
    String name;
    ArrayList<Book> books;

    Library(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    void showLibraryBooks() {
        System.out.println("Books in " + name + ":");
        for (Book book : books) {
            book.showDetails();
        }
    }
}

public class LibraryApp {
    public static void main(String[] args) {
        // Create independent books
        Book b1 = new Book("Atomic Habits", "James Clear");
        Book b2 = new Book("The Alchemist", "Paulo Coelho");
        Book b3 = new Book("Clean Code", "Robert C. Martin");

        // Create libraries
        Library centralLibrary = new Library("Central Library");
        Library scienceLibrary = new Library("Science Library");

        // Add books to libraries
        centralLibrary.addBook(b1);
        centralLibrary.addBook(b2);

        scienceLibrary.addBook(b2); // Shared book
        scienceLibrary.addBook(b3);

        // Show books in each library
        centralLibrary.showLibraryBooks();
        System.out.println();
        scienceLibrary.showLibraryBooks();
    }
}
