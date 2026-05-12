import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Unit6_Lec38_Q6{
    public static void main(String[] args) {

        try {

            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/demo",
                "root",
                "password"
            );

            conn.setAutoCommit(false);

            String sql1 =
                "UPDATE employees SET salary = salary + 5000 WHERE id = 101";

            String sql2 =
                "UPDATE employees SET salary = salary - 5000 WHERE id = 102";

            PreparedStatement pstmt1 = conn.prepareStatement(sql1);
            PreparedStatement pstmt2 = conn.prepareStatement(sql2);

            try {

                pstmt1.executeUpdate();
                pstmt2.executeUpdate();

                conn.commit();

                System.out.println("Transaction committed.");

            } catch (Exception e) {

                conn.rollback();

                System.out.println("Transaction rolled back.");

                e.printStackTrace();
            }

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}