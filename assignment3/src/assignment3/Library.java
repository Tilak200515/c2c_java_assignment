package assignment3;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Item> items;

    public Library() {
        items = new ArrayList<>();
    }

    // Add an item (Book or Magazine)
    public void addItem(Item item) {
        items.add(item);
    }

    // Show all items
    public void showAllItems() {
        System.out.println("\nLibrary contains:");
        for (Item item : items) {
            if (item instanceof Book) {
                System.out.println("- " + ((Book) item).getSummary());
            } else if (item instanceof Magazine) {
                System.out.println("- " + ((Magazine) item).getSummary());
            } else {
                item.displayInfo();
            }
        }
    }
}
