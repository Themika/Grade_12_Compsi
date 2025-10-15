package BookAndLibrary;

public class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getTitle() {
        if(title == null || title.isEmpty()) {
            title = "Unknown";
        }
        return title;
    }
    public String getAuthor() {
        if(author == null || author.isEmpty()) {
            author = "Unknown";
        }
        return author;
    }
    public boolean getIsBorrowed(){
        return isBorrowed;
    }
    public void borrow(Library library){
        if(!isBorrowed){
            isBorrowed = true;
            library.removeBook(this);
            System.out.println("You have borrowed: " + title);
        } else {
            System.out.println("Sorry, this book is already borrowed.");
        }
        
    }
    public void returnBook(Library library){
        if(isBorrowed){
            isBorrowed = false;
            library.addBook(this);
            System.out.println("You have returned: " + title);
        } else {
            System.out.println("This book was not borrowed.");
        }

    }
    
}
