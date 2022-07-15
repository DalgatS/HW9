import java.util.Objects;

public class Book {
    private final Author author;
    private final String publisherName;
    private int publishingYear;

    public Book(Author author, String publisherName, int publishingYear) {
        this.author = author;
        this.publisherName = publisherName;
        this.publishingYear = publishingYear;
    }

    public Author getAuthor() {
        return author;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Книга" +
                " опубликована " + publisherName +
                " в " + publishingYear +
                " году, " + getAuthor().toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(author, book.author) && Objects.equals(publisherName, book.publisherName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, publisherName, publishingYear);
    }
}