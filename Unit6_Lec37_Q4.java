import java.util.ArrayDeque;

public class Unit6_Lec37_Q4 {
    public static void main(String[] args) {

        ArrayDeque<Character> stack = new ArrayDeque<>();

        String str = "Hello";

        // Push characters into stack
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        // Pop characters from stack
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
