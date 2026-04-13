public class Unit4_Lec28_Q4 { // Doubt - 4
    static class InvalidInputException extends Exception {}
    static class InvalidOperationException extends Exception {}

    public static void main(String[] args) {
        try {
            if (Math.random() > 0.5) {
                throw new InvalidInputException();
            } else {
                throw new InvalidOperationException();
            }
        } 
        catch (InvalidInputException | InvalidOperationException e) {
            System.out.println("Handled: " + e.getClass().getSimpleName());
        }
    }
}
