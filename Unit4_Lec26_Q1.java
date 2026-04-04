class Unit4_Lec26_Q1 {
    public static void main(String[] args) {
        int result = 0;
        try {
            result = 10 / 0; // causes ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Cleanup code executed.");
        }
        System.out.println(result);
    }
}
