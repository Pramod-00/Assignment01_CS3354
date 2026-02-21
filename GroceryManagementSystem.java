/**
 * Grocery Management System
 * 
 * It is an inventory program that uses arrays to store item names and stock quantities. 
 * User can can view inventory and restock items through method calls.
 * 
 * This java program demonstrates loops, arrays, conditional logic, and basic user interactions.
 */

public class GroceryManagementSystem{
<<<<<<< HEAD

    // Team Members please add methods 

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
}