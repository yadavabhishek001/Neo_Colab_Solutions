public class Unit4_Lec28_Q3 { // Doubt-3
    static class InvalidInputException extends Exception {}
    static class InvalidOperationException extends Exception {}
    public static void main(String[] args) {
        try {
            throw new InvalidInputException();
        } catch (InvalidInputException | InvalidOperationException e) {
            System.out.println("Custom exception handled: " + e.getClass().getSimpleName());
        }
    }
}
