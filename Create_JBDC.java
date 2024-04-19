import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class Create_JBDC {
    public static void main(String[] args)  throws Exception{
        try {
            String url = "jdbc:mysql://localhost:3306/";
            String databaseName = "DB";
            String userName = "root";
            String password = "Mohit12";
            Connection connection = DriverManager.getConnection(url, userName, password);
            String sql = "CREATE DATABASE" + databaseName;
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();
            JOptionPane.showMessageDialog(null, statement, sql, 0);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
