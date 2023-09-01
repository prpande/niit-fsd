package org.example;

public class Book
{
    private long isbnNumber;
    private String bookTitle;
    private String bookDescription;
    private Author bookAuthor;

    public long getIsbnNumber()
    {
        return isbnNumber;
    }

    public void setIsbnNumber(long isbnNumber)
    {
        this.isbnNumber = isbnNumber;
    }

    public String getBookTitle()
    {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle)
    {
        this.bookTitle = bookTitle;
    }

    public String getBookDescription()
    {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription)
    {
        this.bookDescription = bookDescription;
    }

    public Author getBookAuthor()
    {
        return bookAuthor;
    }

    public void setBookAuthor(Author bookAuthor)
    {
        this.bookAuthor = bookAuthor;
    }

    public void displayBookDetails()
    {
        System.out.printf("ISBN Number: %d\nBook Title: %s\nBook Description: %s\nAuthor: %s\n",
                            isbnNumber, bookTitle, bookDescription, bookAuthor.toString());
    }
}
