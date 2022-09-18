package task;

public class Main {

    public static void main(String[] args) {
        var author = new Author( "Oscar","Wilde");
        var author1 = new Author( "Charles","Dickens");
        var author2 = new Author( "Jack","London");
        var book1 = new Book("The Picture of Dorian Gray", author, 1890);
        var book2 = new Book("Book2", author, 1901);
        var book3 = new Book("Book3", author, 1902);

        System.out.println(author);
        System.out.println(book1);

        System.out.println(book1.getName() + " " + book1.getAuthor() + " " + book1.getPublicationYear());
    }
}
