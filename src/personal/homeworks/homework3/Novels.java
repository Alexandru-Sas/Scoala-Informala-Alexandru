package personal.homeworks.homework3;

import java.util.Objects;

public class Novels extends Book {
    private NovelGenre genre;

    public Novels(String name, int numberOfPages, NovelGenre genre) {
        super(name, numberOfPages);
        this.genre = genre;
    }

    public NovelGenre getGenre() {
        return genre;
    }

    public void setGenre(NovelGenre genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Novels novels = (Novels) o;
        return genre == novels.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), genre);
    }

    @Override
    public String toString() {
        return "Novels {" + "genre=" + genre + ", name='" + name + '\'' + ", numberOfPages=" + numberOfPages + '}';
    }
}
















