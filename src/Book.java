import java.util.Objects;

public class Book {
    private final String name;
    private final Author author;
    private int yearPublishing;

    public Book(String name, Author author, int yearPublishing) {
        this.name = name;
        this.author = author;
        this.yearPublishing = yearPublishing;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearPublishing(){
    return this.yearPublishing;
    }
    public void setYearPublishing(int yearPublishing ){

        this.yearPublishing = yearPublishing;
    }
        public String toString(){
        return "Книга: "+this.name+". Автор: "+this.author+". Год публикации: " +this.yearPublishing;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublishing == book.yearPublishing && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, yearPublishing);
    }
}
