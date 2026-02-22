import java.util.Arrays;
import java.util.Scanner;

public class Unit_2_Static_Q4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       String s = sc.nextLine();
       int n = s.length();
       char arr[] = s.toCharArray();
       
       
       System.out.print(Arrays.toString(arr));
    }
}
