import java.sql.*;

public class DatabaseExample {

   public static void main(String[] args) {
      try {
         // Load the JDBC driver
         Class.forName("com.mysql.cj.jdbc.Driver");

         // Establish a connection to the database
         String url = "jdbc:mysql://localhost:3306/password_manager";
         String username = "root";
         String password = "root";
         Connection conn = DriverManager.getConnection(url, username, password);

         // Create a statement
         Statement stmt = conn.createStatement();

         
         // Close the connection and statement objects
        
         stmt.close();
         conn.close();
      } catch (Exception ex) {
         ex.printStackTrace();
      }
   }
}



        