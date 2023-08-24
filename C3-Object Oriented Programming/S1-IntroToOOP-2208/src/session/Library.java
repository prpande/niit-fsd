package session;

/*
 * Library
 * Sam, a librarian at a college, is struggling to get his books organized.
 * The college library contains books on various courses offered by the
 * college. The various books are cataloged with a unique ID. As part of
 * an initiative to reorganize the library and make it more accessible for
 * students, the college has decided to create a library management
 * system to provide an online platform to search for and access various
 * books.
 * Tasks
 * 1. Identify the objects.
 * 2. Identify the attributes and behaviors for each of the objects identified.
 */
public class Library 
{
    String id; // unique ID
    String title; // book title
    String author; // book author
    String course; // book course
    String issuedTo; // student the book is issued to currently
    float price;

    public String getInfo(){ return "";}
    public boolean issue(String studentName){return true;}
    public boolean returnBook(){return true;}
}
