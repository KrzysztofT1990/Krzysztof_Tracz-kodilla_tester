public class Book {

    private String author;
    private String title;

    public static Book of(String author, String title) {
        System.out.println("Autorem książki: " + title + " jest " + author);
        return null;
    }

    public static void main(String[] args) {
        Book book = Book.of("AUTOR", "TYTUL");
    }
}