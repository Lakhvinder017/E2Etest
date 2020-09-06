package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {
	
	public WebDriver driver;
	 
//By.ByCssSelector("a[href*='sign in']");
//By btn =By.xpath("//button[text()='NO THANKS']");
//By button =By.xpath("//button[text()='NO THANKS']");


By signin = By.cssSelector("a[href*='sign_in']");

//By.ByXPath("//a[contains(@href=")

public Landingpage(WebDriver driver) {
	
	this.driver=driver;
	
	// TODO Auto-generated constructor stub
}




/*public WebElement getpop()
{
return driver.findElement(btn); 
 
}*/

public WebElement getlogin()
{

 
return driver.findElement(signin);
}



}
