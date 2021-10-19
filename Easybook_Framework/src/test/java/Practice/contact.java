package Practice;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class contact {
	
	@Test
	public void org(XmlTest xml) {
		
		System.out.println("execute 1");
		String Url = xml.getParameter("url");
		String Un = xml.getParameter("username");
		System.out.println(Url);
		System.out.println(Un);
	}

}
