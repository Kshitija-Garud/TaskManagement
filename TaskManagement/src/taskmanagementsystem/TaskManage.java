package taskmanagementsystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskManage {

    ArrayList<Task> tasks = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    // 1. Add a Task
    public void addTask() {
        System.out.print("Enter Task Title: ");
        String title = scanner.nextLine();
        
        System.out.print("Enter Task Description: ");
        String description = scanner.nextLine();
        
        System.out.print("Enter Task Due Date (yyyy-MM-dd): ");
        LocalDate dueDate = LocalDate.parse(scanner.nextLine());
        
        System.out.print("Enter Task Priority (HIGH, MEDIUM, LOW): ");
        Priority priority = Priority.valueOf(scanner.nextLine().toUpperCase());  

        tasks.add(new Task(title, description, dueDate, priority, false));
        System.out.println("Task added successfully!\n");
    }

    // 2. View All Tasks
    public void viewAllTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        System.out.println("==========================");
        System.out.println(" All Tasks ");
        System.out.println("==========================");

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println("Task ID: " + (i + 1));
            System.out.println(tasks.get(i));
        }
    }

    // 3. Edit a Task
    public void editTask() {
        System.out.print("Enter the Task ID to edit: ");
        int taskId = scanner.nextInt();
        scanner.nextLine();

        if (taskId <= 0 || taskId > tasks.size()) {
            System.out.println("Invalid Task ID.");
            return;
        }
        
                                 
        Task task = tasks.get(taskId - 1);
        System.out.println("Editing Task: " + task.getTitle());
        
        System.out.print("Enter new title (press Enter to keep current): ");
        String newTitle = scanner.nextLine();
        if (!newTitle.isEmpty())
        {
        	task.setTitle(newTitle);
        }
        System.out.print("Enter new description (press Enter to keep current): ");
        String newDescription = scanner.nextLine();
        if (!newDescription.isEmpty()) 
        {
        	task.setDescription(newDescription);
        }
        System.out.println("Task updated successfully!");
    }

    // 4. Delete a Task
    public void deleteTask() {
        System.out.print("Enter the Task ID to delete: ");
        int taskId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (taskId <= 0 || taskId > tasks.size()) 
        {
            System.out.println("Invalid Task ID.");
            return;
        }

        tasks.remove(taskId - 1);
        System.out.println("Task deleted successfully!");
    }

    // 5. Mark Task as Complete
    public void markTaskComplete() {
        System.out.print("Enter the Task ID to mark as complete: ");
        int taskId = scanner.nextInt();
        scanner.nextLine(); 

        if (taskId <= 0 || taskId > tasks.size())
        {
            System.out.println("Invalid Task ID.");
            return;
        }

        tasks.get(taskId - 1).setComplete(true);
        System.out.println("Task marked as complete successfully!");
    }
}
