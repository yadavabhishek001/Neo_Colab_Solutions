import java.util.Scanner;

class NumberProcessorLogic {

    static class NegativeNumberException extends Exception {
        public NegativeNumberException(String message) {
            super(message);
        }
    }

    public static int processInput(int n) throws NegativeNumberException {
        if (n < 0) {
            throw new NegativeNumberException(n + " is negative");
        }
        return n * 2;
    }
}

class Unit4_Static_Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int num = scanner.nextInt();
            int result = NumberProcessorLogic.processInput(num);
            System.out.print("Value is Doubled: " + result);
        } catch (NumberProcessorLogic.NegativeNumberException ex) {
            System.out.print("Exception occurred: " + ex.getMessage());
        } finally {
            scanner.close();
        }
    }
}