package LibraryCatalogue;

public class Book {

    //PROPERTY field of the book

    String title;
    int ISBN;
    int pageCount;
    boolean isCheckedOut;
    int dayCheckedOut = -1;


    //CONSTRUCTOR of class Book
    public Book(String bookTitle, int bookISBN, int bookPageCount){
        this.title = bookTitle;
        this.ISBN = bookISBN;
        this.pageCount = bookPageCount;
        isCheckedOut = false;
    }

    //Getters - Instance Methods to get different properties
    public String getTitle(){

        return this.title;
    }
    public int getISBN(){
        return this.ISBN;
    }
    public int getPageCount(){
        return this.pageCount;
    }
    public boolean getIsCheckedOut(){
        return this.isCheckedOut;
    }
    public int getDayCheckedOut(){
        return this.dayCheckedOut;
    }

    //Setters -
    public void setIsCheckedOut(boolean newIsDayCheckedOut, int currentDayCheckedOut){
        this.isCheckedOut = newIsDayCheckedOut;
        setDayCheckedOut(currentDayCheckedOut);
    }
    private void setDayCheckedOut(int day){

        this.dayCheckedOut = day;
    }
}
