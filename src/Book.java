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
}