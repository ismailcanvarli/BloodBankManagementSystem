import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBHelper {
    static String username = "root";
    static String password = "12345";
    static String dbUrl = "jdbc:mysql://localhost:3306/"
            + "blood_bank_management_system";
    
   public Connection getConnection() throws SQLException{
       return(Connection) DriverManager.getConnection(dbUrl,username,password);
   }
   
   public void ShowError(SQLException execption){
       System.out.println("Error: " + execption.getMessage());
       System.out.println("Error Code: " + execption.getErrorCode());
   }
} 
