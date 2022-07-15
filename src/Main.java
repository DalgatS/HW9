import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Author stephenKing = new Author("Stephen", "King");
        Author joanRowling = new Author("Joan", "Rowling");
        Book book1 = new Book(stephenKing, "Book Publishing Ltd.", 1999);
        Book book2 = new Book(joanRowling, "LTD", 2000);
        Book book3 = new Book(joanRowling, "LTD", 2000);
        System.out.println(book1.getPublishingYear());
        book1.setPublishingYear(2001);
        System.out.println(book1.getPublishingYear());

     String b1Author = book1.getAuthor().toString();
        System.out.println(b1Author);

        String b1 = book1.toString();
        System.out.println(b1);

        System.out.println(book2.equals(book3));

    }
}