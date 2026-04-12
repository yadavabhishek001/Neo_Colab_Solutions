public class Unit4_Lec27_Q5 { // Doubt-2
    static int sum(int x){
        if(x == 0) return 1;
        try {
            return -1;
        } 
        finally {
            return 2;
        }
    }
    public static void main(String[] args) {
        System.out.println(sum(0));
    }
}
