import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jdbc {

	public static void main(String[] args) {
		
		     Connection con = null;
	        PreparedStatement statement = null;

	        try {
	            // Load the MySQL JDBC driver
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // Establish connection to the database
	            con = DriverManager.getConnection("jdbc:mysql://localhost/myapp?" +
	                    "user=root&password=7530");

	            // SQL query for inserting data
	            String q = "INSERT INTO user(name, password, email, mobile) VALUES(?,?,?,?)";

	            // Prepare statement and set the values
	            statement = con.prepareStatement(q);
	            statement.setString(1, "Sujan");
	            statement.setString(2, "7530");
	            statement.setString(3, "sujan@gmail.com");
	            statement.setString(4, "984321881");

	            // Execute the query
	            statement.executeUpdate();
	            System.out.println("Record inserted successfully!");

	        } catch (ClassNotFoundException | SQLException e) {
	            // Handle exceptions
	            e.printStackTrace();
	        } finally {
	            try {
	                if (statement != null) {
	                    statement.close();  // Close PreparedStatement
	                }
	                if (con != null) {
	                    con.close();  // Close Connection
	                }
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	
	}

}