import java.util.Objects;

public class Book {
    private Author author;
    private String bookName;
    private int publishingYear;
    public Book (String bookName, Author author, int publishingYear) {
        this.bookName = bookName;
        this.publishingYear = publishingYear;
        this.author = author;
    }
    public Author getAuthor () {
        return author;
    }
    public String getBookName() {

        return bookName;
    }
    public int getPublishingYear(){

        return publishingYear;
    }
    public void setPublishingYear(int publishingYear) {

        this.publishingYear = publishingYear;
    }
    public String toString () {
        return "Книга - " + this.bookName + ", Год побликации - " + this.publishingYear;
    }

    public boolean equals(Book book) {
        return this.bookName.equals(book.bookName) && this.author.equals(book.author) && this.publishingYear == book.publishingYear;
    }
    public int hashCode() {
        return Objects.hash(author, bookName, publishingYear);
    }
}