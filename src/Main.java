import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Лев", "Толстой");
        Book warAndPeace = new Book("Война и мир", tolstoy, 1882);

        System.out.println(warAndPeace.toString());
        System.out.println(tolstoy.toString());


        System.out.println();

        Author gorky = new Author("Максим ", "Горький");
        Book detstvo = new Book("Детство", gorky, 1913);
        System.out.println(detstvo.toString());
        System.out.println(gorky.toString());

        detstvo.setPublishingYear(1915);
        System.out.println("Измененная публикация - " + detstvo.getPublishingYear() + " года.");

        Author gorkii = new Author("Максим ", "Горький");
        Book gorkiiBook = new Book("Детство", gorkii, 1915);

        System.out.println(gorkiiBook.equals(detstvo));
    }
}

