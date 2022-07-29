package Runners;

import Models.Book;
import Models.Map;
import Models.User;
import Models.Journal;


public class Main {
    public static void main(String[] args) {

        LibraryManager libraryManager = new LibraryManager();

        User user1 = new User("001", "Khaleeq", "Tanweer", 23);
        User user2 = new User("002", "Faizaan", "Basit", 21);
        User user3 = new User("002", "David", "John", 36);

        Book book1 = new Book("01", "Personality Isn't Permanent", "Benjamin Hardy", "Penguin Publishing Group", 271, "0593083318", "Self-help", true);
        Book book2 = new Book("02", "Timeless Seeds of Advice", "B. B. Abdulla", "Noah", 98, "9781643544182", "Religion", true);

        Map map1 = new Map("03", "Map 1", "Map Publisher",
                "UK", true);
        Map map2 = new Map("04", "Map 2", "Map Publisher",
                "USA", true);

        Journal journal1 = new Journal("05", "Historian Journal volume 1", "English Journals", 80,
                "English History", 3, true);
        Journal journal2 = new Journal("06", "Historian Journal volume 2", "English Journals", 80,
                "English History", 4, true);
        Journal journal3 = new Journal("07", "Historian Journal volume 3", "English Journals", 80,
                "English History", 5, false);


        // Run methods:



        libraryManager.addItemToSystem("01", book1);
        libraryManager.addItemToSystem("02", book2);
        libraryManager.addItemToSystem("03", map1);
        libraryManager.addItemToSystem("04", map2);
        libraryManager.addItemToSystem("05", journal1);
        libraryManager.addItemToSystem("06", journal2);
        libraryManager.addItemToSystem("07", journal3);

//        libraryManager.removeItemFromSystem("03", map1);
//
//        libraryManager.removeItemFromSystem("06", journal2);
//        libraryManager.removeItemFromSystem("07", journal3);

        libraryManager.addUser("001", user1);
        libraryManager.addUser("002", user2);
        libraryManager.addUser("003", user3);

        libraryManager.removeUser("003",user3);

        // check how to create a conditional for check in/out
        // checking in and out
        journal1.checkIn();
        journal3.checkOut(journal3);
        libraryManager.listAvailability();
        libraryManager.checkAvailability("05");



    }
}