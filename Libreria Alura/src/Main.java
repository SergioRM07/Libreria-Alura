public class Main {
    public static void main(String[] args) {
        System.out.println("Libreria Alura!");
    }
    public class Book {
        private String title;
        private String author;
        private String isbn;
        private String publisher;
        private int year;

        public Book(String title, String author, String isbn, String publisher, int year) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
            this.publisher = publisher;
            this.year = year;
        }

        // Getters and setters

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", isbn='" + isbn + '\'' +
                    ", publisher='" + publisher + '\'' +
                    ", year=" + year +
                    '}';
            import java.util.ArrayList;
import java.util.List;

            public class BookApi {
                public List<Book> searchBooks(String query) {
                    // Simulamos la búsqueda de libros. En un caso real, harías una solicitud HTTP.
                    List<Book> books = new ArrayList<>();
                    books.add(new Book("Effective Java", "Joshua Bloch", "978-0134685991", "Addison-Wesley", 2018));
                    books.add(new Book("Clean Code", "Robert C. Martin", "978-0132350884", "Prentice Hall", 2008));
                    return books;
                }
            }
            Paso 3: Clase BookCatalog
            java
            Copiar código
import java.util.List;
import java.util.Scanner;

            public class BookCatalog {
                private BookApi bookApi;
                private Scanner scanner;

                public BookCatalog() {
                    this.bookApi = new BookApi();
                    this.scanner = new Scanner(System.in);
                }

                public void start() {
                    while (true) {
                        System.out.println("Seleccione una opción:");
                        System.out.println("1. Buscar libros");
                        System.out.println("2. Ver detalles de un libro");
                        System.out.println("3. Añadir libro a favoritos");
                        System.out.println("4. Ver libros favoritos");
                        System.out.println("5. Salir");
                        System.out.print("Opción: ");
                        int option = scanner.nextInt();
                        scanner.nextLine();  // Consume newline

                        switch (option) {
                            case 1:
                                searchBooks();
                                break;
                            case 2:
                                viewBookDetails();
                                break;
                            case 3:
                                addBookToFavorites();
                                break;
                            case 4:
                                viewFavoriteBooks();
                                break;
                            case 5:
                                System.out.println("Saliendo...");
                                return;
                            default:
                                System.out.println("Opción inválida, intente de nuevo.");
                        }
                    }
                }

                private void searchBooks() {
                    System.out.print("Ingrese el título o autor del libro: ");
                    String query = scanner.nextLine();
                    List<Book> books = bookApi.searchBooks(query);
                    if (books.isEmpty()) {
                        System.out.println("No se encontraron libros.");
                    } else {
                        System.out.println("Libros encontrados:");
                        for (int i = 0; i < books.size(); i++) {
                            System.out.println((i + 1) + ". " + books.get(i).getTitle() + " por " + books.get(i).getAuthor());
                        }
                    }
                }

                private void viewBookDetails() {
                    // Simulación de detalles del libro
                    System.out.println("Detalles del libro no implementados.");
                }

                private void addBookToFavorites() {
                    // Simulación de añadir libro a favoritos
                    System.out.println("Añadir a favoritos no implementado.");
                }

                private void viewFavoriteBooks() {
                    // Simulación de ver libros favoritos
                    System.out.println("Ver libros favoritos no implementado.");
                }
            }
            public class Main {
                public static void main(String[] args) {
                    BookCatalog catalog = new BookCatalog();
                    catalog.start();
                }
}