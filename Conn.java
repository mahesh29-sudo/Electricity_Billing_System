import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {

	Connection c;
	Statement s;
	
	public Conn() {
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost/ebs","root","password");
			s = c.createStatement();
			
		} 
		catch (Exception e) {
			 System.out.println(e);
		}

		
	}

	
}
