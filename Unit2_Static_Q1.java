import java.util.Scanner;

public class Unit2_Static_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        
        for(int i = 0; i<s.length() ; i++){
            if(s.charAt(i) == ' '){
                s = s.replace(' ', '#');
            }
        }
        System.out.println("Encoded: " + s);
        
        System.out.print("Decoded: ");
        for(int i = 0; i<s.length() ; i++){
            if(s.charAt(i) == '#'){
                System.out.println();
            }
            else{
                System.out.print(s.charAt(i));
            }
        }
    }
}
