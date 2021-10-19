package Practice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SamsungMobile {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("Samsung Mobile"+Keys.ENTER);
		
		
		List<WebElement> mob = driver.findElements(By.xpath("//div[contains(text(),'SAMSUNG Galaxy')]"));
		
		
		//for(WebElement m :mob) {
		//	String text = m.getText();
		//	System.out.println(text);
	//}
		mob.get(1).click();
		
	Set<String> parent = driver.getWindowHandles();
	
	Iterator<String> iterator= parent.iterator();
	
	String parentwindow=iterator.next();
	String childwindow=iterator.next();
	
	driver.switchTo().window(childwindow);
	
	 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	
	
	
		
		
	
		
		
			
			
		
		
		
		
		
	}
	
	

}
