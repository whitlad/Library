/**
 * Provides a user interface for the library application
 *
 */
public class UserInterface {

    public Library library;  //make it public for testing and private when finished

    private InputReader reader;


    public UserInterface()
    {
        library = new Library("Downtown Library");
        reader = new InputReader();

    }

    /**
     * &
     * shows the main menu for the application until the user chooses to quit
     */
    public void showMainMenu()
    {
        boolean quit = false;


        while (quit == false) //white (!quit) ths is the same as quit == false
        {
            System.out.println("Please choose: ");
            System.out.println("1. add a book");
            System.out.println("2. list all books");
            System.out.println("0. exit application");

            String userInput = reader.getInput();

            switch (userInput)
            {
                case "1":
                    //call addBook method
                    addBook();
                    break;

                case "2":
                // call listAllBooks
                    System.out.println("This will call the listAllooks method in the UI\n");
                    break;

                case "0":
                    quit = true;
                    break;

                default :
                    System.out.println("That is not a valid choice, please try again\n");
                    break;

            }
        }


    }

    /**
     * Allows a user to add a book to the library
     */
    public void addBook()
    {
        System.out.println("Please enter author:");
        String author = reader.getInput();

        System.out.println("Please enter the title");
        String title = reader.getInput();

        System.out.println("Please enter the ISBN");
        String ISBN = reader.getInput();

        Book b = new Book(author, title, ISBN);
        library.addBook(b);
        System.out.println("New Book" + title + " added");  //see if this works


    }


}
