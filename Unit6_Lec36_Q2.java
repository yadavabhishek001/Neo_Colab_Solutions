import java.util.ArrayList;

public class Unit6_Lec36_Q2 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);

        int sum = numbers.get(0) + numbers.get(1);

        System.out.println("Sum: " + sum);
    }
}