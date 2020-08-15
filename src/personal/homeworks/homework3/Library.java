package personal.homeworks.homework3;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book newBook) {
        this.books.add(newBook);
    }

    public void deleteBook(Book book) {
        int indexToBeDeleted = -1;
        for (int i = 0; i < books.size(); i++) {
            if (book.equals(books.get(i))) {
                indexToBeDeleted = i;
                break;
            }
        }
        if (indexToBeDeleted != -1){
            books.remove(indexToBeDeleted);
        }
    }

    public void listBooks() {
        for (Book book : this.books) {
            System.out.println(book.toString());
        }
    }
}

