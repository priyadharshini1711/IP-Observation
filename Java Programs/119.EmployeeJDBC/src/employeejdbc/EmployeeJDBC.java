package employeejdbc;

import java.sql.*;

public class EmployeeJDBC {

    public static void main(String[] args) {
        try {

            //connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc", "root",
                    "root");
            System.out.println("Connection established.");

            //insert record
            String sql = "INSERT INTO employee (name, dep) VALUES (?, ?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, "def");
            statement.setString(2, "cse");
            statement.executeUpdate();
            System.out.println("Record created.");

            //read record
            String sql_read = "SELECT id, name, dep FROM employee where id = ?";
            PreparedStatement statement_read = con.prepareStatement(sql_read);
            statement_read.setInt(1, 4);
            ResultSet result = statement_read.executeQuery();
            if (result.next()) {
                String column1 = result.getString("name");
                String column2 = result.getString("dep");
                int column3 = result.getInt("id");
                System.out.println("Column name: " + column1);
                System.out.println("Column dep: " + column2);
                System.out.println("Column id: " + column3);
            }

            //update record
            String sql_update = "UPDATE employee SET name = ?, dep = ? WHERE id = ?";
            PreparedStatement statement_update = con.prepareStatement(sql_update);
            statement_update.setString(1, "cde");
            statement_update.setString(2, "ece");
            statement_update.setInt(3, 8);
            statement_update.executeUpdate();
            System.out.println("Record updated.");

            //delete record
            String sql_delete = "DELETE FROM employee WHERE id = ?";
            PreparedStatement statement_delete = con.prepareStatement(sql_delete);
            statement_delete.setInt(1, 1);
            statement_delete.executeUpdate();
            System.out.println("Record deleted.");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
