import java.util.*;

class Unit4_CRPC_Q3 {

    public static void solve(double a, double b, double c) {
        double d = b*b - 4*a*c;

        if (d < 0) {
            throw new IllegalArgumentException("Error: Discriminant is negative. The equation has no real roots.");
        }

        double r1 = (-b + Math.sqrt(d)) / (2*a);
        double r2 = (-b - Math.sqrt(d)) / (2*a);

        System.out.printf("Root 1: %.1f\n", r1);
        System.out.printf("Root 2: %.1f\n", r2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        try {
            solve(a, b, c);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}