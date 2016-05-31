package databas;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class DB
{
 
  public static void main(String[] args)
  {
    try
    {
      // create a java mysql database connection
      String myDriver = "org.gjt.mm.mysql.Driver";
      String myUrl = "jdbc:mysql://localhost/bussbolag";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "root", "");
     
      // create the java mysql update preparedstatement
      String query = "update users set num_points = ? where first_name = ?";
      PreparedStatement preparedStmt = conn.preparedStmt(query);
      preparedStmt.setInt   (1, 6000);
      preparedStmt.setString(2, "Fred");
 
      // execute the java preparedstatement
      preparedStmt.executeUpdate();
       
      conn.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
  }
}