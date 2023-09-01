package org.example;

public class BookImpl
{
    public static void main(String[] args)
    {
        Author author = new Author();
        author.setAuthorName("Samuel Langhorne Clemens");
        author.setAuthorPenName("Mark Twain");

        Book book = new Book();
        book.setIsbnNumber(9780195810400L);
        book.setBookTitle("The Adventures of Tom Sawyer");
        book.setBookDescription("Classic novel set in the mid-1800s. It follows the mischievous and imaginative Tom Sawyer as he navigates childhood adventures in a small Mississippi town. The story captures Tom's escapades, friendship with Huck Finn, and encounters with danger and intrigue, showcasing themes of freedom and growing up.");
        book.setBookAuthor(author);

        book.displayBookDetails();
    }
}
