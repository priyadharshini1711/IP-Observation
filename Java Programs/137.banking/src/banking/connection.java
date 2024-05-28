package banking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
// Global connection Class

public class connection {

    static Connection con; // Global Connection Object

    public static Connection getConnection() {
        try {

            try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc",
                    "root", "root");
            return con;
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
            return null;
        }
        } catch (Exception e) {
            System.out.println("Connection Failed!");
        }

        return con;
    }
}
