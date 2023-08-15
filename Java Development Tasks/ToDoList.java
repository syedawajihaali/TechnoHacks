import java.util.ArrayList;
import java.util.Scanner;
public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        ArrayList<Boolean> completed = new ArrayList<>();
        int choice,n;
        Scanner s = new Scanner(System.in);
        while (true) {
        System.out.println("To-Do List");
        System.out.println("==========");
        System.out.println("1. Add Tasks");
        System.out.println("2. Mark Task as Completed");
        System.out.println("3. View Tasks");
        System.out.println("4. Remove Tasks");
        System.out.println("5. Exit");
        System.out.println("Select an option (1-5):");
        choice = s.nextInt();
        s.nextLine();
        switch (choice) {
            case 1:
                System.out.println("How many tasks do you want to add?");
                n = s.nextInt();
                s.nextLine();
                for(int i=0;i<n;i++){
                    System.out.print("Enter task "+(i+1)+" description: ");
                    String Add = s.nextLine();
                    tasks.add(Add);
                    completed.add(false);
                    System.out.println("Task added: \"" + Add + "\"");
                }
                break;
            case 2:
                if (tasks.isEmpty()) {
                    System.out.println("No tasks to mark as completed.");
                } else {
                    System.out.println("Tasks:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        if (completed.get(i)) {
                            System.out.print("[\u2713] ");
                        } else {
                            System.out.print("[ ] ");
                        }
                        System.out.println(tasks.get(i));
                    }
                    System.out.print("Enter the task number to mark as completed: ");
                    int Mark = s.nextInt();
                    if (Mark >= 1 && Mark <= tasks.size()) {
                        completed.set(Mark - 1, true);
                        System.out.println("Task marked as completed.");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    s.nextLine();
                }
                break;
            case 3:
                if (tasks.isEmpty()) {
                    System.out.println("No tasks to view.");
                } else {
                    System.out.println("Tasks:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        if (completed.get(i)) {
                            System.out.print("[X] ");
                        } else {
                            System.out.print("[ ] ");
                        }
                        System.out.println(tasks.get(i));
                    }
                }
                break;
            case 4:
                if (tasks.isEmpty()) {
                    System.out.println("No tasks to remove.");
                } else {
                    System.out.println("Tasks:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                    System.out.print("Enter the task number to remove: ");
                    int Remove = s.nextInt();
                    if (Remove >= 1 && Remove <= tasks.size()) {
                        String  Removed = tasks.remove(Remove - 1);
                        System.out.println("Task removed: \"" + Removed + "\"");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    s.nextLine(); // Consume newline
                }
                break;
            case 5:
                    System.out.println("Exiting!");
                    s.close();
                    System.exit(0);
                    break; 
            default:
                System.out.println("Invalid Option! Please Select Again:");
                break;
        }
        
        }
    }
}
        
    


