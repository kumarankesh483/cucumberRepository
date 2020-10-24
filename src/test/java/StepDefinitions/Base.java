package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	
	public static WebDriver getDriver()
	{
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", ""+path+"\\src\\main\\java\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		return driver;
		
	}

}
