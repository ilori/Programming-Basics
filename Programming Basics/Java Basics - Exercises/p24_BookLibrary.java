import java.text.ParseException;
import java.util.*;

public class p24_BookLibrary {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        int n = Integer.parseInt(console.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = console.nextLine().split("\\s");
            String title = tokens[0];
            String author = tokens[1];
            String publisher = tokens[2];
            String releaseDate = tokens[3];
            String isbn = tokens[4];
            double price = Double.parseDouble(tokens[5]);
            Book currentBook = new Book(title, author, publisher, releaseDate, isbn, price);
            books.add(currentBook);
        }
        Library library = new Library("MyLibrary", books);
        HashMap<String, Double> information = new HashMap<>();

        for (Book i : books) {
            String name = i.author;
            double price = information.containsKey(name) ? information.get(name) : 0;
            price += i.price;
            information.put(name, price);
        }
        List<Map.Entry<String, Double>> list = new LinkedList<>(information.entrySet());
        Collections.sort(list, (o1, o2) -> {
            Double x1 = o1.getValue();
            Double x2 = o2.getValue();
            int sComp = x2.compareTo(x1);
            if (sComp != 0) {
                return sComp;
            } else {
                String y1 = o1.getKey();
                String y2 = o2.getKey();
                return y1.compareTo(y2);
            }
        });
        for (Map.Entry<String, Double> author : list) {
            System.out.printf("%s -> %.2f%n", author.getKey(), author.getValue());
        }

    }


}


class Library {
    String name;
    ArrayList<Book> books;

    public Library(String name, ArrayList<Book> books) {
        this.name = name;
        this.books = books;
    }
}

class Book {
    String title;
    String author;
    String publisher;
    String releaseDate;
    String isbn;
    double price;


    public Book(String title, String author, String publisher, String releaseDate, String number, double price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.releaseDate = releaseDate;
        this.isbn = number;
        this.price = price;
    }

    public String getReleaseDate() {
        return releaseDate;
    }
}
