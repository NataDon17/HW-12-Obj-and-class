package lesson1;

import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int yearPublishing;

    public Book(String name, Author author, int yearPublishing) {
        this.name = name;
        this.author = author;
        this.yearPublishing = yearPublishing;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublishing == book.yearPublishing && name.equals(book.name) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, yearPublishing);
    }

    @Override
    public String toString() {
        return name + author + ", " + yearPublishing;
    }

    public void setYearPublishing (int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }
}





