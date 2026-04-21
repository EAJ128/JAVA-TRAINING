import java.sql.*;
public class DBConnection {
    public static void main(String[] args) 
    {
        try{
            final Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/student",
            "Joel",
            "Joel@2006."
            );
            System.out.println("Connected to the database successfully!");
        } 
        catch (SQLException e) 
        {
            System.out.println("Connection failed: " + e.getMessage());
        }
    }
}