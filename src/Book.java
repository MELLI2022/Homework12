public class Book {
    private String name;
    private String author;
    private int YearPubliching;

    public Book(String name, String author, String YearPubliching) {
        this.name = "Жизнь";
        this.author = "Ivanov";
        this.YearPubliching = Integer.parseInt("2022");
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYearPubliching() {
        return this.YearPubliching;
    }
    public void setYearPubliching(String YearPubliching ){
        this.YearPubliching = Integer.parseInt(YearPubliching);
    }

}
