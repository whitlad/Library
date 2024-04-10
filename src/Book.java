import java.util.ArrayList;

/**

 * Library Book details
 * Represents book in Library
 *

 * @author Dawn Whitla

 *@version 10/04/2024

 **/

public class Book {  //these are the field classes for books encapsulated data


    private String author;
    private String title;
    private String ISBN;
    private boolean onLoan;



    //CONSTRUCTOR

    /**
     * Constructor to create an object of the Item Class
     * @param aAuthor the author of the book
     * @param aTitle the title of the book
     * @param anISBN the ISBN of the book
     *
     */

    public Book(String aAuthor, String aTitle, String anISBN)
    {

        this.author = aAuthor;
        this.title = aTitle;
        this.ISBN = anISBN;
        this.onLoan = false;   //put the value of the boolean in here and set to false as it's not on loan to start


    }


    // DEFINE GETTER METHODS - GETTER to call book details

    public String getAuthor() { return this.author;}

    public String getTitle() { return this.title;}

    public String getISBN() { return this.ISBN;}

    public Boolean getisOnLoan() { return this.onLoan;}

    //SETTERS to set an on loan method

    public void setOnLoan(Boolean onLoan) {this.onLoan = onLoan;}


    public String toString()
    {
        String availability;

        if(this.onLoan == true)
        {
            availability = "(on loan)";
        }
        else
        {
            availability = "(available)";
        }
        return "Title: " + this.getTitle() + " Author:  " + this.getAuthor() + availability;


    }
    //METHOD to VERIFY ISBN

    public String VerifyISBN(String ISBN)
    {

        if (this.ISBN.length() != 13) {
            System.out.println("The ISBN is not Correct");
        }
        return "this is printing" + ISBN;
    }



}
