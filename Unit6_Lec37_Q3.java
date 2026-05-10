import java.util.ArrayDeque;

public class Unit6_Lec37_Q3 {
    public static void main(String[] args) {

        ArrayDeque<String> tasks = new ArrayDeque<>();

        // Adding elements to queue
        tasks.offer("Task 1");
        tasks.offer("Task 2");
        tasks.offer("Task 3");

        // Removing first element
        System.out.println("Processing: " + tasks.poll());

        // Remaining elements
        System.out.println("Remaining tasks: " + tasks);
    }
}
