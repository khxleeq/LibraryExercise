package Models;

import Interfaces.Updateable;

public class Book extends Item implements Updateable {

    // Attributes

    private String author;
    private String isbn;
    private String genre;

    // Constructor


    public Book(String itemID, String title,String author, String publisher, int noOfPages, String isbn, String genre,boolean inLibrary) {
        super(itemID, title, publisher, noOfPages, inLibrary);
        this.author = author;
        this.isbn = isbn;
        this.genre = genre;
    }


    // Behaviours

    // Getters and Setters


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void update() {

    }


}
