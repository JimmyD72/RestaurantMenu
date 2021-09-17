package restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    public static void main(String[] args) {
        ArrayList<MenuItem>menuItems = new ArrayList<>(
                Arrays.asList(
                        new MenuItem(12.95, "Wedge Salad", "Wedges of iceberg lettuce, bacon, tomato, bleu cheese crumbles, balsamic reduction, bleu cheese dressing, and Bermuda onion frittes", "Salad"),
                        new MenuItem( 45.95, "Tomahawk Ribeye", "Wagyu beef bone-in Ribeye, reverse seared", "Entree")));

        Menu menu = new Menu(menuItems);
        menu.addMenuItem(new MenuItem(
                11.00,
                "Ice cream sandwich",
                "House made coffee ice cream sandwiched between chocolate cardamom cookies, Bailey's creme Anglaise",
                "Dessert"
        ));
        menu.printMenu();

    }
}
