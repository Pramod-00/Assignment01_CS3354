/**
 * Grocery Management System
 * 
 * It is an inventory program that uses arrays to store item names and stock quantities. 
 * User can can view inventory and restock items through method calls.
 * 
 * This java program demonstrates loops, arrays, conditional logic, and basic user interactions.
 */

import java.util.Scanner;

public class GroceryManagementSystem{
<<<<<<< HEAD

    /* *
    * Prints inventory of store by looping through the parallel arrays
    * @param names Array of item names
    * @param prices Array of item prices
    * @param stocks Array of stock inventory
    */
    public static void printInventory(String[] names, double[] prices, int[] stocks) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.println("Item: " + names[i] + " Price: $" + prices[i] + " Stock: " + stocks[i]);
            }
        }
    }
=======
<<<<<<< HEAD
>>>>>>> 57826049a4d64e46e947e9ebb9d961915f9598e4

    // Team Members please add methods 

    /**
     * The main method includes the parallel arrays and the user menu
     * from which the user may choose to view items, restock items, or
     * exit the program.
     * @param args
     */
    public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        while (true) {
            Scanner inout = new Scanner(System.in);
            
            System.out.println("Enter 1-3 to choose an option:");
            System.out.println("1 for View");
            System.out.println("2 for Restock");
            System.out.println("3 to exit");

            int option = input.nextInt();

            switch (option) {
                case 1: 
                    printInventory(itemNames, itemPrices, itemStocks);
                    break;
                case 2:
                    System.out.println("Enter the name of the item to restock: ");
                    String item = input.next();
                    System.out.println("Enter the amount to restock: ");
                    int amount = input.nextInt();
                    restockItem(itemNames, itemStocks, item, amount);
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    return;
            }

        }
    }

    /**
 * Search item in array if found restock them 
 * 
 * @param names   - array used to store grocery item names
 * @param stocks  - array used to store the stock quantity
 * @param target  - used to store name of the item, user wants to restock
 * @param amount  - used to add number of units to the existing stock
 */


public static void restock_Item(String[] names, int[] stocks, String target, int amount){
    boolean item_found = false; 
    for(int i = 0; i < names.length; i++){
        if(names[i] != null && names[i].equals(target)){
            stocks[i] = stocks[i] + amount;
            System.out.println("Item restocked successfully");
            item_found = true;
            break;
        }
    }
    if(!item_found){
        System.out.println("Item not found");
    }
}
<<<<<<< HEAD
=======
    /* *
    * Prints inventory of store by looping through the parallel arrays
    * @param names Array of item names
    * @param prices Array of item prices
    * @param stocks Array of stock inventory
    */
    public static void printInventory(String[] names, double[] prices, int[] stocks) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.println("Item: " + names[i] + " Price: $" + prices[i] + " Stock: " + stocks[i]);
            }
        }
    }
>>>>>>> main
>>>>>>> 57826049a4d64e46e947e9ebb9d961915f9598e4
}