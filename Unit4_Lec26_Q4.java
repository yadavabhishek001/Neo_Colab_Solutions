public class Unit4_Lec26_Q4 {
    public static void main(String[] args) {
        int age = -1;

        assert age > 0 : "Age cannot be negative";

        System.out.println("Valid age: " + age);
    }
}