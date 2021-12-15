package bookstoreProject;

public class Book {
	public int bookIDNum;//book ID Num
    public String bookTitle;//title
    public String bookAuthor;//author
    public String bookPublisher;//publisher
    public int yearOfPublishing;//year of publishing
    public int bookStock;//stock
    public int booksSold;//how many sold
    public double bookPrice;//price

    /**
     * Constructor for objects of class Book
     */
    public Book(int bookID, String title, String publisher, int year, String author, int stock, double price){
        bookIDNum = bookID;
        bookTitle = title;
        bookAuthor = author;
        bookPublisher = publisher;
        yearOfPublishing = year;
        bookStock = stock;
        bookPrice = price;
        booksSold = 3;

    }
   

    /**
     * returns a summary of the book
     *
     * @param none
     * @return    none
     */
    public String toString(){
        String holderBook = "Book: " + bookTitle + " by " + bookAuthor + ". Published " + yearOfPublishing + " by " + bookPublisher
        + ". Price: $ " + bookPrice;

        return holderBook;  
    }

    /**
     * gets the ID number of the book
     *
     * @param none
     * @return    bookIDNum
     */
    public int getIDNum(){

        return bookIDNum;
    }

    /**
     * gets the title of the book
     *
     * @param none
     * @return    bookTitle
     */
    public String getTitle(){

        return bookTitle;
    }

    /**
     * gets the author of the book
     *
     * @param none
     * @return    bookAuthor
     */
    public String getAuthor(){

        return bookAuthor;
    }

    /**
     * gets the publisher of the book
     *
     * @param none
     * @return    bookPublisher
     */
    public String getPublisher(){

        return bookPublisher;
    }

    /**
     * gets the year of publishing of the book
     *
     * @param none
     * @return   yearOfPublishing
     */
    public int getYear(){

        return yearOfPublishing;
    }

    /**
     * gets the stock left of the book
     *
     * @param none
     * @return    bookStock
     */
    public int getStock(){

        return bookStock;
    }

    /**
     * gets the number of copies sold of the book
     *
     * @param none
     * @return    booksSolds
     */
    public int getSales(){

        return booksSold;
    }

    /**
     * gets the price of the book
     *
     * @param none
     * @return    bookPrice
     */
    public double getPrice(){

        return bookPrice;
    }

    /**
     * updates the book that is sold, and checks to see if the sale is possible
     *
     * @param Book tempBook, Customer tempPerson, int booksRequested
     * @return    none
     */
    public void bookSold(Book tempBook, Customer tempPerson, int booksRequested){

        if(bookStock<booksRequested){//checks if the number of books is greater than the stock
            System.out.println("ERROR: BOOK NOT IN STOCK");
        }else if (booksRequested<=0){//checks if the number requested is 0 or less
            System.out.println("ERROR: INVALID ACTION");
        }else{
            bookStock = bookStock - booksRequested;
            booksSold = booksSold+booksRequested;
            for(int i =0; i<= booksRequested; i++){//updates the list of books for each book requested
                tempPerson.updateBookList(tempBook);
            }
        }

    }
    /**
     * restocks the book with more copies
     *
     * @param int restockVal
     * @return    none
     */
    public void restockBooks(int restockVal){
        if(restockVal>=1){//checks for a good restock value
            bookStock = bookStock + restockVal;
        }else{

            System.out.println("ERROR: INVALID RESTOCK ACTION");
        }

    }
}
