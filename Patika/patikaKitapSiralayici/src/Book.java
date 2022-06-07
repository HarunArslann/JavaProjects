public class Book implements Comparable<Book>{

    private final String name;
    private final int pageNumber;

    public Book(String name, int pageNumber){
        this.name = name;
        this.pageNumber = pageNumber;
    }
    @Override
    public int compareTo(Book b) {
        return getName().compareTo(b.getName());
    }

    public String getName() {
        return name;
    }

    public int getPageNumber() {
        return pageNumber;
    }
}
