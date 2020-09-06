package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	
	public WebDriver driver;
	 
//By.ByCssSelector("a[href*='sign in']");
//By btn =By.xpath("//button[text()='NO THANKS']");
//By button =By.xpath("//button[text()='NO THANKS']");


By email = By.xpath("//input[@id='user_email']");

By password = By.xpath("//input[@id='user_password']");

By logbtn = By.xpath("//input[@value='Log In']");



//By.ByXPath("//a[contains(@href=")

public Loginpage(WebDriver driver) {
	
	this.driver=driver;
	
	// TODO Auto-generated constructor stub
}




/*public WebElement getpop()
{
return driver.findElement(btn); 
 
}*/

public WebElement getemail()
{

return driver.findElement(email);
}

public WebElement getpassword()
{

return driver.findElement(password);
}
public WebElement getplgn()
{

return driver.findElement(logbtn);
}

}
