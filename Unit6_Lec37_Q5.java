import java.util.ArrayDeque;

public class Unit6_Lec37_Q5 {
    public static void main(String[] args) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.add(10);
        deque.add(20);
        deque.add(30);

        // Iterating through deque
        for (int num : deque) {
            System.out.println(num);
        }
    }
}
