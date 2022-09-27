public class Main {


    public static void main(String[] args) {
        String book ="Жизнь";
        String book1 ="Мечта";
        String author = "Иванов";
        String author1 = "Петров";

        String[] books = {"Жизнь", "Мечта"};
        String[] authors = {"Иванов", "Петров"};

        for (int i = 0; i < books.length; i++) {
            System.out.println("book = " + books[i]);
            }
            for (int i1 = 0; i1 < authors.length; i1++) {
                System.out.println("author = " + authors[i1]);
            }

            Book life = new Book ("Жизнь", "Иванов","2022" );
        //life.name = "Жизнь";
        System.out.println("life.name = " + life.getName());
        //life.author = "Иванов";
        System.out.println("life.author = " + life.getAuthor());
       //life.YearPubliching = "2022";
        System.out.println("life.YearPubliching = " + life.getYearPubliching());
        life.setYearPubliching (String.valueOf(2020));
        System.out.println("life.getYearPubliching() = " + life.getYearPubliching());
        Author ivanov = new Author("Иван", "Иванов");
        System.out.println("ivanov.firstName = " + ivanov.getfirstName());
        System.out.println("ivanov.lastName = " + ivanov.getlastName());
        System.out.println();
    }
}
