package jdbc;

import java.sql.*;

public class LoginValidation {

    public static boolean validate(String regNo, String password) {
        boolean isValid = false;

        try {
            String url = "jdbc:mysql://localhost:3306/university";
            String user = "root";
            String pass = "";

            Connection conn = DriverManager.getConnection(url, user, pass);

            String sql = "SELECT * FROM students WHERE regNo = ? AND password = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, regNo);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            isValid = rs.next();

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return isValid;
    }
}
