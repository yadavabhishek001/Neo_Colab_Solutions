class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class Unit4_Lec26_Q2 {
    public static void main(String[] args) {
        try {
            throw new CustomException("Something went wrong");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}