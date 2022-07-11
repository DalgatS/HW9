import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Stephen", "King");
        Author author2 = new Author("Joan", "Rowling");
        Book book1 = new Book (author1,  "Book Publishing Ltd.", 1999);
        Book book2 = new Book ( author2, "LTD", 2000);
        System.out.println(book1.getPublishingYear());
        book1.setPublishingYear(2001);
        System.out.println(book1.getPublishingYear());

    }
}