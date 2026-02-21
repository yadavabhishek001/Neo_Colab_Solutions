import java.util.Scanner;

public class Lecture_15_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i<n ; i++){
            char ch = s.charAt(i);
            
            if(sb.indexOf(String.valueOf(ch)) == -1){
                sb.append(ch);
            }
        }
        
        System.out.println(sb.toString());
        
    }
}
