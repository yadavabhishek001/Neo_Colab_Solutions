import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Unit6_Lec38_Q4{
    public static void main(String[] args) {

        String sql = "UPDATE employees SET salary = ? WHERE id = ?";

        try (
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/demo",
                "root",
                "password"
            );

            PreparedStatement pstmt = conn.prepareStatement(sql)
        ) {

            pstmt.setDouble(1, 70000.0);
            pstmt.setInt(2, 101);

            int rowsUpdated = pstmt.executeUpdate();

            System.out.println(rowsUpdated + " row(s) updated.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}