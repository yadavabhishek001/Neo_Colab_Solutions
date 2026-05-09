import java.util.Comparator;
import java.util.TreeSet;

public class Unit6_Lec36_Q6 {
    public static void main(String[] args) {

        // TreeSet with descending order
        TreeSet<Integer> set =
                new TreeSet<>(Comparator.reverseOrder());

        set.add(10);
        set.add(5);
        set.add(20);

        System.out.println(set); // [20, 10, 5]
    }
}