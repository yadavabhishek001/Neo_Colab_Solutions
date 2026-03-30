import java.util.*;

class TestSorting {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Mango");

        // Sort using lambda
        list.sort((a, b) -> a.compareTo(b));

        System.out.println(list);
    }
}
