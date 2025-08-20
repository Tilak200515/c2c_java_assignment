package assignment3;

public class Book extends Item {
    private String author;

    public Book(int id, String title, String author) {
        super(id, title); // call parent constructor
        this.author = author;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book: [ID=" + id + ", Title=" + title + ", Author=" + author + "]");
    }

    public String getSummary() {
        return title + " by " + author;
    }
}
