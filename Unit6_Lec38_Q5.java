import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Unit6_Lec38_Q5 {
    public static void main(String[] args) {

        String sql = "DELETE FROM employees WHERE id = ?";

        try (
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/demo",
                "root",
                "password"
            );

            PreparedStatement pstmt = conn.prepareStatement(sql)
        ) {

            pstmt.setInt(1, 101);

            int rowsDeleted = pstmt.executeUpdate();

            System.out.println(rowsDeleted + " row(s) deleted.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
