public class Unit4_Lec27_Q2 {
    public static void main(String[] args) {
        int a = 0;
        try {
            a = 10 / 0;
            System.out.println("heloo");
        } catch (Exception e) {
            System.out.println("Exception Caught");
        }
        System.out.println(a);
    }
}
