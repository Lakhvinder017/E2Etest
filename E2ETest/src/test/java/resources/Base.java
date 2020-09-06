package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Lucky\\TestNgFramework\\E2ETest\\src\\test\\java\\resources\\data.properties");
		
	//System.setProperty("webdriver.chrome.driver', "C://Users/Lucky//Chromedriver.exe");
		
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Work\\Chromedriver.exe");
			 driver = new ChromeDriver();	
			
		}
		else if (browserName.equals("firefox"))
			
		{
			System.setProperty("webdriver.getco.driver", "C:\\Work\\Chromedriver.exe");
			 driver = new ChromeDriver();
			
		}
		
else if (browserName.equals("IE"))
			
		{
	System.setProperty("webdriver.internetexplorer.driver", "C:\\Work\\Chromedriver.exe");
	 driver = new ChromeDriver();
	
			
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	
	public void getScreenshotPath(String Testcasename, WebDriver driver)
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Source  = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir")+"\\reports\\"+Testcasename+".png";
		try {
			FileUtils.copyFile(Source,new File(destination));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
