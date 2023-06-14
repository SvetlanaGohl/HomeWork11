import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Лев", "Толстой");
        Book warAndPeace = new Book("Война и мир", tolstoy, 1882);

        System.out.println("Книга - " + warAndPeace.getBookName());
        System.out.println("Публикация - " + warAndPeace.getPublishingYear() + " года.");
        System.out.println("Автор - " + warAndPeace.getAuthor().getAuthorName() + " " + warAndPeace.getAuthor().getAuthorSurname());

        System.out.println();

        Author gorky = new Author("Максим ", "Горький");
        Book detstvo = new Book("Детство", gorky, 1913);
        System.out.println("Книга - " + detstvo.getBookName());
        System.out.println("Публикация - " + detstvo.getPublishingYear() + " года.");
        System.out.println("Автор - " + detstvo.getAuthor().getAuthorName() + " " + detstvo.getAuthor().getAuthorSurname());

        detstvo.setPublishingYear(1915);
        System.out.println("Измененная публикация - " + detstvo.getPublishingYear() + " года.");
    }
}

