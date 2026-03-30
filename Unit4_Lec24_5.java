import java.util.*;

class TestMethodReference {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Banana", "Apple", "Mango");

        // Method reference
        list.forEach(System.out::println);
    }
}
