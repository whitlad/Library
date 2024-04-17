// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
/*        Book a = new Book("Eric Carle", "The Very Hungry Caterpillar", "9780399256738");
        Book b = new Book("Julia Donaldson", "The Gruffalo", "9780803731097");
        Book c = new Book("J K Rowling", "Harry Potter and the Sorcerer's Stone", " 9781524721251");

        **Creates the object outside the library

        System.out.println("*****************************");
        System.out.println(a);
        System.out.println("*****************************");
        System.out.println(b);
        System.out.println("*****************************");
        System.out.println(c);
        System.out.println("*****************************");*/

    /*System.out.println("Author of Book a " + a.getAuthor());
    System.out.println("Title of Book a " + a.getTitle());
    System.out.println("ISBN of Book a " + a.getISBN());
    System.out.println("Is book a on Loan? " + a.getisOnLoan());
    */
    //    b.setOnLoan(true);

     //   System.out.println(b);
      //  System.out.println("*****************************");

        //not sure how to get this to work
        // a.printBookList();

      Library l = new Library("SERC Bangor");
      l.addBook("Eric Carle", "The Very Hungry Caterpillar", "9780399256738");
      l.addBook("Julia Donaldson", "The Gruffalo", "9780803731097");
      l.addBook("J K Rowling", "Harry Potter and the Sorcerer's Stone", " 9781524721251");
      l.listAllBooks();
//passes the book into the library

  UserInterface ui = new UserInterface();
  ui.showMainMenu();

    }



}