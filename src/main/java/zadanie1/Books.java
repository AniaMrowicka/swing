package zadanie1;

public class Books {
    public static Book createBook (Author author, String title){
        Book book = new Book();
        book.setAuthor(author);
        book.setTitle(title);
        return book;
    }
}
