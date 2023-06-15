import java.util.Objects;

public class Author {
    private String Name;
    private String Surname;

    public Author (String Name, String Surname) {
        this.Name = Name;
        this.Surname = Surname;
    }
    public String getAuthorName(){

        return this.Name;
    }
    public String getAuthorSurname() {

        return this.Surname;
    }
    public String toString () {
        return "Автор - " + this.Name + " " + this.Surname;
    }

    public boolean equals(Author author) {
        return this.Name.equals(author.Name) && this.Surname.equals(author.Surname);
    }
        public int hashCode() {
        return Objects.hash(Name, Surname);
    }
}
