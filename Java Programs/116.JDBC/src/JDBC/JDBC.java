/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JDBC;

import java.sql.*;

public class JDBC {

    public static Connection connectDB() {

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
    }

    public static void main(String[] args) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        con = connectDB();
        System.out.println("con" + con);
        String sql = "insert into  student (name, address, department,phone,uname,password) values('a','abc','cse','123456','uname','password')";
        ps = con.prepareStatement(sql);
        ps.execute();
    }

}
