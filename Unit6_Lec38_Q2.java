import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Unit6_Lec38_Q2 {
    public static void main(String[] args) {

        String sql =
                "INSERT INTO employees (id, name, salary) VALUES (?, ?, ?)";

        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/demo",
                        "root",
                        "password"
                );

                PreparedStatement pstmt = conn.prepareStatement(sql)
        ) {

            pstmt.setInt(1, 101);
            pstmt.setString(2, "Alice");
            pstmt.setDouble(3, 60000.0);

            int rowsInserted = pstmt.executeUpdate();

            System.out.println(rowsInserted + " row(s) inserted.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
