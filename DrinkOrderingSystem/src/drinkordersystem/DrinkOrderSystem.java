package drinkordersystem;

import data.CoffeeShop;
import ui.ConsoleMenu;

public class DrinkOrderSystem {

    public static void main(String[] args) {
        //create a console menu
        ConsoleMenu consoleMenu = new ConsoleMenu("B1 Cafe");
        consoleMenu.addNewOption("1. View menu");
        consoleMenu.addNewOption("2. View your cart");
        consoleMenu.addNewOption("3. Add Coffee to cart");
        consoleMenu.addNewOption("4. Remove Coffee from cart");
        consoleMenu.addNewOption("5. Make payment");
        consoleMenu.addNewOption("6. Exit");

        //create a coffee menu for B1 Cafe
        CoffeeShop b1Cafe = new CoffeeShop();
        //Italian Coffee
        b1Cafe.addNewItalianCoffee("IC001", "CAFFÉ RISTRETTO",
                "CLASSIC COFFEE", "S", 300);
        b1Cafe.addNewItalianCoffee("IC002", "CAFFÉ RISTRETTO",
                "CLASSIC COFFEE", "R", 380);
        b1Cafe.addNewItalianCoffee("IC003", "CAFFÉ CORRETTO",
                "ESPRESSO, FOAM", "S", 360);
        b1Cafe.addNewItalianCoffee("IC004", "CAFFÉ CORRETTO",
                "ESPRESSO, FOAM", "R", 420);
        b1Cafe.addNewItalianCoffee("IC005", "CAFFÉ LUNGO",
                "ESPRESSO + HOT WATER", "S", 330);
        b1Cafe.addNewItalianCoffee("IC006", "CAFFÉ LUNGO",
                "ESPRESSO + HOT WATER", "R", 420);
        b1Cafe.addNewItalianCoffee("IC007", "CAPPUCCINO",
                "ESPRESSO, FRESH MILK, FOAM", "S", 380);
        b1Cafe.addNewItalianCoffee("IC008", "CAPPUCCINO",
                "ESPRESSO, FRESH MILK, FOAM", "R", 480);
        b1Cafe.addNewItalianCoffee("IC009", "LATTE",
                "ESPRESSO, FRESH MILK, FOAM", "S", 400);
        b1Cafe.addNewItalianCoffee("IC010", "LATTE",
                "ESPRESSO, FRESH MILK, FOAM", "R", 530);
        b1Cafe.addNewItalianCoffee("IC011", "COFFEE MOCHA",
                "ESPRESSO, CHOCOLATE, FRESH MILK, FOAM", "S", 420);
        b1Cafe.addNewItalianCoffee("IC012", "COFFEE MOCHA",
                "ESPRESSO, CHOCOLATE, FRESH MILK, FOAM", "R", 550);
         //INDIAN COFFEE
        b1Cafe.addNewIndianCoffee("IN001", "FILTER COFFEE",
                "100% ROBUSTA COFFEE", "S", 230);
        b1Cafe.addNewIndianCoffee("IN002", "FILTER COFFEE",
                "100% ROBUSTA COFFEE", "R", 280);
        b1Cafe.addNewIndianCoffee("IN003", "COFFEE MILK",
                "BLACK COFFEE, CONDENSED MILK", "S", 250);
        b1Cafe.addNewIndianCoffee("IN004", "COFFEE MILK",
                "BLACK COFFEE, CONDENSED MILK", "R", 330);
        b1Cafe.addNewIndianCoffee("IN005", "COLD COFFEE ",
                "BLACK COFFEE, ALMOND MILK", "S", 280);
        b1Cafe.addNewIndianCoffee("IN006", "COLD COFFEE ",
                "BLACK COFFEE, ALMOND MILK", "R", 360);

        int choice;
        do {
            consoleMenu.printOption();
            choice = consoleMenu.getChoice();
            switch (choice) {
                case 1:
                    b1Cafe.printMenuByChoosing();
                    break;
                case 2:
                    b1Cafe.printCart();
                    break;
                case 3:
                    b1Cafe.addToCartByID();
                    break;
                case 4:
                    b1Cafe.removeFromCartByID();
                    break;
                case 5:
                    b1Cafe.makePayment();
                    break;
                case 6:
                    System.out.println("Bye bye, hope to see you soon!");
                    break;
            }
        } while (choice != 6);
    }
}
