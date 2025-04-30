import java.awt.print.Book;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;


public class BookCatalogueManagerApp {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        LinkedList<Books> bookList = new LinkedList<>();
        while(true){
            printActions();
            int choice = scanner.nextInt();
            switch(choice){
                case 1-> addBooks(bookList);
                case 2-> removeBooks(bookList);
                case 3-> printBooks(bookList);
                case 4->{
                    System.out.println("Exiting the app....");
                    return;
                }

                default -> System.out.println("Invalid Choice!!");
            }

        }
    }
    public static void addBooks(LinkedList<Books> books){
        System.out.println("Enter the name of the book: ");
        scanner.nextLine();
        String title = scanner.nextLine().trim();

        System.out.println("Enter the author's name: ");
        String author = scanner.nextLine().trim();

        books.add(new Books(title, author));
        System.out.println(books);
    }

    // ---Method to remove books----- //

    public static void removeBooks(LinkedList<Books> books){
        System.out.println("Enter the name of the book you want to remove: ");
        scanner.nextLine();
        String name = scanner.nextLine().trim();
        for(Books i: books){
            if(i.title.equalsIgnoreCase(name)){
                books.remove(i);
                System.out.println("Book Removed!!");
            }
        }
        System.out.println(books);

    }
    // ----Method to print all the books using iterator------//

    public static void printBooks(LinkedList<Books> books){
        Iterator<Books> iterator =  books.iterator();
        while(iterator.hasNext()){
            Books book = iterator.next();
            System.out.println(book);
        }

    }

    public static void printActions(){
        System.out.println("""
                \n       \s
                        Book Catalogue Manager
                       \s
                Enter (1) to Add books
                Enter (2) to Remove Books
                Enter (3) to print all books
                Enter (4) to Quit the app
               \s
                Enter your choice:\s
               \s""");
    }
}
