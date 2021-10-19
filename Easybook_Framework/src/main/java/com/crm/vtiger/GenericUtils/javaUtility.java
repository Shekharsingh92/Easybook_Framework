package com.crm.vtiger.GenericUtils;

import java.util.Date;
import java.util.Random;



public class javaUtility {
	/**
	 * @author shekhar shivam
	 */
	/**
	 * this method is to generate random method to avoid duplication
	 * @return
	 */
public static String getRandomData() {
	Random random = new Random();
	int ran = random.nextInt(1000);
	return ""+ran;
	
}
public static String getCurrentDate() {
	Date date = new Date();
	String currentdate = date.toString();
	return currentdate;
}
}
