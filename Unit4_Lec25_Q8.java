import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class ParseDateExample {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate parsedDate = LocalDate.parse("2025-01-13", formatter);
        System.out.println(parsedDate);
    }
}