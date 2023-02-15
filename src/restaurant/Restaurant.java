package restaurant;

public class Restaurant {




    public static void main(String[] args){
        MenuItem item1 = new MenuItem("Salad", "Spring Mix", 17.99, "Healthy",
                false);
        MenuItem item2 = new MenuItem("Salad", "Spring Mix", 17.99, "Healthy",
                false);
      MenuItem item3 = new MenuItem("Cheeseburger", "Cheddar Cheese", 2.99, "Sandwiches",
               true);

      //creates a new menu called myMenu
      Menu myMenu = new Menu();

      // adds menu items to the newly created menu called myMenu
        myMenu.addMenuItem(item1);
        myMenu.addMenuItem(item2);
        myMenu.addMenuItem(item3);

        // prints out each menu item from the menu called myMenu
       // System.out.println(myMenu);

        // removes a menu item from the menu called myMenu.
       // myMenu.removeMenuItem(item2);

        //prints out the menu called myMenu with menu item #2 removed
        System.out.println(myMenu);


      //prints out the details for a menu item
       // System.out.println(item1.toString());

        // prints out true or false depending on if items are equal or not
        //System.out.println(item1.equals(item2));

        // prints out true or false depending on if items are equal or not
       // System.out.println(item1.equals(item3));

    }
}
