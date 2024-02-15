import java.util.ArrayList; import java.util.List;
public class Library {
    private String name;
    private String address;
    private ArrayList<String> books;
    // Constructor
    public Library(String name, String address) { this.name = name;
        this.address = address;
        this.books = new ArrayList<>();
    }
    // Method to add a book to the library
    public void addBook(String bookTitle) {
        books.add(bookTitle);
        System.out.println("Book '" + bookTitle + "' added to the library.");
    }
    // Method to display the list of books in the library
    public void displayBooks() { System.out.println("Books available in the library:"); for (String book : books) {
        System.out.println("- " + book);
    }
    }
    // Method to search for a book by its title
    public boolean searchBook(String bookTitle) { return books.contains(bookTitle);
    }
    // Getter and Setter methods for name and address
    public String getName() { return name;
    }
    public void setName(String name) { this.name = name;
    }
    public String getAddress() { return address;
    }
    public void setAddress(String address) { this.address = address;
    }
}