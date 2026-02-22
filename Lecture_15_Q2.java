import java.util.Scanner;

public class Lecture_15_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        for(int i = 0; i<s.length() ; i++){
            if(s.charAt(i) == ' '){
                s = s.replace(" ","[space]");
            }
        }
        
        StringBuilder sb = new StringBuilder(s);
        System.out.print(sb.toString());
    }
}
