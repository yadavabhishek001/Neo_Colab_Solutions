import java.util.Scanner;

public class Unit_2_Static_Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        int n = s.length();
        
        int count = 1;
        String s1 = "";
        
        for(int i = 0; i<n ; i++){
            if(s.charAt(i) == ' '){
                count++;
            }
        }
        
        if(count == 1){
            for(int i = n-1; i>=0 ; i--){
                s1 = s1 + s.charAt(i);
            }
            System.out.println(s1);
        }
        else if(count == 2){
            s = s.replace(" ","");
            System.out.println(s);
        }
        else{
            System.out.println("Invalid input");
        } 
    }
}
