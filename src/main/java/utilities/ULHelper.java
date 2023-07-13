/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static utilities.DBConnection.getConnection;

/**
 *
 * @author ADMIN
 */
public class ULHelper {
    private static Connection con = null;
    private static PreparedStatement st = null;
    public static final String url = "jdbc:sqlserver://localhost:1433;"
            + "DatabaseName=QuanLyCuaHangLaptop;encrypt=true;trustServerCertificate=true";

    public static Connection getConnection() {
        Connection connect = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (Exception e) {
            System.out.println("chua co driver");

        }
        try {
            connect = DriverManager.getConnection(url, "SA", "KhaiLamDIGITAL");
            return connect;
        } catch (Exception e) {
            System.out.println("sai ten database hoac pass");
        }
        return connect;
    }
    public static boolean checknull(JTextField c, String mss) {
        if (c.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, mss);
            c.requestFocus();
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        getConnection();
    }
}
