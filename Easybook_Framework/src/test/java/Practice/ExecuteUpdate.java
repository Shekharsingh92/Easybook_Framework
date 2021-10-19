package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ExecuteUpdate {
	
	@Test
	public void executeQuery() throws Throwable {
		Connection con =null;
	
		// reguster the database
		try {
		Driver driverref = new Driver();
		DriverManager.registerDriver(driverref);
		
		//establish connection with database
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customers", "root", "root");
		
		//issue create statement
		Statement stat = con.createStatement();
		//execute the query
		int result=stat.executeUpdate("insert into custome values('6','manaoj','prabhakar','Delhi')");
		if(result==1)
		{
			System.out.println("customer is created sucessfully");
		}
		else
		{
			System.out.println("Query failed");
		}
		}
		catch (Exception e) {
			
		}
		finally {
			con.close();
		}
		
	}
}
	
		

