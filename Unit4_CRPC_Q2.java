import java.util.*;
import java.time.*;
import java.time.format.*;

class DateUtil {
    public static String getDay(String date) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate d = LocalDate.parse(date, f);
        String day = d.getDayOfWeek().toString();
        return day.charAt(0) + day.substring(1).toLowerCase();
    }

    public static int getSum(String date) {
        int sum = 0;
        for (char ch : date.toCharArray()) {
            if (Character.isDigit(ch)) sum += ch - '0';
        }
        return sum;
    }
}

class Unit4_CRPC_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();

        System.out.println(date + " is a " + DateUtil.getDay(date));
        System.out.println("The sum of the digits of your birth date is: " + DateUtil.getSum(date));

        sc.close();
    }
}