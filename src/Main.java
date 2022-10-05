public class Main {


    public static void main(String[] args) {
        
        Author ivanIvanov = new Author ("Иван", "Иванов");
        Author peterPetrov = new Author ("Пётр", "Петров");
        Book life = new Book("Жизнь", ivanIvanov, 2022);
        Book dream = new Book("Мечта", peterPetrov, 1984);
        System.out.println("Книга: "+life.getName()+". Автор: " +life.getAuthor().getFirstName()+" "+life.getAuthor().getLastName()+". Год публикации: " + life.getYearPublishing());
        System.out.println("Книга: "+dream.getName()+". Автор: " +dream.getAuthor().getFirstName()+" "+dream.getAuthor().getLastName()+". Год публикации: " + dream.getYearPublishing());
        life.setYearPublishing (2020);
        System.out.println("Книга: "+life.getName()+". Автор: "+life.getAuthor().getFirstName()+" "+life.getAuthor().getLastName()+". Год публикации: " +life.getYearPublishing());
        dream.setYearPublishing(1985);
        System.out.println("Книга: "+dream.getName()+". Автор: "+dream.getAuthor().getFirstName()+" "+dream.getAuthor().getLastName()+". Год публикации: " +dream.getYearPublishing());
    }
}