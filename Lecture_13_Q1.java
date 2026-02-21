import java.util.Scanner;
public class Lecture_13_Q1 {
    private int count = 0;
    
    public void increment(){
        this.count++;
    }
    public int getCount(){
        return this.count;
    }
}
class MainApp {
    public static void main(String[] args) {
        Lecture_13_Q1 counter = new Lecture_13_Q1();
        Scanner scanner = new Scanner(System.in);
        int numIncrements = scanner.nextInt();

        for (int i = 0; i < numIncrements; i++) {
            counter.increment();
        }

        System.out.println("Final Count: " + counter.getCount());
    }
}
