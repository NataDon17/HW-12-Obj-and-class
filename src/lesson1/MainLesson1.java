package lesson1;

public class MainLesson1 {
    public static void main(String[] args) {
        Author author1 = new Author("Стивен", "Кинг");
        Book book1 = new Book("Куджо", author1, 2015);
        System.out.println("book1 = " + book1.getName() + ", " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + ", " + book1.getYearPublishing());
        Author author2 = new Author("Михаил", "Булгаков");
        Book book2 = new Book("Мастер и Маргарита", author2, 1998);
        System.out.println("book2 = " + book2.getName() + ", " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + ", " + book2.getYearPublishing());
        book2.setYearPublishing(2002);
        System.out.println("book2 = " + book2.getName() + ", " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + ", " + book2.getYearPublishing());

    }
}
