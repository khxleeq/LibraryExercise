package Models;

import Interfaces.Updateable;

public class Journal extends Item implements Updateable {

    // Attributes
    private String subject;
    private int volume;

    // Constructor

    // constructor
    public Journal(String itemID, String title, String publisher, int noOfPages, String subject, int volume,
                   boolean inLibrary) {
        super(itemID, title, publisher, noOfPages, inLibrary);
        this.subject = subject;
        this.volume = volume;
    }

    // Behaviours

    // Getters and Setters

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void update() {

    }

}
