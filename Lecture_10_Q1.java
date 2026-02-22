import java.util.Scanner;
enum Day{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}
public class Lecture_10_Q1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next().toUpperCase();
        Day today = null;
        
        for(Day d : Day.values()){
            if( d.name().equals(s)){
                today = d;
                break;
            }
        }
        
        if(today == null){
            System.out.print("Invalid Input");
            return;
        }
        
        switch(today){
            case MONDAY:
                System.out.print(Day.TUESDAY);
                break;
            case TUESDAY:
                System.out.print(Day.WEDNESDAY);
                break;
            case WEDNESDAY:
                System.out.print(Day.THURSDAY);
                break;
            case THURSDAY:
                System.out.print(Day.FRIDAY);
                break;
            case FRIDAY:
                System.out.print(Day.SATURDAY);
                break;
            case SATURDAY:
                System.out.print(Day.SUNDAY);
                break;
            case SUNDAY:
                System.out.print(Day.MONDAY);
                break;
        }
    }
}
