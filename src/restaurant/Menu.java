package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;

    public Menu(){
        this.lastUpdated = new Date();
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdated() {
        return this.lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    //Other Methods
// adds a menu item to the menu
    public void addMenuItem(MenuItem item) {
        // loops through each item in the menu items list
        for (MenuItem menuItem : this.menuItems) {
            // if it finds an item already in the menu items list it prints message
            if (item.equals(menuItem)) {

                System.out.println("This item is already on the menu");

                // just put return to get out of method and not add duplicate item to list

                return;
            }
        }
        this.menuItems.add(item);

        this.lastUpdated = new Date();
    }

    // removes menu item from the menu
    public void removeMenuItem(MenuItem item) {
        this.menuItems.remove(item);

        this.lastUpdated = new Date();
    }

    // prints each menu item from the menu
    @Override
    public String toString() {
        String returnString = "";

        for (MenuItem item : this.menuItems) {

            returnString += item.toString() + "\n\n";
        }
        return returnString;
    }
}
