import java.util.Calendar;
import java.util.Date;

class CalendarExample {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 5);

        Date futureDate = calendar.getTime();
        System.out.println(futureDate);
    }
}
