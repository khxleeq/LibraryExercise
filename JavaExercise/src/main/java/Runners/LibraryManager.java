package Runners;

import Models.*;

import java.util.ArrayList;
import java.util.HashMap;

public class LibraryManager {


    // Attributes
    private ArrayList<Item> libraryInventoryList = new ArrayList<Item>();
    private HashMap<String, Item> libraryInventoryMap = new HashMap<String, Item>();
    private ArrayList<User> libraryUserList = new ArrayList<User>();
    private HashMap<String, User> libraryUserMap = new HashMap<String, User>();


    // Behaviours

    // Adding all items to List and Map
    public void addItemToSystem(String chooseKey, Item chooseItem) {
        libraryInventoryMap.put(chooseKey, chooseItem);
        libraryInventoryList.add(chooseItem);
    }
    public void removeItemFromSystem(String chooseKey, Item chooseItem) {
        libraryInventoryMap.remove(chooseKey,chooseItem);
        libraryInventoryList.remove(chooseItem);
    }

    // Add Users
    public void addUser(String chooseKey, User chooseUser) {
        libraryUserList.add(chooseUser);
        libraryUserMap.put(chooseKey, chooseUser);
    }

    public void removeUser(String chooseKey, User chooseUser) {
        libraryUserList.remove(chooseUser);
        libraryUserMap.remove(chooseKey, chooseUser);

    }
    // Checking book's availability

    public boolean checkAvailability(String chooseKey) {
        Item i = libraryInventoryMap.get(chooseKey);
        if (i.isInLibrary()) {
            System.out.println("Item " + chooseKey + ": " + i.getTitle() + " is available.");
        } else {
            System.out.println("Item " + chooseKey + ": " + i.getTitle() + " is unavailable.");
        }
        return i.isInLibrary();
    }

    // List all availability
    public void listAvailability() {
        int numOfBooks = 0;
        int numOfMaps = 0;
        int numOfJournals = 0;
        int totalItems = 0;


        for(Item i: libraryInventoryList) {
            if(i instanceof Book && i.isInLibrary()) {
                numOfBooks++;
                totalItems++;
            }
            if(i instanceof Map && i.isInLibrary()) {
                numOfMaps++;
                totalItems++;
            }
            if (i instanceof Journal && i.isInLibrary()) {
                numOfJournals++;
                totalItems++;
            }
        }

        System.out.println("The library currently has " + totalItems + " available item(s)");
        System.out.println((libraryInventoryList.size() - totalItems) + " item(s) have been checked out");
        System.out.println("The following number of items are available:");
        System.out.println("Books: " + numOfBooks);
        System.out.println("Maps: " + numOfMaps);
        System.out.println("Journals: " + numOfJournals);

    }
    // Getters and Setters

    public ArrayList<Item> getLibraryInventoryList() {
        return libraryInventoryList;
    }

    public void setLibraryInventoryList(ArrayList<Item> libraryInventoryList) {
        this.libraryInventoryList = libraryInventoryList;
    }

    public HashMap<String, Item> getLibraryInventoryMap() {
        return libraryInventoryMap;
    }

    public void setLibraryInventoryMap(HashMap<String, Item> libraryInventoryMap) {
        this.libraryInventoryMap = libraryInventoryMap;
    }

    public ArrayList<User> getLibraryUserList() {
        return libraryUserList;
    }

    public void setLibraryUserList(ArrayList<User> libraryUserList) {
        this.libraryUserList = libraryUserList;
    }

    public HashMap<String, User> getLibraryUserMap() {
        return libraryUserMap;
    }

    public void setLibraryUserMap(HashMap<String, User> libraryUserMap) {
        this.libraryUserMap = libraryUserMap;
    }


}
