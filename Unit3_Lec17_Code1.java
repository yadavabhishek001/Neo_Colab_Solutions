import java.util.Scanner;
class Calculator {
    int add(int a, int b){
        return a + b;
    }

    int subtract(int a, int b){
        return a - b;
    }
}

class AdvancedCalculator extends Calculator {
    int multiply(int a, int b){
        return a * b;
    }
}

public class Unit3_Lec17_Code1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AdvancedCalculator calculator = new AdvancedCalculator();

        int choice = scanner.nextInt();

        if (choice < 1 || choice > 3) {
            System.out.println("Invalid");
            return;
        }

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int result;

        if (choice == 1) {
            result = calculator.add(num1, num2);
            System.out.println("Addition: " + result);
        } else if (choice == 2) {
            result = calculator.subtract(num1, num2);
            System.out.println("Subtraction: " + result);
        } else {
            result = calculator.multiply(num1, num2);
            System.out.println("Multiplication: " + result);
        }
    }
}
