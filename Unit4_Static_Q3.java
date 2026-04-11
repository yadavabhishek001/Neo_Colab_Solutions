import java.util.InputMismatchException;
import java.util.Scanner;

class PhoneNumberValidatorLogic {

    public static void validate(String input) {
        if (!input.matches("\\d+")) {
            throw new InputMismatchException("Error: Input mismatch. Please enter a valid 10-digit phone number.");
        }
        if (input.length() != 10) {
            throw new IllegalArgumentException("Error: Invalid phone number: Must be a 10-digit number.");
        }
    }
}

class PhoneNumberValidatorHandler {

    public void handleValidation() {
        Scanner sc = new Scanner(System.in);
        try {
            String input = sc.nextLine();
            PhoneNumberValidatorLogic.validate(input);
            System.out.print("Valid");
        } catch (InputMismatchException e) {
            System.out.print(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.print(e.getMessage());
        } finally {
            sc.close();
        }
    }
}

class Unit4_Static_Q3 {
    public static void main(String[] args) {
        PhoneNumberValidatorHandler validatorHandler = new PhoneNumberValidatorHandler();
        validatorHandler.handleValidation();
    }
}