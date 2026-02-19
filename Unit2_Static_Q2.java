import java.util.Scanner;

public class Unit2_Static_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        
        int sum = 0;
        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        
        int count = sum;
        for(int i =0; i<n ; i++){
            if( count - arr[i] < arr[i]){
                System.out.print(arr[i] + " ");
            }
            count = count - arr[i];
        }
    }
}
