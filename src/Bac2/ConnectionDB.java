package Bac2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    private static final String URL = "jdbc:sqlserver://DESKTOP-CFIUC99:1433;databaseName=RESULTDB;user=sa;password=123456;encrypt=false;";

    // Phương thức để lấy kết nối đến cơ sở dữ liệu
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL);
    }

    public static void main(String[] args) {
        // Kiểm tra kết nối
        try (Connection conn = getConnection()) {
            System.out.println("Kết nối thành công!");
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
