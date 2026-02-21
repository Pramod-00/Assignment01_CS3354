/**
 * Grocery Management System
 * 
 * It is an inventory program that uses arrays to store item names and stock quantities. 
 * User can can view inventory and restock items through method calls.
 * 
 * This java program demonstrates loops, arrays, conditional logic, and basic user interactions.
 */

public class GroceryManagementSystem{
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
}