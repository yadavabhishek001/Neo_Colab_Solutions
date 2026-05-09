import java.util.HashMap;

public class Unit6_Lec37_Q2 {
     public static void main(String[] args) {

        HashMap<Integer, String> employees = new HashMap<>();

        employees.put(101, "Alice");
        employees.put(102, "Bob");
        employees.put(103, "Charlie");

        // Using entrySet()
        for (var entry : employees.entrySet()) {

            int id = entry.getKey();
            String name = entry.getValue();

            System.out.println("ID: " + id + ", Name: " + name);
        }
    }
}
