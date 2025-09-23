package Practice.JavaArrayListExploration;

import java.util.Scanner;
import java.util.ArrayList;

public class ToDoListManager {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> toDoList = new ArrayList<String>();
        int task = 0;
        while (task != 7) {
            System.out.println(
                    "\n\nTo-Do List Manager\n1. Add Task\n2. View Tasks\n3. Remove Task\n4. Clear All Tasks\n5. Search Task\n6. Size of List\n7. Exit ");
            System.out.print("Choose an option: ");
            try {
                task = sc.nextInt();
                sc.nextLine();
            } catch (Exception e) {
                printCustom("Invalid input. Please enter a number.");
                sc.nextLine(); // Clear the invalid input
                continue;
            }
            switch (task) {
                case 1:
                    printCustom("Enter task to add:");
                    String newTask = sc.nextLine();
                    toDoList.add(newTask);
                    printCustom("\nTask added.");
                    break;
                case 2:
                    printCustom("\nYour Tasks");
                    for (int i = 0; i < toDoList.size(); i++) {
                        printCustom((i + 1) + ". " + toDoList.get(i));
                    }
                    break;
                case 3:
                    printCustom("Enter task number to remove: ");
                    try {
                        int taskNumber = sc.nextInt();
                        if (taskNumber > 0 && taskNumber <= toDoList.size()) {
                            toDoList.remove(taskNumber - 1);
                            printCustom("\nTask removed.");
                        }
                        break;
                    } catch (Exception e) {
                        printCustom("Invalid input. Please enter a number.");
                        sc.nextLine(); // Clear the invalid input
                    }
                case 4:
                    toDoList.clear();
                    printCustom("All tasks cleared.");
                    break;
                case 5:
                    printCustom("Enter task to search: ");
                    String searchTask = sc.nextLine();
                    if (toDoList.contains(searchTask)) {
                        printCustom("Task found: " + searchTask);
                    } else {
                        printCustom("Task not found.");
                    }
                    break;
                case 6:
                    if (toDoList.isEmpty()) {
                        printCustom("To-Do List is empty.");
                    } else {
                        printCustom("The To Do List has " + toDoList.size() + " tasks.");
                    }
                    break;
                case 7:
                    printCustom("Exiting...");
                    break;
                default:
                    printCustom("Invalid option. Please try again.");
            }
        }
        sc.close();
    }
}