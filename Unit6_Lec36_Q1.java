import java.util.ArrayList;

public class Unit6_Lec36_Q1 {

    public static void main(String[] args) {

        // Creating a generic ArrayList of String type
        ArrayList<String> names = new ArrayList<>();

        // Adding elements
        names.add("Alice");
        names.add("Bob");

        // Printing the list
        System.out.println(names);

        // Accessing elements
        System.out.println("First Name: " + names.get(0));

        // Looping through the list
        System.out.println("All Names:");
        for (String name : names) {
            System.out.println(name);
        }

        // Removing an element
        names.remove("Bob");

        // Printing updated list
        System.out.println("Updated List: " + names);
    }
}