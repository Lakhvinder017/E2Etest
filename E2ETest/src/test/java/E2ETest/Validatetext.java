package E2ETest;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.Landingpage;
import pageObjects.Loginpage;
import pageObjects.Validate;
import resources.Base;

public class Validatetext extends Base {

	@Test(dataProvider = "getData")

	public void pagenavigation(String Username, String Password) throws IOException, InterruptedException {
		
         driver = initializeDriver();
		
		driver.get("http://rahulshettyacademy.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Landingpage login = new Landingpage(driver);
		
		
		// login.getpop().click();
		login.getlogin().click();
		Loginpage lgn = new Loginpage(driver);
		lgn.getemail().sendKeys(Username);
		lgn.getpassword().sendKeys(Password);
		lgn.getplgn().click();
		
	Validate text= new Validate(driver);
	
	System.out.println(text.gettext().getText());
	
	}
	
	@DataProvider

	public Object[][] getData() {
		Object[][] data = new Object[1][2];
		data[0][0] = "Lakhvinde117@gmail.com";
		data[0][1] = "Survee126";

		
		return data;

	}
	

}
