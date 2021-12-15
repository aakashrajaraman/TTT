package bookstoreProject;

public class Main {
public static void main(String[] args){
        
        System.out.println("Book object testing");
        Book book1 = new Book(112, "Upstory", "Walden", 2002, "Aakash Rajaraman", 50, 4.50);//makes new book1
        Book book2 = new Book(236, "Computer adventure" , "PubPubPub", 2019, "Jack Sparrow", 13, 9.77);//makes new book2
        System.out.println("Book summary: "+book1.toString());//returns summary
        System.out.println("Book stock (pre sales): "+book1.getStock());//gets stock
        System.out.println("Book sales (pre sales): "+book1.getSales());//gets sales
        System.out.println("Book price: "+book1.getPrice());//gets the price of the book
        System.out.println("Book title: "+book1.getTitle());//gets the title of the book
        System.out.println("Book author: "+book1.getAuthor());//gets author
        System.out.println("Book publishing year: "+book1.getYear());//gets publishing year
        System.out.println("Book publisher: "+book1.getPublisher());//gets publisher
        System.out.println("Book ID Num: "+book1.getIDNum());//gets ID number
        
        
        
        System.out.println();//space
        
        
        System.out.println("Customer testing");
        Customer jack = new Customer("jack", 450, "123 barry way");//creates new customer
        jack.setAddress("456 allen blvd");//sets address
        System.out.println("address: "+jack.getAddress());//returns address
        System.out.println("name: "+jack.getName());//gets name
        System.out.println("cust ID: "+jack.getID());//gets ID
        jack.setCCNum(3333);//sets credit card number
        System.out.println("CC Num: "+jack.getCCNum());//returns credit card number
        jack.setPassword("DuhDuhDoy123");//sets password
        System.out.println("Password: "+jack.getPassword());//gets password
        System.out.println();
        
        
        //sale happens
        book1.bookSold(book1, jack, 5);//jack buys 5 copies of book1
        book2.bookSold(book2, jack, 2);//jack buys 2 copies of book2
        System.out.println("account summary:-");
        System.out.println(jack.toString());//account summary
        
        System.out.println("post sale testing:");
         System.out.println(book1.getTitle()+" new stock: "+book1.getStock());//new stock
        System.out.println(book1.getTitle()+" new sales:"+book1.getSales());//new sales of the books
        book1.restockBooks(45);//rest ocks book1 with 45
        System.out.println("Restocked.");
        
        System.out.println("new new stock: " + book1.getStock());//gets new stock
        
        
        
        
        
        }
}
