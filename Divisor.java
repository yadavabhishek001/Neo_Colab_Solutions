import java.util.Scanner;

public class Divisor {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int original = n;
        int count = 0;
        while(n>0){
            int rem = n%10;
            if(rem % 2 == 0){
                count++;
            }
            n = n/10;
        }
        if( count == 0 ){
            System.out.println("There are no even digits in the number.");
        }
        else if(original % count == 0 ){
            System.out.println("It is a divisor of the original number.");
        }
        else if(original % count != 0){
            System.out.println("It is not a divisor of the original number.");
        }
    }
}
