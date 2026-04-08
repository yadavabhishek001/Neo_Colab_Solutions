import java.util.Arrays;
import java.util.Scanner;

class WordLengthCalculator {

    public int findMaxLength(String[] words) {
        return Arrays.stream(words)
                .max((a, b) -> a.length() - b.length())
                .get()
                .length();
    }

    public int findMinLength(String[] words) {
        return Arrays.stream(words)
                .min((a, b) -> a.length() - b.length())
                .get()
                .length();
    }
}

class Unit4_CRPC_Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = scanner.nextLine();
        }

        WordLengthCalculator calculator = new WordLengthCalculator();

        int maxLength = calculator.findMaxLength(words);
        int minLength = calculator.findMinLength(words);

        System.out.println(maxLength);
        System.out.println(minLength);

        scanner.close();
    }
}
