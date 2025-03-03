package taskmanagementsystem;

import java.util.Scanner;

public class TaskManagementSystem {

    public static void main(String[] args) {
        TaskManage taskmanage = new TaskManage();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("==========================");
            System.out.println(" Task Management System");
            System.out.println("==========================");
            System.out.println("1. Add a Task");
            System.out.println("2. View All Tasks");
            System.out.println("3. Delete a Task");
            System.out.println("4. Edit a Task");
            System.out.println("5. Mark Task as Complete");
            System.out.println("6. Exit");
            System.out.println("==========================");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            System.out.println("==========================");

            switch (choice) {
                case 1:
                    taskmanage.addTask();
                    break;
                case 2:
                    taskmanage.viewAllTasks();
                    break;
                case 3:
                    taskmanage.deleteTask();
                    break;
                case 4:
                    taskmanage.editTask();
                    break;
                case 5:
                    taskmanage.markTaskComplete();
                    break;
                case 6:
                    System.out.println("Thank you for using Task Management System. Goodbye!");
                    sc.close(); 
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
