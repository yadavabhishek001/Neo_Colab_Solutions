import java.util.HashMap;

public class Unit6_Lec37_Q1 {
    public static void main(String[] args) {

        HashMap<Integer, String> employees = new HashMap<>();

        employees.put(101, "Alice");
        employees.put(102, "Bob");
        employees.put(103, "Charlie");

        System.out.println("Employee with ID 102: " + employees.get(102));

        employees.remove(101);

        System.out.println("All Employees: " + employees);
    }
}
