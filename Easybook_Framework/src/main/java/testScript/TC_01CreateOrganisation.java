package testScript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.crm.vtiger.GenericUtils.ExcelUtility;
import com.crm.vtiger.GenericUtils.Fileutility;
import com.crm.vtiger.GenericUtils.WebDriverUtility;
import com.crm.vtiger.GenericUtils.javaUtility;

public class TC_01CreateOrganisation {
	
	private static final String Sheet1 = null;

	public static void main(String[] args) throws InterruptedException, IOException {
		

	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.get(url);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Fileutility file = new Fileutility();
		String url=file.getPropertykeyvalue("url");
		driver.get(url);
		String username = file.getPropertykeyvalue("username");
		String password = file.getPropertykeyvalue("password");
		
		
		//Login page//
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		
		//Click on Organisation//
		driver.findElement(By.linkText("Organizations")).click();
		
		//Click on radio button//
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		
        //select the organisation		
		ExcelUtility ex = new ExcelUtility();
		
		String org = ex.getExcelData("Sheet1", 1, 1);
		driver.findElement(By.name("accountname")).sendKeys(org+javaUtility.getRandomData());
		
		//Select from dropdown
		WebElement ele=driver.findElement(By.name("assigned_user_id"));
		
		WebDriverUtility util = new WebDriverUtility();
		
		util.SelectOption(ele, 0);
		
	//	Select s = new Select(ele);
		
		
	//	s.selectByIndex(0);
		
		
		//Save the Organisation
		driver.findElement(By.xpath("//input[@class='crmbutton small save'][1]")).click();
		
		//Logout button
		Thread.sleep(3000);
       WebElement el = driver.findElement(By.xpath("(//img[@style='padding: 0px;padding-left:5px'])[1]"));
	    //   WebElement el = driver.findElement(By.xpath("(//td[@valign='bottom'])[2]"));
	       
	       util.mouseOver(driver, el);
		
		
		//Actions a = new Actions(driver);
		
	 //  a.moveToElement(el).perform();
	
		
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		
		
		
		
		
		
		
		
		
	
		
	}
		
	}
