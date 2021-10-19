package Demo;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class ReadDataFromjasonFile {
	
	@Test
	public void getDataFromJson() throws IOException, ParseException {
		FileReader  reader = new FileReader("./Data/commondata.json");
		JSONParser parser = new JSONParser();
		Object object = parser.parse(reader);
		JSONObject jsonObject = (JSONObject)object;
		String Url = jsonObject.get("url").toString();
		String Browser = jsonObject.get("Browser").toString();
		String US = jsonObject.get("username").toString();
		String password = jsonObject.get("password").toString();
		System.out.println(Browser);
		System.out.println(Url);
		System.out.println(password);
		System.out.println(US);
	}
	

}
