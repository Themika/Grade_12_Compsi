package Assighnments.Assignment_1;

import java.util.ArrayList;
import java.util.Scanner;

/* 
 * Author: Themika
 * Date: 2023-09-25
 * Course: Grade 12 Computer Science
 * Assignment: 1 Personal Tracker App
 * This is a simple inventory management system. 
 * It allows users to add, remove, update, check expired items, search, and sort items in the inventory.
 * Each item has a name, quantity, and expiration date.
 * The program uses ArrayLists to store item details and provides a menu-driven interface for user interaction.
 */

public class Assignment_1 {
    //Prints a message to the console with a typing effect (character-by-character delay)
    private static void printCustom(String message) {
        for (char c : message.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }

    private static void printItemHeader() {
        // Print table header for item display 
        // Print column headers for item name, quantity, and expiration date
        System.out.printf("%-20s %-10s %-15s\n", "Item Name", "Quantity", "Expiration Date");
        System.out.println("----------------------------------------------------------");
    }

    private static void printItemRow(String item, String quantity, String expirationDate) {
        System.out.printf("%-20s %-10s %-15s\n", item, quantity, expirationDate);
    }

    private static void AddItem(String item, String quantity, String expirationDate, ArrayList<String> items, ArrayList<String> quantities, ArrayList<String> expirationDates) {
        printCustom("\nItem added successfully:\n");
        printItemHeader();
        printItemRow(item, quantity, expirationDate);
        items.add(item);
        quantities.add(quantity);
        expirationDates.add(expirationDate);
        System.out.println();
    }

    /*
     * Removes an item from the inventory lists by name and prints confirmation.
     */
    private static void RemoveItem(String item, ArrayList<String> items, ArrayList<String> quantities, ArrayList<String> expirationDates) {
        int index = -1;
        // Find the index of the item to remove
        for (int i = 0; i < items.size(); i++) {
            // Case-insensitive comparison
            if (items.get(i).equalsIgnoreCase(item)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            printCustom("\nItem removed successfully:\n");
            printItemHeader();
            printItemRow(items.get(index), quantities.get(index), expirationDates.get(index));
            items.remove(index);
            quantities.remove(index);
            expirationDates.remove(index);
            System.out.println();
        } else {
            printCustom("\nItem not found: " + item + "\n");
        }
    }

    /**
     * Updates the details of an existing item in the inventory.
     * Allows updating name, quantity, or expiration date.
     */
    private static void UpdateItem(String oldItem, ArrayList<String> items, ArrayList<String> quantities, ArrayList<String> expirationDates, Scanner sc) {
        int index = -1;
        // Find the index of the item to update
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equalsIgnoreCase(oldItem)) {
                index = i;
                break;
            }
        }
        // If item not found, print message and return
        if (index == -1) {
            printCustom("\nItem not found: " + oldItem + "\n");
            return;
        }
        while (true) {
            printCustom("\nWhat do you want to update?\n1. Name\n2. Quantity\n3. Expiration Date\n4. Exit\nEnter choice: ");
            int choice = -1;
            // Validate choice input
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine();
            } else {
                printCustom("Invalid input. Please enter a number.");
                sc.nextLine();
                continue;
            }
            switch (choice) {
                case 1:
                    // Update item name
                    printCustom("Enter new item name: ");
                    String newName = sc.nextLine();
                    items.set(index, newName);
                    printCustom("Item name updated from '" + oldItem + "' to '" + newName + "'.\n");
                    oldItem = newName;
                    break;
                case 2:
                    // Update item quantity
                    printCustom("Enter new quantity: ");
                    String newQuantity = sc.nextLine();
                    quantities.set(index, newQuantity);
                    printCustom("Quantity updated for '" + items.get(index) + "' to " + newQuantity + ".\n");
                    break;
                case 3:
                    // Update expiration date
                    printCustom("Enter new expiration date (YYYY-MM-DD): ");
                    String newDate = sc.nextLine();
                    expirationDates.set(index, newDate);
                    printCustom("Expiration date updated for '" + items.get(index) + "' to " + newDate + ".\n");
                    break;
                case 4:
                    // Exit update menu
                    printCustom("Update Done.\n");
                    return;
                default:
                    // Handle invalid choice
                    printCustom("Invalid choice\n");
                    break;
            }
        }
    }

    /**
     * Checks for expired items in the inventory and prints them.
     * Expired items are those with expiration dates before today.
     */
    private static void CheckExpiredItem(ArrayList<String> items, ArrayList<String> quantities, ArrayList<String> expirationDates) {
        String today = java.time.LocalDate.now().toString();
        printCustom("\nExpired Items Check:");
        printItemHeader();
        // Flag to track if any expired items are found
        boolean foundExpired = false;
        for (int i = 0; i < expirationDates.size(); i++) {
            // Compare dates as strings in YYYY-MM-DD format
            if (expirationDates.get(i).compareTo(today) < 0) {
                // Item is expired
                printItemRow(items.get(i), quantities.get(i), expirationDates.get(i) + " (EXPIRED)");
                foundExpired = true;
            }
        }
        // If no expired items found, print message
        if (!foundExpired) {
            //  No expired items found
            printCustom("No expired items found.\n");
        }
        System.out.println();
    }

    /**
     * Searches for an item by name in the inventory and prints its details if found.
     */
    private static void SearchItem(String item, ArrayList<String> items, ArrayList<String> quantities, ArrayList<String> expirationDates) {
        printCustom("\nSearching for item: " + item);
        // Find the index of the item
        int index = -1;
        // Case-insensitive search
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equalsIgnoreCase(item)) {
                index = i;
                break;
            }
        }
        //  If item found, print details; otherwise, print not found message
        if (index != -1) {
            // Item found
            printCustom("Item found:\n");
            printItemHeader();
            printItemRow(items.get(index), quantities.get(index), expirationDates.get(index));
            System.out.println();
        } else {
            // Item not found
            printCustom("Item not found: " + item + "\n");
        }
    }

    /*
     * Sorts the inventory lists by the specified criteria ("name", "quantity", or "expiration").
     * Sorting keeps the lists synchronized so item details remain matched.
     * Prints the sorted items after sorting.
     * Simple bubble sort for sorting items by name, quantity, or expiration date
    */
    private static void SortItems(ArrayList<String> items, ArrayList<String> quantities, ArrayList<String> expirationDates, String criteria) {
        printCustom("\nSorting items by " + criteria + "...\n");
        // Simple bubble sort for sorting items by name, quantity, or expiration date
        int n = items.size();
        // Bubble sort algorithm
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Determine if a swap is needed based on the sorting criteria
                boolean shouldSwap = false;
                // Compare based on criteria
                if (criteria.equals("name")) {
                    // Case-insensitive comparison for names
                    if (items.get(j).compareToIgnoreCase(items.get(j + 1)) > 0) {
                        shouldSwap = true;
                    }
                } else if (criteria.equals("quantity")) {
                    // Compare quantities as integers
                    int q1 = Integer.parseInt(quantities.get(j));
                    int q2 = Integer.parseInt(quantities.get(j + 1));
                    // Swap if the first quantity is greater than the second
                    if (q1 > q2) {
                        shouldSwap = true;
                    }
                } else if (criteria.equals("expiration")) {
                    // Compare expiration dates as strings in YYYY-MM-DD format
                    if (expirationDates.get(j).compareTo(expirationDates.get(j + 1)) > 0) {
                        shouldSwap = true;
                    }
                }
                if (shouldSwap) {
                    // Swap all three lists to keep data together
                    String tempItem = items.get(j);
                    items.set(j, items.get(j + 1));
                    items.set(j + 1, tempItem);
                    // Swap quantities
                    String tempQuantity = quantities.get(j);
                    quantities.set(j, quantities.get(j + 1));
                    quantities.set(j + 1, tempQuantity);
                    // Swap expiration dates
                    String tempDate = expirationDates.get(j);
                    expirationDates.set(j, expirationDates.get(j + 1));
                    expirationDates.set(j + 1, tempDate);
                }
            }
        }
        printCustom("Sorted Items:");
        printItemHeader();
        // Print all sorted items
        for (int i = 0; i < items.size(); i++) {
            printItemRow(items.get(i), quantities.get(i), expirationDates.get(i));
        }
        System.out.println();
    }

    // Prints all items currently in the inventory.
    private static void printAllItems(ArrayList<String> items, ArrayList<String> quantities, ArrayList<String> expirationDates) {
        printCustom("\nCurrent Inventory:");
        printItemHeader();
        for (int i = 0; i < items.size(); i++) {
            printItemRow(items.get(i), quantities.get(i), expirationDates.get(i));
        }
        System.out.println();
    }

    /*
     * Main method: Entry point for the inventory management system.
     * Initializes sample data and provides a menu-driven interface for user interaction.
     * Users can add, remove, update, check expired items, search, and sort items.
     */
    public static void main(String[] args) {
        // Initialize lists to store item details
        ArrayList<String> items = new ArrayList<>();
        ArrayList<String> quantities = new ArrayList<>();
        ArrayList<String> expirationDates = new ArrayList<>();

        // Add sample items to inventory
        items.add("Milk");
        quantities.add("10");
        expirationDates.add("2023-10-01");
        items.add("Bread");
        quantities.add("20");
        expirationDates.add("2023-09-15");
        items.add("Eggs");
        quantities.add("30");
        expirationDates.add("2023-09-20");

        Scanner sc = new Scanner(System.in);
        int selection = 0;

        // Main menu loop
        while (selection != 7) {
            try {
                // Display menu options
                printCustom("========== Inventory Menu ==========");
                printCustom("1. Add Item");
                printCustom("2. Remove Item");
                printCustom("3. Update Item");
                printCustom("4. Check Expired Items");
                printCustom("5. Search Item");
                printCustom("6. Sort Items");
                printCustom("7. Exit");
                printCustom("====================================");
                printCustom("Enter your choice: ");

                // Validate menu selection input
                if (!sc.hasNextInt()) {
                    printCustom("Invalid input. Please enter a number.\n");
                    sc.nextLine();
                    continue;
                }
                selection = sc.nextInt();
                sc.nextLine();

                switch (selection) {
                    case 1:
                        // Add new item
                        printCustom("\nEnter item name: ");
                        String itemName = sc.nextLine();
                        int quantity = -1;
                        // Validate quantity input
                        while (true) {
                            printCustom("Enter quantity: ");
                            // Validate quantity input
                            if (sc.hasNextInt()) {
                                quantity = sc.nextInt();
                                sc.nextLine();
                                if (quantity > 0) break;
                                else printCustom("Quantity must be positive.");
                            } else {
                                // Handle invalid input
                                printCustom("Invalid input. Please enter a number.");
                                sc.nextLine();
                            }
                        }
                        String expirationDate = "";
                        // Validate expiration date format
                        while (true) {
                            // Prompt for expiration date
                            printCustom("Enter expiration date (YYYY-MM-DD): ");
                            expirationDate = sc.nextLine();
                            // Simple regex to check date format YYYY-MM-DD(Checking for 4 digits then hyphen, 2 digits, hyphen, 2 digits)
                            if (expirationDate.matches("\\d{4}-\\d{2}-\\d{2}")) {
                                break;
                            } else {
                                printCustom("Invalid date format. Use YYYY-MM-DD.");
                            }
                        }
                        // Add item if name is not empty
                        if (!itemName.isEmpty()) {
                            AddItem(itemName, String.valueOf(quantity), expirationDate, items, quantities, expirationDates);
                        } else {
                            printCustom("Item name is required. Item not added.\n");
                        }
                        break;
                    case 2:
                        // Remove item
                        printCustom("\nWould you like to see current items before removing? (yes/no): ");
                        String seeCurrentItems = sc.nextLine().toLowerCase();
                        // Show current items if user wants to
                        if (seeCurrentItems.equals("yes") || seeCurrentItems.equals("y")) {
                            printAllItems(items, quantities, expirationDates);
                        }
                        // Prompt for item name to remove
                        printCustom("Enter item name to remove: ");
                        String itemToRemove = sc.nextLine();
                        RemoveItem(itemToRemove, items, quantities, expirationDates);
                        break;
                    case 3:
                        // Update item
                        printCustom("\nWould you like to see current items before updating? (yes/no): ");
                        String seeItems = sc.nextLine().toLowerCase();
                        // Show current items if user wants to
                        if (seeItems.equals("yes") || seeItems.equals("y")) {
                            printAllItems(items, quantities, expirationDates);
                        }
                        // Prompt for item name to update
                        printCustom("Enter item name to update: ");
                        String oldItem = sc.nextLine();
                        UpdateItem(oldItem, items, quantities, expirationDates, sc);
                        break;
                    case 4:
                        // Check expired items
                        CheckExpiredItem(items, quantities, expirationDates);
                        break;
                    case 5:
                        // Search for an item
                        printCustom("\nEnter item name to search: ");
                        String item = sc.nextLine();
                        SearchItem(item, items, quantities, expirationDates);
                        break;
                    case 6:
                        // Sort items by criteria
                        printCustom("\nEnter sorting criteria (name/quantity/expiration): ");
                        String criteria = sc.nextLine().toLowerCase();
                        // Validate sorting criteria
                        if (criteria.equals("name") || criteria.equals("quantity") || criteria.equals("expiration")) {
                            SortItems(items, quantities, expirationDates, criteria);
                        } else {
                            printCustom("Invalid sorting criteria.\n");
                        }
                        break;
                    case 7:
                        // Exit program
                        printCustom("\nExiting... Goodbye!\n");
                        break;
                    default:
                        printCustom("Invalid selection. Try again.\n");
                        break;
                }
            } catch (Exception e) {
                // Handle unexpected errors
                printCustom("An error occurred: " + e.getMessage() + "\n");
                if (sc.hasNextLine()) {
                    sc.nextLine();
                }
            }
        }
        sc.close();
    }
}