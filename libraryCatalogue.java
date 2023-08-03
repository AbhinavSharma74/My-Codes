package LibraryCatalogue;

import java.util.HashMap;
import java.util.Map;

public class libraryCatalogue {

    //Properties/Fields/Global Variables
    Map<String,Book> bookCollection = new HashMap<String,Book>();
    int currentDay = 0;
    int lengthOfCheckOutPeriod = 7;
    double initialLatefee = 0.5;
    double feePerLateDay = 1.00;

    //Constructors
    public libraryCatalogue(Map<String,Book> collection){
        this.bookCollection = collection;
    }
    public libraryCatalogue(Map<String,Book> collection, int lengthOfCheckedOutPeriod, double initialLatefee, double feePerLateDay){
        this.bookCollection = collection;
        this.lengthOfCheckOutPeriod = lengthOfCheckedOutPeriod;
        this.initialLatefee = initialLatefee;
        this.feePerLateDay = feePerLateDay;
    }

    //Getters
    public int getCurrentDay(){
        return this.currentDay;
    }
    public Map<String,Book> getBookCollection(){
        return this.bookCollection;
    }
    public Book getBook(String bookTitle){
        return getBookCollection().get(bookTitle);
    }
    public int getLengthOfCheckOutPeriod(){
        return this.lengthOfCheckOutPeriod;
    }
    public double getInitialLatefee(){
        return this.initialLatefee;
    }
    public double getFeePerLateDay(){
        return this.feePerLateDay;
    }

    //Setters
    public void setDay(int day){
        currentDay = day;
    }
    public void nextDay(){
        currentDay++;
    }

    //Instance Methods
    public void checkOut(String title){
        Book book = getBook(title);
        if (book.getIsCheckedOut()){
            sorryBookAlreadyCheckedOut(book);
        }else{
            book.setIsCheckedOut(true,currentDay);
            System.out.println("You just checked out " + title + ". This is due on day " + (getCurrentDay() + getLengthOfCheckOutPeriod()) + ".");
        }
    }
    public void returnBook(String title){
        Book book = getBook(title);
        int daysLate = currentDay - (book.getDayCheckedOut() + getLengthOfCheckOutPeriod());
        if (daysLate > 0){
            System.out.println("You owe the Library $" + (getInitialLatefee() + daysLate + getFeePerLateDay()) + " because your book is " + daysLate + " days overdue.");
        }else{
            System.out.println("Book returned. Thank you...");
        }
        book.setIsCheckedOut(false,-1);
    }
    public void sorryBookAlreadyCheckedOut(Book book){
        System.out.println("Sorry, " + book.title + " is already checked out. It should be back on day " + (book.getDayCheckedOut() + getLengthOfCheckOutPeriod()) + ".");
    }

    public static void main(String[] args) {
        Map<String,Book> bookCollection = new HashMap<String,Book>();
        Book harry = new Book("Harry Potter",224455, 384);
        bookCollection.put("Harry Potter", harry);
        libraryCatalogue lib = new libraryCatalogue(bookCollection);
        lib.checkOut("Harry Potter");
        lib.nextDay();
        lib.nextDay();
        lib.checkOut("Harry Potter");
        lib.setDay(17);
        lib.returnBook("Harry Potter");
        lib.checkOut("Harry Potter");
    }
}
