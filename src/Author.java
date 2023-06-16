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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(Name, author.Name) && Objects.equals(Surname, author.Surname);
    }

    public int hashCode() {
        return Objects.hash(Name, Surname);
    }
}
