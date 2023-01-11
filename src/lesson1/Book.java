package lesson1;

public class Book {
    private String name;
    private Author author;
    private int yearPublishing;

    public Book(String name, Author author, int yearPublishing) {
        this.name = name;
        this.author = author;
        this.yearPublishing = yearPublishing;
    }
public String getName (){
        return name;
}
    public Author getAuthor() {
        return author;
    }
    public int getYearPublishing () {
        return yearPublishing;
    }
    public void setYearPublishing (int yearPublishing) {
        this.yearPublishing=yearPublishing;
    }
}





