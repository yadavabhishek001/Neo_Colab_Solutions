import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Unit4_Lec28_Q1 {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("nonexistent.txt");
            Connection conn = DriverManager.getConnection("invalid-url");
        } catch (IOException | SQLException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
