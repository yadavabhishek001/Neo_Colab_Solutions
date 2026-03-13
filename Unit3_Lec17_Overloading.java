public class Unit3_Lec17_Overloading {
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        int a = 6, b = 90;
        double c = 12.12, d = 23.12;

        System.out.println(add(a, b));
        System.out.println(add(c, d));
    }
}
