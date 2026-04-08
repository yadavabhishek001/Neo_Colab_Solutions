import java.util.*;

class Unit4_CRPC_Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int divisor = sc.nextInt();

        class Bonus {
            int q() { return total / divisor; }
            int r() { return total % divisor; }
            int s() { return (r() > 0.1 * divisor) ? 1 : 0; }
        }

        Bonus b = new Bonus();

        System.out.println("Divisor : " + divisor);
        System.out.println("Remainder : " + b.r());
        System.out.println("Quotient : " + b.q());
        System.out.println("Significance Score : " + b.s());

        sc.close();
    }
}