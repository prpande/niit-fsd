package library;

public class Book
{
    private String bookTitle;
    private String ISBNNo;
    private int yearOfPublishing;
    private String authorName;

    public String getBookTitle()
    {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle)
    {
        this.bookTitle = bookTitle;
    }

    public String getISBNNo()
    {
        return ISBNNo;
    }

    public void setISBNNo(String iSBNNo)
    {
        ISBNNo = iSBNNo;
    }

    public int getYearOfPublishing()
    {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing)
    {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getAuthorName()
    {
        return authorName;
    }

    public void setAuthorName(String authorName)
    {
        this.authorName = authorName;
    }

    public void displayBookDetails()
    {
        System.out.println("The book title is      : " + bookTitle);
        System.out.println("The ISBN number is     : " + ISBNNo);
        System.out.println("The year of publish is : " + yearOfPublishing);
        System.out.println("The author name is     : " + authorName);

    }
}

