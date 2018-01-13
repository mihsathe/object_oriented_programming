import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        Library libraryTest = new Library();
        
        libraryTest.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
        libraryTest.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
        libraryTest.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
        libraryTest.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));
        
        ArrayList<Book> result = libraryTest.searchByTitle("Cheese");
        for (Book book : result) {
            System.out.println(book);
        }
        
        System.out.println("---");
        for (Book book : libraryTest.searchByPublisher("Penguin Group  ")) {
            System.out.println(book);
        }

        System.out.println("---");
        for (Book book : libraryTest.searchByYear(1851)) {
            System.out.println(book);
        }
    }
}