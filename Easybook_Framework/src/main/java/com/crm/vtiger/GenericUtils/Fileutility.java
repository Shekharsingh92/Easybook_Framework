package com.crm.vtiger.GenericUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Fileutility {
	
	/**
	 * @author shekhar shivam
	 */
	/**
	 * this method is used to read data from properties & return the value bsed on the key specified
	 * @param key
	 * @return
	 * @throws IOException
	 */
	
	public String getPropertykeyvalue(String key) throws IOException {
		
		FileInputStream file = new FileInputStream(IPathConstant.PROPERTYFILEPATH);
		Properties prop = new Properties();
		prop.load(file);
		
		return prop.getProperty(key);
		
		
	}
	
	public String getDatafromJason(String jsonKey) throws IOException, ParseException {
		FileReader reader = new FileReader(IPathConstant.JSONFILEPATH);
		JSONParser parser = new JSONParser();
		Object object = parser.parse(reader);
		JSONObject jsonObject = (JSONObject) object;
		String value = jsonObject.get(jsonKey).toString();
		return value;
	}


}
