package Bac2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    public static void main(String[] args) {
        check2();
    }

    public static void check2() {
        String link = "jdbc:sqlserver://DESKTOP-CFIUC99:1433;databaseName=RESULTDB;user=sa;password=123456;encrypt=false;trustServerCertificate=true;";
        
        try (Connection conn = DriverManager.getConnection(link)) {
            System.out.println("Kết nối thành công!");
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
