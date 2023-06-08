import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Book bookCatalog = new Book("Война и мир", 1880, "Лев ", "Толстой");

        // Не понимаю как вклинить сюда автора с именем и фамилией?


        System.out.println("Автор - " + bookCatalog.getAuthor.getAuthorName() + bookCatalog.getAuthor.getAuthorSurname());
        System.out.println("Книга - " + bookCatalog.getBookName());
        System.out.println("Публикация - " + bookCatalog.getPublishingYear() + " года.");

        System.out.println();

        Author author2 = new Author("Максим ", "Горький");
        System.out.println("Автор - " + author2.getAuthorName() + author2.getAuthorSurname());
        Book bookCatalog2 = new Book("Детство", 1913);
        System.out.println("Книга - " + bookCatalog2.getBookName());
        System.out.println("Публикация - " + bookCatalog2.getPublishingYear() + " года.");
        bookCatalog2.setPublishingYear(1915);
        System.out.println("Измененная публикация - " + bookCatalog2.getPublishingYear() + " года.");
    }

}

