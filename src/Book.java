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

}
