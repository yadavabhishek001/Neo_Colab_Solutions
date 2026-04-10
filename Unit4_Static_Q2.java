import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class DateValidator {

    public static String getDayType(String dateInput) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate date = LocalDate.parse(dateInput, formatter);

        switch (date.getDayOfWeek()) {
            case SATURDAY:
            case SUNDAY:
                return "Weekend";
            default:
                return "Weekday";
        }
    }
}

public class Unit4_Static_Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dateInput = scanner.nextLine();
        String result = DateValidator.getDayType(dateInput);
        System.out.println(dateInput + " is a " + result);
        scanner.close();
    }
}
