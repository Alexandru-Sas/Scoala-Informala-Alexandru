package personal.homeworks.homework3;

import java.util.Objects;

public class ArtAlbums extends Book {
    private PaperQuality paperQuality;

    public ArtAlbums(String name, int numberOfPages, PaperQuality paperQuality) {
        super(name, numberOfPages);
        this.paperQuality = paperQuality;
    }

    public PaperQuality getPaperQuality() {
        return paperQuality;
    }

    public void setPaperQuality(PaperQuality paperQuality) {
        this.paperQuality = paperQuality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ArtAlbums artAlbums = (ArtAlbums) o;
        return paperQuality == artAlbums.paperQuality;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), paperQuality);
    }

    @Override
    public String toString() {
        return "ArtAlbums {" + "paperQuality=" + paperQuality + ", name='" + name + '\'' + ", numberOfPages=" + numberOfPages + '}';
    }
}
