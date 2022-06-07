import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> books = new TreeSet<>();

        Book book1=new Book("Sefiller",302);
        Book book2=new Book("Homo Sapiens",350);
        Book book3=new Book("Game of Thrones",706);
        Book book4=new Book("Lord of the Rings",850);
        Book book5=new Book("Kinyas ve Kayra",458);

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        System.out.println("Kitap ismine gore siralama : ");
        for(Book book:books){
            System.out.println(book.getName());
        }

        TreeSet<Book> books2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o2.getPageNumber() - o1.getPageNumber();
            }
        });

        books2.add(book1);
        books2.add(book2);
        books2.add(book3);
        books2.add(book4);
        books2.add(book5);
        System.out.println("========================");
        System.out.println("Sayfa sayisina gore : ");
        for(Book book:books2){
            System.out.println(book.getName());
        }



    }
}