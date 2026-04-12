public class Unit4_Lec27_Q4 { // Doubt-1
    static int sum(int x){
        try {
            if(x == 0) return 1;
        } 
        finally {
            return 2;
        }
    }
    public static void main(String[] args) {
        System.out.println(sum(0));
    }
}
