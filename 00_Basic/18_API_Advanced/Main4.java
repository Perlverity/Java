import java.sql.*;

public class Main4 {
    public static void main(String[] args) {
        try {
            Class.forName("org.h2.Driver");
            String dburl = "jdbc:h2~/test";
            String sql = "INSERT INTO EMPLOYEES(name) VALUES('aoki')";
            Connection conn = DriverManager.getConnection(dburl);
            conn.createStatement().executeUpdate(sql);
            conn.close();
        } catch (Exception e) {

        }
    }
}
