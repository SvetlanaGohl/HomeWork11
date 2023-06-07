
public class Main {
    public static void main(String[] args) {
        Author author = new Author("Лев ", "Толстой");
        System.out.println("Автор - " + author.getAuthorName() + author.getAuthorSurname());
        Book bookCatalog = new Book("Война и мир", 1880);
        System.out.println("Книга - " + bookCatalog.getBookName());
        System.out.println("Публикация - " + bookCatalog.getPublishingYear() + " года.");

        System.out.println();

        Author author2 = new Author("Максим ", "Горький");
        System.out.println("Автор - " + author2.getAuthorName() + author2.getAuthorSurname());
        Book bookCatalog2 = new Book("Детство", 1913);
        System.out.println("Книга - " + bookCatalog2.getBookName());
        System.out.println("Публикация - " + bookCatalog2.getPublishingYear() + " года.");
    }

}