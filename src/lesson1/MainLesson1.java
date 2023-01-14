package lesson1;

public class MainLesson1 {
    public static void main(String[] args) {
        Author author1 = new Author("Стивен", "Кинг");
        Book book1 = new Book("Куджо", author1, 2015);
        System.out.println("book1 = " + book1);
        Author author2 = new Author("Михаил", "Булгаков");
        Book book2 = new Book("Мастер и Маргарита", author2, 1998);
        System.out.println("book2 = " + book2);
        book2.setYearPublishing(2002);
        System.out.println("book2 = " + book2);
        Author author3= new Author("Михаил", "Булгаков");
        Book book3=new Book("Мастер и Маргарита", author3, 2002);
        System.out.println("book3 = "+book3);
        System.out.println(author3.equals(author2));
        System.out.println(book2.equals(book1));



    }
}
