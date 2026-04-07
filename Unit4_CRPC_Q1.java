import java.util.Scanner;

class InvalidCreditCardException extends Exception {
    public InvalidCreditCardException(String msg) {
        super(msg);
    }
}

class Unit4_CRPC_Q1 {
    public static void validate(String s) throws InvalidCreditCardException {
        if (s.length() != 16) {
            throw new InvalidCreditCardException("Invalid credit card number length.");
        }
        if (!s.matches("\\d+")) {
            throw new InvalidCreditCardException("Invalid credit card number format.");
        }
        System.out.println("Information updated successfully");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        try {
            validate(s);
        } catch (InvalidCreditCardException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
