import java.util.Scanner;

public class Lecture_9_Q3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int count = 0;
        int prod = 1;
        while( n>0 ){
            int rem = n % 10;
            if(rem % 2 != 0){
                count++;
                prod = prod * rem;
            }
            n = n/10;
        }
        if(count == 0){
            System.out.println("No odd digits found");
        }
        else{
            System.out.println(prod);
        }
        sc.close();
    }
}
