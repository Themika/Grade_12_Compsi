package BookAndLibrary;

public class Demo {
    public static void main(String[] args) {
        Library library = new Library();
        
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("", ""); // Book with empty title and author
        
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        
        System.out.println("Available books in the library:");
        for (Book book : library.availableBooks()) {
            System.out.println("- " + book.getTitle() + " by " + book.getAuthor() + " (Borrowed: " + book.getIsBorrowed() + ")");
        }
        
        // Borrow a book
        book1.borrow(library);
        
        System.out.println("\nAvailable books after borrowing '1984':");
        for (Book book : library.availableBooks()) {
            System.out.println("- " + book.getTitle() + " by " + book.getAuthor() + " (Borrowed: " + book.getIsBorrowed() + ")");
        }
        
        // Return a book
        book1.returnBook(library);
        
        System.out.println("\nAvailable books after returning '1984':");
        for (Book book : library.availableBooks()) {
            System.out.println("- " + book.getTitle() + " by " + book.getAuthor() + " (Borrowed: " + book.getIsBorrowed() + ")");
        }
    }
}
