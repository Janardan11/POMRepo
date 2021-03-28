package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.loginpage;
 

public class loginpageTest {

	

	WebDriver driver;
	
	loginpage page;
	
	@BeforeTest
	public void setup()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Chrome Driver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/index.html");
		
		driver.manage().window().maximize();
		page=new loginpage(driver);
		
	}
	
	@Test
	public void validationpage()
	{
		
		String title="CRMPRO  - CRM software for customer relationship management, sales, and support.";
		
		boolean res=page.validationpage(title, driver);
		Assert.assertTrue(res);
		
	}
}
