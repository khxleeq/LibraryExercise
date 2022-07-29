package Models;

import Interfaces.Updateable;

public class Map extends Item implements Updateable {

    // Attributes
    private String location;

    // Constructor
    public Map(String itemID, String title, String publisher, String location, boolean inLibrary) {
        super(itemID, title, publisher, 1, inLibrary);
        this.location = location;

    }
    // Behaviours
    // Getters and Setters


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void update() {

    }

}
