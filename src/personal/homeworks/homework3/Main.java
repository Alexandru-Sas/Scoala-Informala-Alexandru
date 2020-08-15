package personal.homeworks.homework3;


public class Main {
    public static void main(String[] args) {

        Novels genre1 = new Novels( "The Last Wish", 250, NovelGenre.ACTION );

        Novels genre2 = new Novels("Silence Of The Lambs", 281, NovelGenre.THRILLER);

        Novels genre3 = new Novels("The Silent Patient", 234, NovelGenre.MYSTERY);

        System.out.println("");

        ArtAlbums quality1 = new ArtAlbums("Leonardo Da Vinci", 20, PaperQuality.OIL);

        ArtAlbums quality2 = new ArtAlbums("Michelangelo", 25,PaperQuality.LINEN);

        ArtAlbums quality3 = new ArtAlbums("Van Gogh",38 , PaperQuality.SILK);

        System.out.println("");

        Book book1 = new Book("The Alchemist",163);
        Book book2 = new Book("Baltagul",210);
        Library library1 = new Library();
        library1.addBook(book1);
        library1.addBook(book2);
        library1.addBook(genre1);
        library1.addBook(genre2);
        library1.addBook(genre3);
        library1.addBook(quality1);
        library1.addBook(quality2);
        library1.addBook(quality3);


        System.out.println("");
        System.out.println("The list of books ");
        System.out.println("");
        library1.listBooks();


        System.out.println("");

        System.out.println("After delete ---------------------------------------------------------------");
        System.out.println("");

        library1.deleteBook(book1);
        System.out.println("");
        library1.listBooks();


    }
}

