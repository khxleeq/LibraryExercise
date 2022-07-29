package Models;

import java.util.ArrayList;

public class User {

    // Attributes
    private String userID;
    private String firstName;
    private String lastName;
    private int age;
    private ArrayList<Item> userInventory = new ArrayList<Item>();

    // Constructor

    public User(String userID, String firstName, String lastName, int age) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Behaviours / actions

    public ArrayList<Item> takeItem(User chooseUser, Item checkedItem) {
        getUserInventory().add(checkedItem);
        return userInventory;
    }
    public ArrayList<Item> returnItem(User chooseUser, Item checkedItem) {
        getUserInventory().remove(checkedItem);
        return userInventory;
    }

    // Getters and setters

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Item> getUserInventory() {
        return userInventory;
    }

    public void setUserInventory(ArrayList<Item> userInventory) {
        this.userInventory = userInventory;
    }


}
