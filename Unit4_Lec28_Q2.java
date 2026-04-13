public class Unit4_Lec28_Q2 {
    public static void main(String[] args) {
        try {
            try {
                int result = 10/0;
            } catch (ArithmeticException | NullPointerException e) {
                System.out.println("Inner block: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Outer block: General exception.");
        }
    }
}
