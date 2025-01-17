public class Book {

    public String name;
    public String author;
    public int year;
    public int numberOfPages;

    public Book(String name, String author, int year, int numberOfPages) {
        this.author = author;
        this.name = name;
        this.year = year;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return name + "; " + author + "; " + year + "; " + numberOfPages;
    }
}
