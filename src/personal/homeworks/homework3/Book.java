package personal.homeworks.homework3;
import java.util.Objects;

public class Book {
    protected  String name;
    protected  int numberOfPages;


    public Book(String name, int numberOfPages) {
        this.name = name;
        this.numberOfPages = numberOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return numberOfPages == book.numberOfPages &&
                Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numberOfPages);
    }

    @Override
    public String toString() {
        return "Book {name='" + name + ", numberOfPages=" + numberOfPages + '}';
    }
}
