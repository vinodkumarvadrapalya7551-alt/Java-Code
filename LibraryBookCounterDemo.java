class LibraryBook {
    String title;
    String author;
    double price;

    static int bookCount = 0;

    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        bookCount++;
    }

    static void displayBookCount() {
        System.out.println("Total books created: " + bookCount);
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs. " + price);
    }
}

public class LibraryBookCounterDemo {
    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook("Java Basics", "James", 450);
        LibraryBook b2 = new LibraryBook("OOP in Java", "Robert", 550);

        b1.display();
        System.out.println();
        b2.display();

        LibraryBook.displayBookCount();
    }
}
