import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class Unit4_Lec28_Q5 {
    public static void main(String[] args) {
        try {
            Files.readAllBytes(Paths.get("file.txt"));
            Integer.parseInt("abc");
        } 
        catch (IOException | NumberFormatException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
