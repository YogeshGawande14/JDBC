import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class jdbc_001 {
    private static final String URL = "jdbc:mysql://localhost:3306/?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "yogesh@2004";

    public static void main(String[] args) {
        System.out.println("Connecting to MySQL..(in progress)..");

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SHOW DATABASES;")) {

            System.out.println("Connected successfully!\n");
            System.out.println("Available Databases:");

            while (rs.next()) {
                System.out.println("- " + rs.getString(1));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}