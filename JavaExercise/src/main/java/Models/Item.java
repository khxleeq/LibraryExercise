package Models;

public class Item {

    // Attributes
    private String itemID;
    private String title;
    private String publisher;
    private int noOfPages;
    private boolean inLibrary;


    // Constructor

    public Item(String itemID, String title, String publisher, int noOfPages, boolean inLibrary) {
        this.itemID = itemID;
        this.title = title;
        this.publisher = publisher;
        this.noOfPages = noOfPages;
        this.inLibrary = inLibrary;
    }

    // Behaviours

    public void checkOut(Item chooseItem) {
        if (chooseItem instanceof Book && chooseItem.inLibrary) {
            chooseItem.setInLibrary(false);
        } else {
            System.out.println("This book has already been checked out");
        }
    }

    public void checkIn() {
        ((Item) this).setInLibrary(true);
    }

    // Getters and Setters
    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public boolean isInLibrary() {
        return inLibrary;
    }

    public void setInLibrary(boolean inLibrary) {
        this.inLibrary = inLibrary;
    }



}
