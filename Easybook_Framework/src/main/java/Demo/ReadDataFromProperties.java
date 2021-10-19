package Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadDataFromProperties {
	
	@Test
	public void readDataFromProperties() throws IOException {
		/*read the data from properties file*/
		/*Step1: get the java representation object of the physical file*/
		FileInputStream fis = new FileInputStream("./CommonData.Properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		/*Step2: Create an object of the properties class & load the all keys : value pair*/
		//*Step3: read the value using getproperty("key")
	String URL = pobj.getProperty("url");
	String BROWSER = pobj.getProperty("browser");
	String us = pobj.getProperty("username");
	String password = pobj.getProperty("password");
	System.out.println(URL);
	System.out.println(BROWSER);
	System.out.println(us);
	System.out.println(password);
		
	}
	
	
	

}
