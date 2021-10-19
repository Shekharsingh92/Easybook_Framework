package testScript;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_02CreateContact {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
		//Login page//
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		//Click on Contact//
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		//Create conatct//
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		
		//Fill form//
		WebElement el = driver.findElement(By.name("salutationtype"));
		
		Select s = new Select(el);
		
		s.selectByVisibleText("Mr.");
		
		driver.findElement(By.name("firstname")).sendKeys("Manoj");
		
		driver.findElement(By.name("lastname")).sendKeys("Kumar");
		
		driver.findElement(By.xpath("//img[@onclick='return window.open(\"index.php?module=Accounts&action=Popup&popuptype=specific_contact_account_address&form=TasksEditView&form_submit=false&fromlink=&recordid=\",\"test\",\"width=640,height=602,resizable=0,scrollbars=0\");']")).click();
		
		Set<String> windowhandle = driver.getWindowHandles();
		
		Iterator<String> iterator = windowhandle.iterator();
		String parent = iterator.next();
		String child = iterator.next();
		
		driver.switchTo().window(child);
		
		driver.findElement(By.xpath("//a[text()='Streetpop pvt ltd']")).click();
		
		driver.switchTo().window(parent);

		
		driver.findElement(By.id("assistant")).sendKeys("958");
		
		driver.findElement(By.id("jscal_field_support_start_date")).sendKeys("2021-09-29");
		driver.findElement(By.id("jscal_field_support_end_date")).sendKeys("2022-10-01");
		
		
		driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
		
		
		
		

	}

}
