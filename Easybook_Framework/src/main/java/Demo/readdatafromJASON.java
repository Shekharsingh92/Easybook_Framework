package Demo;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class readdatafromJASON {
	
	@Test
	public void readJason() throws IOException, ParseException {
		
		//read the dta from json file//
		FileReader file = new FileReader("./Data/commondata.json");
		// convert the json file into java object//
		JSONParser jsonobj = new JSONParser();
		Object jobj = jsonobj.parse(file);
		
		//type cast java ob to hashmap//
		HashMap map = (HashMap)jobj;
		
		String USERNAME = map.get("username").toString();
		System.out.println(USERNAME);
		String PASSWORD = map.get("password").toString();
		System.out.println(PASSWORD);
		String URL = map.get("url").toString();
		System.out.println(URL);
	}

}
