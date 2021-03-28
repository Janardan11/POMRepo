package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	

	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath = "//input[@type='submit']")
	
	WebElement  sub;
	
	public loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean validationpage(String title,WebDriver driver)
	{
		username.sendKeys("janardan");
		
		password.sendKeys("testing@1234");
		
		sub.click();
		
		String currenttitle=driver.getTitle();
		
		if(currenttitle.equals(title))
		{
			
			return true;
		}
		
		return false;
	}
	

}
