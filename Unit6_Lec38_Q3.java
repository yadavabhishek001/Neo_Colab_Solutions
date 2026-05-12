import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Unit6_Lec38_Q3 {
    public static void main(String[] args) {

        String sql = "SELECT * FROM employees";

        try (
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/demo",
                "root",
                "password"
            );
            
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(sql)
        ) {

            while (rs.next()) {

                System.out.println(
                    "ID: " + rs.getInt("id") +
                    ", Name: " + rs.getString("name") +
                    ", Salary: " + rs.getDouble("salary")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
