import java.util.Scanner;
class Lecture_13_Q2 {
    int number;
    
    Lecture_13_Q2(int number){
        this.number = number;
    }
    
    void displayPalindromeCheckResult(){
        int reversed = 0;
        int temp = number;
        
        while(temp>0){
            int rem = temp % 10;
            reversed = reversed * 10 + rem;
            temp = temp / 10;
        }
        
        if(reversed == number){
            System.out.println(number + " is a Palindrome");
        }
        else{
            System.out.println(number + " is not a Palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = scanner.nextInt();

        Lecture_13_Q2 palindromeChecker = new Lecture_13_Q2(inputNumber);

        palindromeChecker.displayPalindromeCheckResult();

        scanner.close();
    }
}

