package bookstoreProject;

public class Customer {
	//instance variables
    public String custName;//name
    public int custAccID;//customer ID
    public String custAddress;//customer Address
    public int custCCNum;//customer credit card number
    public String custPassword;//customer password
    public int countBooks;//count of number of books customer has bought
    public Book[] booksBought;//array of books the customer has bought

    //constructor
    public Customer(String tempName, int accountID, String address){
        custName = tempName;
        custAccID = accountID;
        custAddress = address;
        countBooks = 0;
        booksBought = new Book[500];

    }
    //methods
    /**
     * creates a summary in a string
     *
     * @param  y  none
     * @return    string of the summary of the person
     */
    public String toString(){//returns a summary as a string.
        String holderCust;
        
        String bookArrayString = "";//to hold the string
        if(countBooks>=0){
            bookArrayString = "Books Bought: " + "\n";

            for(int i =0; i<countBooks; i++){
                if(booksBought[i] != null){//checks if there's a null in the object.
                    bookArrayString = bookArrayString + booksBought[i].toString() + "\n";
                }

            }
        }

        holderCust = "Name: " + custName + ". Account Number: " + custAccID + ". Address: " + custAddress + "\n"+ bookArrayString;
        return holderCust;

    }

    /**
     * returns address
     *
     * @param  y  none
     * @return    the customer's ID
     */
    public String getAddress(){//returns the address of the customer

        return this.custAddress;
    }

    public int getID(){

        return this.custAccID;
    }

    public String getName(){

        return this.custName;
    }

    /**
     * returns the credit card number of the customer
     *
     * @param  none
     * @return    the credit card number
     */
    public int getCCNum(){

        return this.custCCNum;
    }

    /**
     * sets credit card number of the customer
     *
     * @param  tempPW
     * @return    none
     */
    public void setPassword(String tempPW){
        this.custPassword = tempPW;
    }

    /**
     * gets the password of the customer
     *
     * @param  none
     * @return    the customer's password
     */
    public String getPassword(){
        return custPassword;
    }

    /**
     * sets the credit card number of the customer
     *
     * @param  tempCCNum
     * @return    none
     */
    public void setCCNum(int tempCCNum){
        this.custCCNum = tempCCNum;
    }

    /**
     * Sets the address of the customer
     *
     * @param  tempAddress
     * @return    none
     */
    public void setAddress(String tempAddress){
        this.custAddress = tempAddress;
    }

    /**
     * updates the book array with a new book object
     *
     * @param Book temp
     * @return    none
     */
    public void updateBookList(Book temp){
        if(countBooks == 0){//if this is the first boook in the array
            booksBought[countBooks] = temp;
            countBooks++;
        }else{
            countBooks++;
            booksBought[countBooks] = temp;
        }

    }
	

}
