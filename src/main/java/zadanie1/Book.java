package zadanie1;

public class Book {
    private Author author;
    private String title;



    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return author+ ", Tytuł: "+ title;
    }
}
