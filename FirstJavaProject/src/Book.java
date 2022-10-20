public class Book {
    /* A book class from library*/
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public void borrowBook(){
        this.isBorrowed = true;
    }

    public void returnBook(){
        this.isBorrowed = false;
    }
}
