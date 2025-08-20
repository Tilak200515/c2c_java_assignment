package assignment3;

public class InheritanceCompositionDemo {
    public static void main(String[] args) {
        // Inheritance Demo
        Book book1 = new Book(101, "Java Basics", "James Gosling");
        Magazine mag1 = new Magazine(201, "Tech Today", 45);

        System.out.println("--- Inheritance Demo ---");
        book1.displayInfo();
        mag1.displayInfo();

        // Composition Demo
        Library library = new Library();
        library.addItem(book1);
        library.addItem(mag1);

        System.out.println("\n--- Composition Demo ---");
        library.showAllItems();
    }
}
