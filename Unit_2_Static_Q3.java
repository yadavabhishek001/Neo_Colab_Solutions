import java.util.Scanner;

public class Unit_2_Static_Q3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int sum = 0;
        int max = Integer.MAX_VALUE;
        int count = 0;
        
        for(int i = 0; i<n ; i++){
            int a1 = sc.nextInt();
            
            sum += a1;
            if(a1<0){
                count++;
            }
            max = Math.min(max , a1);
        }

        sum -= max;
        System.out.println(sum);
    }
}
