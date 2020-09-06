package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Validate {
	
	public WebDriver driver;
	 
//By.ByCssSelector("a[href*='sign in']");
//By btn =By.xpath("//button[text()='NO THANKS']");
//By button =By.xpath("//button[text()='NO THANKS']");


By vatext = By.xpath("//div[class ='cloudflare']/h3");



//By.ByXPath("//a[contains(@href=")

public Validate(WebDriver driver) {
	
	this.driver=driver;
	
	// TODO Auto-generated constructor stub
}




/*public WebElement getpop()
{
return driver.findElement(btn); 
 
}*/

public WebElement gettext()
{

 
return driver.findElement(vatext);
}



}
