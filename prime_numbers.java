import java.util.Scanner;
// Lecture - 9 , code_1
public class prime_numbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean x = false;
        for(int i = a; i<=b ; i++){
            if(i<2) continue;
            x = false;
            for(int j = 2; j<i ; j++){
                if(i % j == 0){
                    x = true;
                    break;
                }
            }
            if(!x){
                System.out.print(i + " ");
            }
        }
    }
}
