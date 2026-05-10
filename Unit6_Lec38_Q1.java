import java.sql.Connection;
import java.sql.DriverManager;

public class Unit6_Lec38_Q1 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String password = "password";

        try (Connection conn =
                     DriverManager.getConnection(url, user, password)) {

            System.out.println("Connected to the database!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
