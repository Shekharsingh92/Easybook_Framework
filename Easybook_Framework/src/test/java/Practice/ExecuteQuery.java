package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;


public class ExecuteQuery {
	
	@Test
	public void executeQuery() throws Throwable {
		// reguster the database
		
		Driver driverref = new Driver();
		DriverManager.registerDriver(driverref);
		
		//establish connection with database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customers", "root", "root");
		
		//issue create statement
		Statement stat = con.createStatement();
		//execute the query
		ResultSet result=stat.executeQuery("select * from customer;");
		while(result.next())
		{
			System.out.println(result.getString(2));
		}
		
	}
	

}
