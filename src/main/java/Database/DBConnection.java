package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection connection = null;
    private static final String DB_URL = "jdbc:mysql://127.0.0.1/knk_2025";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
                System.out.println("Lidhja ka pasur sukses!");
            } catch (SQLException e) {
                System.out.println("Gabim gjatë lidhjes me databazën!");
                e.printStackTrace();
            }
        }
        return connection;
    }

    public static void main(String[] args) {
        Connection conn = getConnection();
        if (conn != null) {
            System.out.println("Lidhja ka pasur sukses!");
        } else {
            System.out.println("Lidhja ka dështuar.");
        }
    }
}
