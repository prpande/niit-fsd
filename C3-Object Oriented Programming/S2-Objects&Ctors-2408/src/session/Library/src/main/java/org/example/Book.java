package org.example;

public class Book
{
    String title;
    int yearPublished;
    String isbn;
    String author;

    public Book()
    {
        title = "NoName";
        yearPublished = 1900;
        isbn = "0000-0000-0000";
        author = "Unknown";
    }

    public void displayDetails()
    {
        System.out.printf("Title: %s\tYear: %d\tISBN: %s\tAuthor: %s\n",
                            title, yearPublished, isbn, author);
    }
}
