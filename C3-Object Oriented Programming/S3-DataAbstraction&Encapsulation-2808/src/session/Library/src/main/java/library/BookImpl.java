package library;

public class BookImpl
{
    public static void main(String[] args)
    {
        Book book = new Book();
        book.setAuthorName("Harper Lee");
        book.setBookTitle("To Kill a Mocking Bird");
        book.setISBNNo("9780749301347");
        book.setYearOfPublishing(1960);

        book.displayBookDetails();

    }
}

