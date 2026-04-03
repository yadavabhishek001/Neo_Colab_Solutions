import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class FormatDateExample {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        System.out.println(LocalDate.now().format(formatter));
    }
}
