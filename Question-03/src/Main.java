public class Main {
    public static void main(String[] args) {
// Create a new Library object
        Library library = new Library("City Library", "123 Main Street");
// Add books to the library
        library.addBook("To Kill a Mockingbird"); library.addBook("1984"); library.addBook("The Great Gatsby");
        library.displayBooks();
// Search for a book by its title
        String searchTitle = "1984";
        boolean found = library.searchBook(searchTitle);
        if (found) {
            System.out.println("The book '" + searchTitle + "' is available in the library.");
        } else {
            System.out.println("The book '" + searchTitle + "' is not available in the library."); }
    }
}