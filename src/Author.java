public class Author {
    private final String FirstName;
    private final String LastName;



    public Author (String authorFirstName, String authorLastName) {
        this.FirstName = authorFirstName;
        this.LastName = authorLastName;
    }

    public String getAuthorFirstName() {
        return FirstName;
    }

    public String getAuthorLastName() {
        return LastName;
    }

    @Override
    public String toString() {
        return "Автор - " + getAuthorFirstName() + " " + getAuthorLastName();
    }
}
