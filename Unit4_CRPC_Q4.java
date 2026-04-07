import java.util.*;

class Unit4_CRPC_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        try {
            String[] input = sc.nextLine().split(" ");

            if (input.length > n) {
                throw new ArrayIndexOutOfBoundsException("Input elements exceeds array size");
            }

            int[] arr = new int[n];

            for (int i = 0; i < input.length; i++) {
                int val = Integer.parseInt(input[i]);

                if (val <= 0) {
                    throw new IllegalArgumentException("Only positive integers are allowed");
                }

                arr[i] = val;
            }

            System.out.print("Array: ");
            for (int i = 0; i < input.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("Program executed successfully!");
            sc.close();
        }
    }
}