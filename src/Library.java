import java.util.ArrayList;

/**

 * Library Inventory of the Library
 * Fines and transactions
 *

 * @author Dawn Whitla

 *@version 10/04/2024

 **/
public class Library {

    private ArrayList<Book> books;

    private String Name;

    //CONSTRUCTORS
    public Library(String aName) {

        this.Name = aName;
        books = new ArrayList<>();

    }

    /**
     * Allows the user to add a book by passing its author, title and ISBN
     * @param aAuthor
     * @param aTitle
     * @param ISBN
     */
    public void addBook(String aAuthor, String aTitle, String ISBN) { //passing to constructor
        Book a = new Book(aAuthor, aTitle, ISBN);  //constructor creates new object
        this.books.add(a);  //calling a constructor look up book class


    }

    /**
     *
     *
     * Allows the user to add a book by passing a book object
     */



    public void addBook(Book b)
    {

    }

    /** returns the numbers of books currently in the library
     *
             * @return the number of books listed
     */
    public int getNumberOfBooks() {

        return this.books.size();
    }

    //List all Books prints out all books in the library

    public void listAllBooks() {
        for (Book eachBook : this.books) //loop variable
        {

            System.out.print("Author " + eachBook.getAuthor() + "  Title  " + eachBook.getTitle() + "ISBN" + eachBook.getISBN() + "\n");

            System.out.println(eachBook);
        }

    }

}




