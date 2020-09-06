package E2ETest;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.Landingpage;
import pageObjects.Loginpage;
import resources.Base;

public class Homepage extends Base {
@BeforeTest
	public void initialize() throws IOException, InterruptedException {
      driver = initializeDriver();
      String Url = prop.getProperty("url");
		driver.get("Url");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Thread.sleep(5000);	
	}
	@Test
	//(dataProvider = "getData")

	public void pagenavigation() throws IOException, InterruptedException {
		

		Landingpage login = new Landingpage(driver);
		String Username =prop.getProperty("username");
		String Password =prop.getProperty("password");
		// login.getpop().click();
		login.getlogin().click();
		Loginpage lgn = new Loginpage(driver);
		lgn.getemail().sendKeys("Username");
		lgn.getpassword().sendKeys("Password");
		lgn.getplgn().click();

	}
	

/*	@DataProvider

	public Object[][] getData() {
		Object[][] data = new Object[1][2];
		data[0][0] = "Lakhvinder17@gmail.com";
		data[0][1] = "Surveen16";

		return data;

	} */
	

}
